package com.enosh.rel.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lecturer")
public class Lecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "lecturer_contact_id")
    private LecturerContact lecturerContact;

    @OneToMany(mappedBy = "lecturer", cascade = CascadeType.REMOVE)
    private List<Course> course;

    public Lecturer(){}

    public Lecturer(String firstName, String lastName, LecturerContact lecturerContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lecturerContact = lecturerContact;
    }

    public Lecturer(Long id, String firstName, String lastName, LecturerContact lecturerContact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lecturerContact = lecturerContact;
    }

    public Lecturer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LecturerContact getLecturerContact() {
        return lecturerContact;
    }

    public void setLecturerContact(LecturerContact lecturerContact) {
        this.lecturerContact = lecturerContact;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lecturerContact=" + lecturerContact +
                '}';
    }
}
