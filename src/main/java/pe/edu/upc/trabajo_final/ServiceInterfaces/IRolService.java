package pe.edu.upc.trabajo_final.ServiceInterfaces;

import pe.edu.upc.trabajo_final.Entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol rol);
    public void delete(int id);
    public void update(Rol rol);
    public Rol searchId (int id);
}
