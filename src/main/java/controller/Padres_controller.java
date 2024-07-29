package controller;

import model.Padres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.padres_service;

@RestController
@RequestMapping("/api/padres")
public class Padres_controller {

    private final padres_service padresService;

    @Autowired
    public Padres_controller(padres_service padresService) {
        this.padresService = padresService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Padres> getPadres(@PathVariable Long id) {
        Padres padres = padresService.getPadres(id);
        if (padres != null) {
            return ResponseEntity.ok(padres);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

