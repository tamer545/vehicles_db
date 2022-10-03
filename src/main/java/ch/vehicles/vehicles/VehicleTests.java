package ch.vehicles.vehicles;

import org.assertj.core.api.WithAssertions;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
public class VehicleTests WithAssertions {

    @Autowired
    VehicleRepository repository;

    @Test
    void findAllByYear() {
        List<Vehicle> vehicles = repository.findAllByYear(2005);

        for (Vehicle vehicle : vehicles) {
            assertThat(vehicle.getYearx()).isEqualTo(2005);
        }
    }

    @Test
    void deleteByName() {
        repository.deleteByName("Maruti Swift Dzire VDI");
        List<Vehicle> vehicles = repository.findAll();

        for (Vehicle vehicle : vehicles) {
            assertThat(vehicle.getNamex()).isNotEqualTo("Maruti Swift Dzire VDI");
        }
    }

    @Test
    void selectWithPaging() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Vehicle> vehiclePage = repository.findByNewestYear(2017, pageable);
        List<Vehicle> vehiclesWithYear = repository.findAllByYear(2017);

        assertThat(vehiclePage.getSize()).isEqualTo(5);
        assertThat(vehiclePage.stream().findFirst().get().getId().getYearx()).isEqualTo(vehiclesWithYear.get(0).getId().getYearx());
    }

    @Test
    void selectWithTwoWhere() {
        List<Vehicle> vehicles = repository.findAllByNameAndYear("Hyundai i20 Sportz Diesel", 2010);

        for (Vehicle vehicle : vehicles) {
            assertThat(vehicle.getYearx()).isEqualTo(2010);
            assertThat(vehicle.getNamex()).isEqualTo("Hyundai i20 Sportz Diesel");
        }
    }


    @Test
    void joinTwoTables() {
        List<Object> list = repository.joinTwoTables();
        assertThat(list.get(0)).isEqualTo(new Object[]{"Maruti Swift Dzire VDI", 2014, 450000, 145500, "Diesel", "Individual", "Manual", "First Owner", "23.4 kmpl", "1248 CC", "74 bhp", "190Nm@", "2000rpm", 5});
    }

}
