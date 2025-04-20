package pe.edu.upc.trabajo_final.ServiceInterfaces;

import pe.edu.upc.trabajo_final.Entities.Dispositivo_GPS;

import java.util.List;

public interface IDispositivo_GPSService {
    public List<Dispositivo_GPS> list();
    public void insert(Dispositivo_GPS gps);
    public void update(Dispositivo_GPS gps);
    public void delete(int id);
}
