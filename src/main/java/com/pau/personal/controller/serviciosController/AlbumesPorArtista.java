package com.pau.personal.controller.serviciosController;

import com.pau.personal.model.repositoris.ArtistaRepository;
import com.pau.personal.services.AlbumArtistaEspecifico;
import com.pau.personal.services.TodosArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlbumesPorArtista {
    @Autowired
    private AlbumArtistaEspecifico albumArtistaEspecifico;;
    @Autowired
    private ArtistaRepository artistaRepository;

    @GetMapping("/artista/{artistName}")
    public String getArtistAlbums(@PathVariable int artistName, Model model) {
        model.addAttribute("single", albumArtistaEspecifico.getAlbumsByArtist(artistName));
        String txt= artistaRepository.findById((long) artistName).get().getName();
        model.addAttribute("artistName", txt);
        return "albumesEspecificos";
    }
}
