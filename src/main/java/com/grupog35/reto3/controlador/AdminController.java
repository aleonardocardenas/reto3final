package com.grupog35.reto3.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {
    @GetMapping("/all")
    public void obtenerGamas(){

    }
    //Todo: Agregar el body al post
    @PostMapping("/save")
    public void crearGamas(){

    }
}
