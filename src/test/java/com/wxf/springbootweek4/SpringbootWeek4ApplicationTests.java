package com.wxf.springbootweek4;

import com.wxf.springbootweek4.mapper.StudentMapper;
import com.wxf.springbootweek4.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootWeek4ApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test(){
        Student s = studentMapper.findStudentById(202001);
        System.out.println(s);
    }

}
