package pe.edu.upc.trabajo_final.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_final.Entities.Rol;
import pe.edu.upc.trabajo_final.Repositories.IRolRepository;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IRolService;

import java.util.List;
@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rR;

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }
    @Override
    public Rol searchId (int id){
        return rR.findById(id).orElse(new Rol());
    }
    @Override
    public void insert(Rol rol){ //INSERTAS ROLES
        rR.save(rol);
    }
    @Override
    public void update(Rol r){ //EDITAR ROLES
        rR.save(r);
    }
    @Override
    public void delete(int id) //ELIMINAR ROLES
    {
        rR.deleteById(id);
    }
}
