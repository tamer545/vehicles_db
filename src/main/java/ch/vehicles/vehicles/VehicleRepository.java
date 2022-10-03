package ch.vehicles.vehicles;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, VehicleID>{
    List<Vehicle> findAllByName(String name);
    List<Vehicle> findAllByYear(int year);

    String deleteByName(String name);

    Page<Vehicle> findByNewestYear(int year, Pageable pageable);

    List<Vehicle> findAllByNameAndYear(String name, int year);

    @Query(value = "SELECT namex, yearx,sellingprice,kmdriven,fuel,sellertype,transmission,owner,mileage,engine,maxpower,torque,seats FROM VEHICLE AS v INNER JOIN VEHICLETWO AS v2 ON v.NAMEX = v2.NAMEX", nativeQuery = true)
    List<Object> joinTwoTables();
}
