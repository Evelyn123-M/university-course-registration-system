package com.university.university.model;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class StudentProfile{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String residentialAddress;

    @OneToOne 
    @JoinColumn(name ="student_id", nullable =  false, unique = true)
    private Student student;
    private StudentProfile(){}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getResidentialAddress() {
        return residentialAddress;
    }
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }
    public Student getStudent() {return student;}
    public void setStudent(Student student){this.student = student;}



}
