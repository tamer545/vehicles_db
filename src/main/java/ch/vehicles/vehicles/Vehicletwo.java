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
    private Integer yearx;
    private Integer origin;
    private String namex;
    @Id
    private Long id;
}
