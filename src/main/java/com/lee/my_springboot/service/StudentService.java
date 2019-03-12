package com.lee.my_springboot.service;

import com.lee.my_springboot.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> queryStuList();

    Student saveStuList(Student student);
}
