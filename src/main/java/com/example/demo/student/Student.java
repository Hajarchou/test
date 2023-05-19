package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private long id;



    private String name;
    private String email;

    private Integer age;
    private LocalDate dob;

    public Student(String name, String email, long id, Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
        this.dob = dob;
    }
    public Student(String name, String email,  Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;

        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
