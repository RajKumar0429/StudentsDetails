package com.StudentsDetails.StudentsDetails.Service;


import com.StudentsDetails.StudentsDetails.Payload.StudentsDto;

public interface StudentsService {
    StudentsDto saveStudents(StudentsDto studentsDto);

    String deleteStudents(long id);

    StudentsDto updateStudents(long id, StudentsDto studentsDto);
}
