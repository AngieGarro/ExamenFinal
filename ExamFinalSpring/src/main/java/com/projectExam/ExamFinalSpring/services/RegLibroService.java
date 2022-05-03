package com.projectExam.ExamFinalSpring.services;

import com.projectExam.ExamFinalSpring.entities.RegLibros;

import java.util.List;
import java.util.Optional;

public interface RegLibroService {
    public List<RegLibros> getAll();
    public Optional<RegLibros> findById(long id);
    public  Optional<RegLibros> save(RegLibros regLibros);
    public  Optional<RegLibros> update(RegLibros regLibros);
    public boolean delete(Long id);
}
