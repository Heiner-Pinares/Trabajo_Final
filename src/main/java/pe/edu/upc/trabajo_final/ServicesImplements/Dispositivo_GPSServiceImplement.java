package pe.edu.upc.trabajo_final.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_final.Entities.Dispositivo_GPS;
import pe.edu.upc.trabajo_final.Repositories.IDispositivo_GPSRepository;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IDispositivo_GPSService;

import java.util.List;

@Service
public class Dispositivo_GPSServiceImplement implements IDispositivo_GPSService {

    @Autowired
    private IDispositivo_GPSRepository gR;//(metodo)

    @Override
    public List<Dispositivo_GPS> list() {
        return gR.findAll();
    }

    @Override
    public void insert(Dispositivo_GPS g) {
        gR.save(g);
    }

    @Override
    public void update(Dispositivo_GPS g) {
        gR.save(g);
    }

    @Override
    public void delete(int id) {
        gR.deleteById(id);//aR es el enlace
    }
}
