package com.projectExam.ExamFinalSpring.repository;

import com.projectExam.ExamFinalSpring.entities.Encargado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncargadoRepository extends JpaRepository<Encargado, Long>{
}
