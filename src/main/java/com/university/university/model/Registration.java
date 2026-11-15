package com.university.university.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity 
@Table (uniqueConstraints = @UniqueConstraint(columnNames = {"student_id", "course_id","academic_year","semester"}))

public class Registration {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn (name = "student_id")
    private Student student;
    @ManyToOne(optional = false)
    @JoinColumn (name = "course_id" )
    private Course course;
    private LocalDate registrationDate;

    @Column (name = "academic_year")
        private String academicYear;

        private String semester;

        @Enumerated(EnumType.STRING)
        private RegistrationStatus status= RegistrationStatus.PENDING;

        private Double grade;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public Course getCourse() {
            return course;
        }

        public void setCourse(Course course) {
            this.course = course;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
        }

        public String getAcademicYear() {
            return academicYear;
        }

        public void setAcademicYear(String academicYear) {
            this.academicYear = academicYear;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public RegistrationStatus getStatus() {
            return status;
        }

        public void setStatus(RegistrationStatus status) {
            this.status = status;
        }

        public Double getGrade() {
            return grade;
        }

        public void setGrade(Double grade) {
            this.grade = grade;
        }
        
    
}
