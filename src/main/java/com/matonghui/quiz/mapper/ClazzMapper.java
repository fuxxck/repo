package com.matonghui.quiz.mapper;

import com.matonghui.quiz.domain.Clazz;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClazzMapper {

    @Select("select * from clazz")
    public List<Clazz> findAllClazz();
}
