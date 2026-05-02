package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {

    // Página de inicio (Home)
    @GetMapping("/")
    public String home() {
        return "index"; // Buscará: src/main/resources/templates/index.html
    }

    // Página institucional (Misión, Visión y Valores en una sola vista)
    @GetMapping("/mision")
    public String mision() {
        return "institucional"; // Buscará: src/main/resources/templates/institucional.html
    }

    // Página de Servicios
    @GetMapping("/servicios")
    public String servicios() {
        return "servicios"; // Buscará: src/main/resources/templates/servicios.html
    }

    // Página de Eventos
    @GetMapping("/eventos")
    public String eventos() {
        return "eventos"; // Buscará: src/main/resources/templates/eventos.html
    }
}