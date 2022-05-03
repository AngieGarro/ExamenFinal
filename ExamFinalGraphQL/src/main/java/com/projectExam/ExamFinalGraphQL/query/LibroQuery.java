package com.projectExam.ExamFinalGraphQL.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.projectExam.ExamFinalGraphQL.entities.Libro;
import com.projectExam.ExamFinalGraphQL.services.LibroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LibroQuery implements GraphQLQueryResolver {
    @Autowired
    private LibroServices libroServices;

    public List<Libro> getLibros(int count) {
        return this.libroServices.getAllLibros(count);
    }
    public Optional<Libro> getLibro(int id) {
        return this.libroServices.getLibro(id);
    }
}
