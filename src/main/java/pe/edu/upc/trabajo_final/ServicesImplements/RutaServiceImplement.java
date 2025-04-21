package pe.edu.upc.trabajo_final.ServicesImplements;

import pe.edu.upc.trabajo_final.Entities.Rol;
import pe.edu.upc.trabajo_final.Entities.Ruta;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IRolService;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IRutaService;

import java.util.List;

public class RutaServiceImplement implements IRutaService {
    @Override
    public List<Ruta> list() {
        return List.of();
    }
}
