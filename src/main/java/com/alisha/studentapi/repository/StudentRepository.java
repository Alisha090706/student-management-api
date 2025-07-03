package com.alisha.studentapi.repository;

import com.alisha.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    //I know where and how to store/retrieve student data from the database. You (service layer) just tell me what you want.

    //why interface?-->I’m not going to write the full code — I’ll just say what I want to do. Someone else (Spring) will write it for me behind the scenes

    //why extends?-->This repository will handle Student objects and their primary key is of type Long.
}
