package com.example.jpa_demo1.repository;

import com.example.jpa_demo1.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findTeacherById(Long id);

    @Query(value = "SELECT * from t_teacher where id=:id",nativeQuery = true)
    Teacher findTeacherByNum(Long id);
}
