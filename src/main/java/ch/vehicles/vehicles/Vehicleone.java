package ch.vehicles.vehicles;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicleone {
    private String name;
    private Integer year;
    private Integer sellingprice;
    private Integer kmdriven;
    private String fuel;
    private String sellertype;
    private String transmission;
    private String owner;
    private String mileage;
    private Integer engine;
    private String maxpower;
    private String torque;
    private Integer seats;
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
