package pe.edu.upc.trabajo_final.Controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_final.DTOS.RutaDTO;
import pe.edu.upc.trabajo_final.Entities.Ruta;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IRutaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutas")
public class RutaControllers {
    @Autowired//Injeccion de dependencias
    private IRutaService rS;

    @GetMapping
    public List<RutaDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RutaDTO.class);
        }).collect(Collectors.toList());

    }
    @PostMapping
    public void insertar(@RequestBody RutaDTO dto) {
        ModelMapper m = new ModelMapper();
        Ruta a = m.map(dto, Ruta.class);
        rS.insert(a);
    }

    @PutMapping
    public void modificar(@RequestBody RutaDTO dto) {
        ModelMapper m = new ModelMapper();
        Ruta a = m.map(dto, Ruta.class);
        rS.update(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        rS.delete(id);
    }
}
