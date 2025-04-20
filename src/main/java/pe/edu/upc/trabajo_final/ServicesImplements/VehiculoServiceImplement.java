package pe.edu.upc.trabajo_final.ServicesImplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_final.Entities.Vehiculo;
import pe.edu.upc.trabajo_final.Repositories.IVehiculoRepository;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IVehiculoService;

import java.util.List;

@Service
public class VehiculoServiceImplement implements IVehiculoService {

    @Autowired
    private IVehiculoRepository vR;

    @Override
    public List<Vehiculo> list() {
        return vR.findAll();
    }

    @Override
    public void insert(Vehiculo vehiculo) {
        vR.save(vehiculo);

    }

    @Override
    public void update(Vehiculo vehiculo) {
        vR.save(vehiculo);
    }

    @Override
    public void delete(String id) {
        vR.deleteById(id);
    }


}
