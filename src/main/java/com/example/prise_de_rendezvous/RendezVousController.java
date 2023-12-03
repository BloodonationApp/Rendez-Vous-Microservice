package com.example.prise_de_rendezvous;

import com.itextpdf.text.DocumentException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class RendezVousController {
    @Autowired
    RendezVousService rendezVousService;

    @GetMapping("/rendezVous/findByRef/{ref}")
    public RendezVous findByRef(@PathVariable("ref") String ref){
        return rendezVousService.findByRef(ref);
    }

    @PostMapping("/rendezVous/priseRendezVous/{nom_donneur}")
    public int priseRendezVous(@RequestBody RendezVous rendezVous, @PathVariable("nom_donneur")String nom, HttpServletResponse response) throws DocumentException, IOException {
        return rendezVousService.prendreRendezvous(rendezVous,nom,response);
    }

   @GetMapping("/rendezVous/listByUserName/{username}")
    public List<RendezVous> listByUserName(@PathVariable("username")String username){
        return rendezVousService.listByUserName(username);
    }
}
