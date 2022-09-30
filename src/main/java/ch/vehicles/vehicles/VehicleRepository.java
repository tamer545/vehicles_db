package ch.vehicles.vehicles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, VehicleID>{
    List<Vehicle> findAllByName(String name);
    List<Vehicle> findAllByYear(int year);

    String deleteByName(String name);

    Page<Vehicle> findByNewestYear(int year, Pageable pageable);

}
