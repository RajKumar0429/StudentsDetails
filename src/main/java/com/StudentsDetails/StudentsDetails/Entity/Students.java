package com.StudentsDetails.StudentsDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   private String firstName;
   private String lastName;
   private String emailId;
   private String contact;
   private String address;
   private String description;


}

