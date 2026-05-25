package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @GetMapping("/estudiante")
    public String registroEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "registro/form-estudiante";
    }

    @GetMapping("/instructor")
    public String registroInstructor() {
        return "registro/form-instructor";
    }
}