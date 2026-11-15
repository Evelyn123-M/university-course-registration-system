package com.university.university.model;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;



@Entity
public class Lecturer{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(mappedBy = "lecturers")
    private Set<Course> courses = new
    HashSet<>();
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Lecturer () {}
    
    public String getEmail() { return email; }
    public void setEmail(String email)
    {this.email = email;}

    public Department getDepartment(){return department;}
    public void setDepartment(Department department){this.department = department;}

    public Set<Course> getCourse() { return courses;}
    public void setCourses(Set<Course>courses){this.courses = courses;}
}