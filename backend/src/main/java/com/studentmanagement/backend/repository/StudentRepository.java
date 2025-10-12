package com.studentmanagement.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.studentmanagement.backend.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
