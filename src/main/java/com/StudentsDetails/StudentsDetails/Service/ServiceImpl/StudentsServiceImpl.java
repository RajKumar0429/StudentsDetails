package com.StudentsDetails.StudentsDetails.Service.ServiceImpl;

import com.StudentsDetails.StudentsDetails.Entity.Students;
import com.StudentsDetails.StudentsDetails.Payload.StudentsDto;
import com.StudentsDetails.StudentsDetails.Repository.StudentsRepository;
import com.StudentsDetails.StudentsDetails.Service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService {
   @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public StudentsDto saveStudents(StudentsDto studentsDto) {
        Students std = new Students();
        std.setFirstName(studentsDto.getFirstName());
        std.setLastName(studentsDto.getLastName());
        std.setEmailId(studentsDto.getEmailId());
        std.setContact(studentsDto.getContact());
        std.setAddress(studentsDto.getAddress());
        std.setDescription(studentsDto.getDescription());

        Students student = studentsRepository.save(std);

        StudentsDto st = new StudentsDto();
        st.setId(student.getId());
        st.setFirstName(student.getFirstName());
        st.setLastName(student.getLastName());
        st.setEmailId(student.getEmailId());
        st.setContact(student.getContact());
        st.setAddress(student.getAddress());
        st.setDescription(student.getDescription());
        return st;
    }

    @Override
    public String deleteStudents(long id) {
         Students std = studentsRepository.findById(id).get();
         studentsRepository.deleteById(id);

         return "record deleted";

    }

    @Override
    public StudentsDto updateStudents(long id, StudentsDto studentsDto) {
        Students sd = studentsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        sd.setFirstName(studentsDto.getFirstName());
        sd.setLastName(studentsDto.getLastName());
        sd.setEmailId(studentsDto.getEmailId());
        sd.setContact(studentsDto.getContact());
        sd.setAddress(studentsDto.getAddress());
        sd.setDescription(studentsDto.getDescription());

        Students sde = studentsRepository.save(sd);

        StudentsDto dto = new StudentsDto();
        dto.setId(sde.getId());
        dto.setFirstName(sde.getFirstName());
        dto.setLastName(sde.getLastName());
        dto.setEmailId(sde.getEmailId());
        dto.setContact(sde.getContact());
        dto.setAddress(sde.getAddress());
        dto.setDescription(sde.getDescription());

        return dto;
    }

}

