package com.student_management_system.studentmanagementsystem.Repository;

import com.student_management_system.studentmanagementsystem.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Long> {
    
}
