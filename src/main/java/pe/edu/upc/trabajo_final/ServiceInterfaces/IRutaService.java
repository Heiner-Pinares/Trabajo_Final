package pe.edu.upc.trabajo_final.ServiceInterfaces;



import pe.edu.upc.trabajo_final.Entities.Ruta;

import java.util.List;

public interface IRutaService {
    public List<Ruta> list();
    public void insert(Ruta ruta);
    public void update(Ruta ruta);
    public void delete(int id);
}
