package service;

import model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Estudiante_repository;

import java.util.List;

@Service
public class Estudiante_service {
   private final Estudiante_repository Estudiante_repository;

   //constructor para inyectar el repositorio
   @Autowired
   public Estudiante_service(Estudiante_repository Estudiante_repository) {
      this.Estudiante_repository = Estudiante_repository;
   }

   //obtener un estudiante por id
   public Estudiante getEstudiante(Long id) {
      return Estudiante_repository.findById(id).orElse(null);
   }

   //obtener todos los estudiantes
   public List<Estudiante> getAllEstudiantes() {
      return Estudiante_repository.findAll();
   }

   //guardar un estudiante
   public void saveEstudiante(Estudiante estudiante) {
      Estudiante_repository.save(estudiante);
   }

   //eliminar un estudiante pr id
   public void deleteEstudiante(Long id) {
      Estudiante_repository.deleteById(id);
   }

}
