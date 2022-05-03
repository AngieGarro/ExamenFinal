package com.projectExam.ExamFinalSpring.repository;

import com.projectExam.ExamFinalSpring.entities.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {

}
