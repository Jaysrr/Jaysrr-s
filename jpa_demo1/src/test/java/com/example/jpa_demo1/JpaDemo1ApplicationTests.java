package com.example.jpa_demo1;

import com.example.jpa_demo1.domain.Teacher;
import com.example.jpa_demo1.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
class JpaDemo1ApplicationTests {
    @Autowired
    private TeacherService teacherService;
    @Test
    void contextLoads() {
//        Teacher teacher=new Teacher();
//        teacher.setCreateTime(new Date());
//        teacher.setImgUrl(UUID.randomUUID().toString());
//        teacher.setPassword(UUID.randomUUID().toString());
//        teacher.setUpdateTime(new Date());
//        teacher.setPhoneNumber(1321321651+"");
//        Teacher teacher1 = teacherService.addTeacher(teacher);
//        System.out.println(teacher1);
        Teacher teacherById = teacherService.findTeacherById(1L);
        System.out.println(teacherById);
    }

}
