package ch.vehicles.vehicles;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicletwo {
    private Integer mpg;
    private Integer cylinders;
    private Integer displacement;
    private Integer horsepower;
    private Integer weight;
    private Integer acceleration;
    private Integer year;
    private Integer origin;
    private String name;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
