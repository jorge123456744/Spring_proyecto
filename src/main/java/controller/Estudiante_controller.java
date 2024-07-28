package controller;


import model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Estudiante_service;

@RestController
@RequestMapping("/api/Estudiante_controller")
public class Estudiante_controller {
    private final Estudiante_service estudianteService;

    @Autowired
    public Estudiante_controller(Estudiante_service estudianteService){
        this.estudianteService = estudianteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getEstudiante (@PathVariable Long id) {
        Estudiante estudiante = estudianteService.getEstudiante(id);
        if(estudiante != null){
            return ResponseEntity.ok(estudiante);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
