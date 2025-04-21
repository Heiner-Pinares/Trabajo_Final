package pe.edu.upc.trabajo_final.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_final.Entities.Ubicacion_Registro;

@Repository
public interface IUbicacion_RegistroReposiitory extends JpaRepository<Ubicacion_Registro, Integer> {
}
