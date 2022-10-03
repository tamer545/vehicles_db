package ch.vehicles.vehicles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

    public List<Vehicle> findAllByName(String name){
        return repository.findAllByName(name);
    }

    public List<Vehicle> findAllByYear(int year){
        return repository.findAllByYear(year);
    }

    public String deleteByName(String name){
        return repository.deleteByName(name);
    }

    Pageable pageable = PageRequest.of(0, 5);

    public Page<Vehicle> findByNewestYear(int year){
        return repository.findByNewestYear(year, pageable);
    }

    public List<Vehicle> findAllByNameAndYear(String name, int year) {
        return repository.findAllByNameAndYear(name, year);
    }

    public List<Object> joinTwoTables() {
        return repository.joinTwoTables();
    }
}




