package com.StudentsDetails.StudentsDetails.Controller;

import com.StudentsDetails.StudentsDetails.Payload.StudentsDto;
import com.StudentsDetails.StudentsDetails.Service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @PostMapping("/save")
    public ResponseEntity<StudentsDto> saveStudents(@RequestBody StudentsDto studentsDto){
     StudentsDto dto=studentsService.saveStudents(studentsDto);
     return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
}
