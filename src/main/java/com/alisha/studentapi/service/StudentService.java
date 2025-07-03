package com.alisha.studentapi.service;

import com.alisha.studentapi.model.Student;
import com.alisha.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Hey Spring! This is a service class — manage it automatically for me.
public class StudentService {

    @Autowired//Spring, please give me an object of StudentRepository — I need it to do my job
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).
                orElseThrow(()->new RuntimeException("Student not found with this id."));
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent=repository.findById(id).
                orElseThrow(()->new RuntimeException("Student not found with this id."));
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setEmail(updatedStudent.getEmail());
        return repository.save(existingStudent);
    }

    public void deleteById(Long id) {
        Student student=repository.findById(id)
                .orElseThrow(()->new RuntimeException("Id not found."));
        repository.delete(student);
    }


}
