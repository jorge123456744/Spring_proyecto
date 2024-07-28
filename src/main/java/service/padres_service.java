package service;

import model.Padres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Padres_repository;

import java.util.List;

@Service
public class padres_service {
   private final Padres_repository Padres_repository;

   @Autowired
   public padres_service (Padres_repository Padres_repository){
       this.Padres_repository = Padres_repository;
   }

   public Padres getPadres(Long id){
       return Padres_repository.findById(id).orElse(null);
   }

   public List<Padres> getAllPadres() {
       return Padres_repository.findAll();
   }

   public void savePadres (Padres Padres){
       Padres_repository.save(Padres);
   }

    public void deletePadres(Long id) {
        Padres_repository.deleteById(id);
    }
}