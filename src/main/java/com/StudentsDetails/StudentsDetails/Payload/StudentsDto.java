package com.StudentsDetails.StudentsDetails.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsDto {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String contact;
    private String address;
    private String description;

}
