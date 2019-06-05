package com.matonghui.quiz.service;

import com.matonghui.quiz.domain.Student;
import com.matonghui.quiz.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectAll(String name, String phone, Integer clazzId) {
        return studentMapper.selectAll(name, phone, clazzId);
    }

    public int delStudent(Integer id) {
        return studentMapper.delStudent(id);
    }

    public int addStudent(String name, String phone, Integer clazzId) {
        return studentMapper.addStudent(name, phone, clazzId);
    }
}
