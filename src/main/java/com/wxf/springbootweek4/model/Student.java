package com.wxf.springbootweek4.model;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    private int sid;
    private String sname;
    private int age;
    private String sclass;
    private String sex;
    private String phone;
    private String contactinfo;

}
