package com.alisha.studentapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity //Hey Spring! This class represents a table in the database
@Table(name="student") //Create or use a table called students in the database.

public class Student {

    //This is your blueprint for a student — what fields we want to store in the database.

    @Id//This field is the primary key in the database.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Let the database auto-generate the value for id.

    private long id;
    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is Required")
    private String email;

    @Min(value = 1,message = "Minimum value for age should be 1.")
    @Max(value=120,message = "Age should be realistic.")
    private int age;

    //Getters And Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
