package pe.edu.upc.trabajo_final.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_final.Entities.Ruta;
import pe.edu.upc.trabajo_final.Repositories.IRutaRepository;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IRutaService;


import java.util.List;

@Service
public class RutaServiceImplement implements IRutaService {
    @Autowired
    private IRutaRepository rR;//(metodo)
    //diegoooo
    @Override
    public List<Ruta> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Ruta r) {
        rR.save(r);
    }

    @Override
    public void update(Ruta r) {
        rR.save(r);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);//aR es el enlace
    }
}
