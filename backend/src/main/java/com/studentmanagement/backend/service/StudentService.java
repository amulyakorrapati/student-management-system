package com.studentmanagement.backend.service;

import com.studentmanagement.backend.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(String id);

    Student createStudent(Student student);

    Student updateStudent(String id, Student student);

    void deleteStudent(String id);
}
