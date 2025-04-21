package pe.edu.upc.trabajo_final.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.trabajo_final.DTOS.RolDTO;
import pe.edu.upc.trabajo_final.Entities.Rol;
import pe.edu.upc.trabajo_final.Repositories.IRolRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RolControllers {
    @Autowired
    private IRolRepository rR;

    @GetMapping
    public List<RolDTO> list() {
        return rR.list().stream().map(Rol r ->{
            ModelMapper m = new ModelMapper();
            return m.map(r, RolDTO.class);
        }).collect(Collectors.toList());
    }

}
