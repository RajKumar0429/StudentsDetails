package com.StudentsDetails.StudentsDetails.Repository;

import com.StudentsDetails.StudentsDetails.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Long> {

}
