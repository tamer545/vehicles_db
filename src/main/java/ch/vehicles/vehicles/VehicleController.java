package ch.vehicles.vehicles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    private final VehicleService service;

    public VehicleController(VehicleService service){
        this.service = service;
    }

    @GetMapping("/{year}")
    public ResponseEntity<List<Vehicle>> findAllByYear(@PathVariable("year") int year) {
        return ResponseEntity.ok(service.findAllByYear(year));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Vehicle>> findAllByName(@PathVariable("name") String name){
        return ResponseEntity.ok(service.findAllByName(name));
    }

    @GetMapping("/pageable/{year}")
    public ResponseEntity<Page<Vehicle>> findByYear(@PathVariable("year") int year, @RequestBody PageRequest  pageable) {
        return ResponseEntity.ok(service.findByYear(year, pageable));
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteByName(@PathVariable("name") String name) {
        return ResponseEntity.status(200).body(service.deleteByName(name));
    }

    @GetMapping("/{year}/{name}")
    public ResponseEntity<List<Vehicle>> findAllByNameAndYear(@PathVariable("year") int year, @PathVariable("name") String name) {
        return ResponseEntity.ok(service.findAllByNameAndYear(name, year));
    }

    @GetMapping("/join")
    public ResponseEntity<List<Vehicle>> joinTwoTables() {
        return ResponseEntity.ok(service.joinTwoTables());
    }
}
