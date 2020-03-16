package com.enosh.rel;

import com.enosh.rel.entities.Lecturer;
import com.enosh.rel.entities.LecturerContact;
import com.enosh.rel.repo.LecturerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(profiles = "dev")
@SpringBootTest
class LecturerTests {

    @Autowired
    private LecturerRepository repository;

    @Test
    void contextLoads() { }

    @Test
    void create(){
//        LecturerContact lecturerContact =
//                new LecturerContact("www.dudy.com", "dudy@gmail.com");
//        Lecturer lecturer = new Lecturer("dudy", "dudon", lecturerContact);
//
//        repository.save(lecturer);
    }

    @Test
    void delete(){
//        repository.deleteById(4L);
    }

    @Test
    void find(){
        System.out.println(repository.findByLecturerContactEmail("enosh@gmail.com").get());
    }
}
