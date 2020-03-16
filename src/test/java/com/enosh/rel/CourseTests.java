package com.enosh.rel;

import com.enosh.rel.entities.Course;
import com.enosh.rel.entities.Lecturer;
import com.enosh.rel.repo.CourseRepository;
import com.enosh.rel.repo.LecturerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.Optional;

@ActiveProfiles(profiles = "dev")
@SpringBootTest
class CourseTests {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private LecturerRepository lecturerRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void create() {
//        Optional<Lecturer> maybe = lecturerRepository.findById(2L);
//        if (maybe.isPresent()) {
//            Lecturer lecturer = maybe.get();
//            Course course1 = new Course("guitar", lecturer);
//            Course course2 = new Course("piano", lecturer);
//            Course course3 = new Course("violin", lecturer);
//
//            for (Course course : Arrays.asList(course1, course2, course3)) {
//                courseRepository.save(course);
//            }
//        }
    }

    @Test
    void deleteCourse() {
//        courseRepository.deleteById(3L);
    }

    @Test
    void deleteLecturer() {
        lecturerRepository.deleteById(2L);
    }

    @Test
    void find() {
//        System.out.println(repository.findByLecturerContactEmail("enosh@gmail.com").get());
    }
}
