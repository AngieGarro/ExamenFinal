package com.projectExam.ExamFinalGraphQL.repository;

import com.projectExam.ExamFinalGraphQL.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
