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
        return repository.findAllByNamex(name);
    }

    public List<Vehicle> findAllByYear(int year){
        return repository.findAllByYearx(year);
    }

    public String deleteByName(String name){
        return repository.deleteByNamex(name);
    }

    public Page<Vehicle> findByYear(int year, Pageable pageable){
        return repository.findByYearx(year, pageable);
    }

    public List<Vehicle> findAllByNameAndYear(String name, int year) {
        return repository.findAllByNamexAndYearx(name, year);
    }

    public List<Vehicle> joinTwoTables() {
        return repository.joinTwoTables();
    }
}




