package com.enosh.rel.repo;

import com.enosh.rel.entities.Lecturer;
import com.enosh.rel.entities.LecturerContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LecturerContactRepository extends CrudRepository<LecturerContact, Long> {

    Optional<LecturerContact> findByLecturerFirstName(String firstName);
}
