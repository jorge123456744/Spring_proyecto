package repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Estudiante;


@Repository

public interface Estudiante_repository extends JpaRepository<Estudiante, Long> {
    // Métodos CRUD ya están proporcionados por JpaRepository
}

