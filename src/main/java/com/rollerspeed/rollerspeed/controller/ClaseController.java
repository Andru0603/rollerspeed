package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clases")
public class ClaseController {

    @GetMapping("/calendario")
    public String calendario() {
        return "clases/calendario";
    }
}