package pe.edu.upc.trabajo_final.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_final.Entities.Rol;
import pe.edu.upc.trabajo_final.Entities.Usuario;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    @Query("SELECT r.usuario FROM Rol r WHERE r.role = 'ADMIN'")
    List<Usuario> BuscaUsuariosXRolAdmin();

}
