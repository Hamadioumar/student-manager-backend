package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
  Optional<Student> findStudentByEmail(String email);
}
