package pe.edu.upc.trabajo_final.ServiceInterfaces;

import pe.edu.upc.trabajo_final.Entities.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    public List<Vehiculo> list();
    public void insert(Vehiculo vehiculo);
    public void update(Vehiculo vehiculo);
    public void delete(String id);
}
