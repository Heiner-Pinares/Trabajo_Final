package pe.edu.upc.trabajo_final.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_final.Entities.Reclamo;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IReclamoService;
import pe.edu.upc.trabajo_final.ServiceInterfaces.IRolService;

import java.util.List;

@Service
public class ReclamoServiceimplement implements IReclamoService {
    @Autowired
    private IRolService reS;

    @Override
    public List<Reclamo> list() {
        return reS.findAll();
    }

    @Override
    public void insert(Reclamo reclamo) {

    }
}
