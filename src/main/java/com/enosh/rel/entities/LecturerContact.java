package com.enosh.rel.entities;

import javax.persistence.*;

@Entity
@Table(name = "lecturer_contact")
public class LecturerContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "site")
    private String site;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @OneToOne(mappedBy = "lecturerContact", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lecturer lecturer;



    public LecturerContact(Long id, String site, String email) {
        this.id = id;
        this.site = site;
        this.email = email;
    }

    public LecturerContact(String site, String email) {
        this.site = site;
        this.email = email;
    }
    public LecturerContact(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "LecturerContact{" +
                "id=" + id +
                ", site='" + site + '\'' +
                ", email=" + email +
                '}';
    }
}
