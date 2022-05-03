package com.projectExam.ExamFinalSpring.repository;

import com.projectExam.ExamFinalSpring.entities.RegLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistLibroRepository extends JpaRepository<RegLibros, Long> {
}
