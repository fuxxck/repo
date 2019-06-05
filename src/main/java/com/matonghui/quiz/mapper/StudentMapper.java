package com.matonghui.quiz.mapper;

import com.matonghui.quiz.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    public List<Student> selectAll(@Param("name") String name,
                                   @Param("phone") String phone,
                                   @Param("clazzId") Integer clazzId);

    @Delete("delete from student where id=#{id}")
    public int delStudent(Integer id);

    @Insert("insert into student(name,phone,clazz_id) values(#{name},#{phone},#{clazzId})")
    public int addStudent(@Param("name") String name,
                          @Param("phone") String phone,
                          @Param("clazzId") Integer clazzId);
}
