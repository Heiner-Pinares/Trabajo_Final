package pe.edu.upc.trabajo_final.ServiceInterfaces;

import pe.edu.upc.trabajo_final.Entities.Reclamo;

import java.util.List;

public interface IReclamoService {
    public List<Reclamo> list();
    public void insert(Reclamo reclamo);
}
