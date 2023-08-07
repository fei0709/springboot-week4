package com.wxf.springbootweek4.mapper;

import com.wxf.springbootweek4.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper
public interface StudentMapper {

    @Select("select * from student where sid = #{id};")
    public Student findStudentById(@Param("id") int id);
}
