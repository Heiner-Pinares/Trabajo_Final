package pe.edu.upc.trabajo_final.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_final.Entities.Dispositivo_GPS;

@Repository
public interface IDispositivo_GPSRepository extends JpaRepository<Dispositivo_GPS, Integer> {
}
