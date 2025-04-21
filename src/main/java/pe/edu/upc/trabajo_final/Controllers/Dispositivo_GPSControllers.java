package pe.edu.upc.trabajo_final.Controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_final.DTOS.Dispositivo_GPSDTO;
import pe.edu.upc.trabajo_final.Entities.Dispositivo_GPS;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IDispositivo_GPSService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gps")
public class Dispositivo_GPSControllers {
    @Autowired//Injeccion de dependencias
    private IDispositivo_GPSService dS;

    @GetMapping
    public List<Dispositivo_GPSDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Dispositivo_GPSDTO.class);
        }).collect(Collectors.toList());

    }
    @PostMapping
    public void insertar(@RequestBody Dispositivo_GPSDTO dto) {
        ModelMapper m = new ModelMapper();
        Dispositivo_GPS a = m.map(dto, Dispositivo_GPS.class);
        dS.insert(a);
    }

    @PutMapping
    public void modificar(@RequestBody Dispositivo_GPSDTO dto) {
        ModelMapper m = new ModelMapper();
        Dispositivo_GPS a = m.map(dto, Dispositivo_GPS.class);
        dS.update(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        dS.delete(id);
    }
}
