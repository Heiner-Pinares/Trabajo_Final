package pe.edu.upc.trabajo_final.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_final.Entities.Respuesta;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {

}
