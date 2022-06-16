package com.gather_students.homwork.reponsitories;

import com.gather_students.homwork.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentReponsitory extends JpaRepository<Student, String> {

}
