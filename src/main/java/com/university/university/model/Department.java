package com.university.university.model;
import jakarta.persistence.*;
import java.util.ArrayList;

import java.util.List;

@Entity
public class Department{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false, unique = true)
    private String name;
    private  String code;
@OneToOne
@JoinColumn (name = "head_id")
private Lecturer head;

@OneToMany(mappedBy = "department")
private List<Course> courses = new
ArrayList<>();

@OneToMany(mappedBy = "department")
private List<Lecturer> lecturers = new 
ArrayList<>();

@OneToMany(mappedBy = "department")
private List<Student> students = new
ArrayList<>();

public Department(){}
    public Long getId() {return id; }
    public void setId(Long id) {this.id = id;}

    public String getName() { return name;}
    public void setName(String name)
    { this.name= name; }

    public String getCode() { return code; }
    public void SetCode(String code)
    {this.code= code;}

    public Lecturer getHead() {return head;}
    public void setHead(Lecturer head)
    {this.head=head;}

    public List<Course> getCourses() {return courses;}
    public void setCourses(List<Course> Courses)
    {this.courses = Courses;}

    public List<Lecturer> getLecturers()
    {return lecturers;}
    public void setLecturers(List<Lecturer>lecturers)
    {this.lecturers = lecturers;}

    public List<Student>getStudents()
        {return students;}
        public void setStudents(List<Student> students)
        {this.students = students;}
}
    


 
