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
        st.setFirstName(studentsDto.getFirstName());
        st.setLastName(studentsDto.getLastName());
        st.setEmailId(studentsDto.getEmailId());
        st.setContact(studentsDto.getContact());
        st.setAddress(studentsDto.getAddress());
        st.setDescription(studentsDto.getDescription());
        return st;
    }
}
