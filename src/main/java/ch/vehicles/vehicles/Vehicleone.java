package ch.vehicles.vehicles;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicleone {
    private String namex;
    private Integer yearx;
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
    @Id
    private Long id;



}
