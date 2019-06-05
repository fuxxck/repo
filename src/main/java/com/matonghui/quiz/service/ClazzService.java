package com.matonghui.quiz.service;

import com.matonghui.quiz.domain.Clazz;
import com.matonghui.quiz.mapper.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;

    public List<Clazz> findAllClazz() {
        return clazzMapper.findAllClazz();
    }
}
