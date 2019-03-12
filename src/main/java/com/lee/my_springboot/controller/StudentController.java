package com.lee.my_springboot.controller;

import com.lee.my_springboot.domain.Student;
import com.lee.my_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("queryStu")
    public List<Student> queryStu(){
        return studentService.queryStuList();
    }
    @PostMapping("saveStu")
    public Student saveStu(Student student){
        return studentService.saveStuList(student);
    }

}
