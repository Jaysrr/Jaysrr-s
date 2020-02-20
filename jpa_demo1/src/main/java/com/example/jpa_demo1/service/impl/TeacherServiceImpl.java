package com.example.jpa_demo1.service.impl;

import com.example.jpa_demo1.domain.Teacher;
import com.example.jpa_demo1.repository.TeacherRepository;
import com.example.jpa_demo1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher findTeacherById(Long id) {
        return teacherRepository.findTeacherByNum(id);
    }
}
