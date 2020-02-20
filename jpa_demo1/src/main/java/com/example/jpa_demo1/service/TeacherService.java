package com.example.jpa_demo1.service;

import com.example.jpa_demo1.domain.Teacher;
import com.example.jpa_demo1.domain.User;

public interface TeacherService {
    Teacher addTeacher(Teacher teacher);
    Teacher findTeacherById(Long id);

}
