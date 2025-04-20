package pe.edu.upc.trabajo_final.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_final.DTOS.VehiculoDTO;
import pe.edu.upc.trabajo_final.Entities.Vehiculo;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IVehiculoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoControllers {

    @Autowired
    private IVehiculoService vS;


    @GetMapping
    public List<VehiculoDTO> listar() {
        return vS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VehiculoDTO.class);
        }).collect(Collectors.toList());

    }
    @PostMapping
    public void insertar(@RequestBody VehiculoDTO dto) {
        ModelMapper m = new ModelMapper();
        Vehiculo v = m.map(dto, Vehiculo.class);
        vS.insert(v);
    }

    @PutMapping
    public void modificar(@RequestBody VehiculoDTO dto) {
        ModelMapper m = new ModelMapper();
        Vehiculo v = m.map(dto, Vehiculo.class);
        vS.update(v);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") String id) {
        vS.delete(id);
    }
}
