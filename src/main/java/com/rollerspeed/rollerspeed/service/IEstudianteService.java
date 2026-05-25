package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Estudiante;
import java.util.List;

public interface IEstudianteService {
    List<Estudiante> listarTodos();

    Estudiante guardar(Estudiante estudiante);

    Estudiante obtenerPorId(Long id);

    void eliminar(Long id);
}