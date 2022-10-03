package ch.vehicles.vehicles;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, VehicleID>{
    List<Vehicle> findAllByNamex(String name);
    List<Vehicle> findAllByYearx(int year);

    String deleteByNamex(String name);

    Page<Vehicle> findByYearx(int year, Pageable pageable);

    List<Vehicle> findAllByNamexAndYearx(String name, int year);

    @Query(value = "SELECT * FROM VEHICLE AS v INNER JOIN VEHICLETWO AS v2 ON v.NAMEX = v2.NAMEX", nativeQuery = true)
    List<Vehicle> joinTwoTables();
}
