package com.pau.personal.controller;

import com.pau.personal.model.entitats.Artista;
import com.pau.personal.model.repositoris.ArtistaRepository;
import com.pau.personal.model.repositoris.GeneroRepository;
import com.pau.personal.services.TodosArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistaController {

    @Autowired
    TodosArtistaService artistaService;
    @GetMapping("/artistas")
    public String getAllAlbums(Model model) {
        model.addAttribute("single", artistaService.getAllArtista());
        return "artista";
    }
}