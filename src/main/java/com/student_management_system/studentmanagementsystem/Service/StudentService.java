package com.student_management_system.studentmanagementsystem.Service;

import java.util.List;

import com.student_management_system.studentmanagementsystem.Entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
