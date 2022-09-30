package ch.vehicles.vehicles;


import javax.persistence.EntityManager;
import java.util.List;

public class NativeQueryService {

    EntityManager em;

    public NativeQueryService(EntityManager em) {
        this.em = em;
    }

    public List findAllByName(String name) {
        return em.createNativeQuery("SELECT * FROM VEHICLEONE WHERE NAME='" + name + "'").getResultList();
    }

}

