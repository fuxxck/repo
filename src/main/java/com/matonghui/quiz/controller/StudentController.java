package com.matonghui.quiz.controller;

import com.matonghui.quiz.domain.Student;
import com.matonghui.quiz.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:8080", maxAge = 3600)
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    public ResponseEntity<?> selectAll(@RequestParam("name") String name,
                                       @RequestParam("phone") String phone,
                                       @RequestParam("clazzId") Integer clazzId
    ) {
        List<Student> students = studentService.selectAll(name, phone, clazzId);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @RequestMapping(value = "delStudent", method = RequestMethod.DELETE)
    public ResponseEntity<Integer> delStudent(@RequestParam("id") Integer id) {
        int count = studentService.delStudent(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @RequestMapping(value = "addStudent", method = RequestMethod.POST)
    public ResponseEntity<Integer> addStudent(@RequestParam("name") String name,
                                              @RequestParam("phone") String phone,
                                              @RequestParam("clazzId") Integer clazzId) {
        int count = studentService.addStudent(name, phone, clazzId);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }
}
