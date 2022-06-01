package com.student_management_system.studentmanagementsystem.impl;

import com.student_management_system.studentmanagementsystem.Service.StudentService;
import com.student_management_system.studentmanagementsystem.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import com.student_management_system.studentmanagementsystem.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
    
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id){
        studentRepository.deleteById(id); 
    }    
}
