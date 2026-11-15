package com.university.university.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Entity
public class Course{
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, unique = true)
private String code;

@Column(nullable = false)
private String title;

private int credits;

@ManyToOne
@JoinColumn(name = "department_id")
private Department department;

@ManyToMany
@JoinTable (
    name= "lecturer_course",
    joinColumns = @JoinColumn(name = "course_id"),
    inverseJoinColumns = @JoinColumn(name= "lecturer_id")
)
private Set<Lecturer> lecturers = new HashSet<>();

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getCode() {
    return code;
}

public void setCode(String code) {
    this.code = code;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public int getCredits() {
    return credits;
}

public void setCredits(int credits) {
    this.credits = credits;
}

public Department getDepartment() {
    return department;
}

public void setDepartment(Department department) {
    this.department = department;
}

public Set<Lecturer> getLecturers() {
    return lecturers;
}

public void setLecturers(Set<Lecturer> lecturers) {
    this.lecturers = lecturers;
}

public List<Registration> getRegistration() {
    return registration;
}

public void setRegistration(List<Registration> registration) {
    this.registration = registration;
}

@OneToMany(mappedBy= "course")
private List<Registration> registration = new ArrayList<>();

}