package com.enosh.rel.repo;

import com.enosh.rel.entities.Course;
import com.enosh.rel.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
