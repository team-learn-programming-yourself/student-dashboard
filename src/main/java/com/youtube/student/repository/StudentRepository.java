package com.youtube.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube.student.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
