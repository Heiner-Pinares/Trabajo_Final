package pe.edu.upc.trabajo_final.ServiceInterfaces;

import pe.edu.upc.trabajo_final.Entities.Alerta;
import pe.edu.upc.trabajo_final.Entities.Ruta;

import java.util.List;

public interface IAlertaService {
    public List<Alerta> list();
}
