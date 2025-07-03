package com.alisha.studentapi.controller;

import com.alisha.studentapi.model.Student;
import com.alisha.studentapi.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //I’m a class that handles REST API calls (like POST, GET, etc.) and returns JSON responses.
@RequestMapping("/students")//All APIs in this class will start with /students.
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping//This method handles POST requests (used to send data).
    public Student addStudent(@Valid @RequestBody Student student){//Take the JSON body coming from Postman and convert it into a Student object.
        return service.saveStudent(student);
    }
    //Getting All Students
    @GetMapping
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
    //Getting Students by their ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student=service.getStudentById(id);
        return ResponseEntity.ok(student);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student updatedStudent){
        Student st=service.updateStudent(id,updatedStudent);
        return ResponseEntity.ok(st);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok("Entry with id "+id+" has been deleted");
    }
}
