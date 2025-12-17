package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import 
import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRespository;
import com.example.demo.service.StudentService;

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRespository sr;
    @Override
    public Student postStudent(student s){
        return 
    }
}