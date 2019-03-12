package com.lee.my_springboot.service.impl;

import com.lee.my_springboot.domain.Student;
import com.lee.my_springboot.repository.StudentRepository;
import com.lee.my_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> queryStuList() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStuList(Student student) {
        return studentRepository.save(student);
    }
}
