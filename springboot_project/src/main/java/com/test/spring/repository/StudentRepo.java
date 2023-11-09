package com.test.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spring.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
