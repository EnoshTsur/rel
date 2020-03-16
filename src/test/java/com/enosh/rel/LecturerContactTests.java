package com.enosh.rel;

import com.enosh.rel.repo.LecturerContactRepository;
import com.enosh.rel.repo.LecturerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(profiles = "dev")
@SpringBootTest
class LecturerContactTests {

    @Autowired
    private LecturerContactRepository repository;

    @Test
    void contextLoads() { }

    @Test
    void find(){
        System.out.println(repository.findByLecturerFirstName("enosh").get().getLecturer());
    }
    @Test
    void delete(){
//        repository.deleteById(3L);
    }
}
