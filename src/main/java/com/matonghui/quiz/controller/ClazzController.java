package com.matonghui.quiz.controller;

import com.matonghui.quiz.domain.Clazz;
import com.matonghui.quiz.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:8080", maxAge = 3600)
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @RequestMapping(value = "clazz", method = RequestMethod.GET)
    public ResponseEntity<?> selectClazz() {
        List<Clazz> clazzes = clazzService.findAllClazz();
        return new ResponseEntity<>(clazzes, HttpStatus.OK);
    }

}
