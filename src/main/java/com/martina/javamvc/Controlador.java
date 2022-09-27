package com.martina.javamvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

    @RequestMapping("/inicio")
    public String manejarURL(@RequestParam(name = "name", defaultValue = "Martina Orquera")String name, Model modelo){
        modelo.addAttribute("name",name);
        return "paginaSaludo";
    }
}
