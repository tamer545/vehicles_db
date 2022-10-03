package ch.vehicles.vehicles;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
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

    public String getNamex() {
        return namex;
    }

    public Integer getYearx() {
        return yearx;
    }

    public Integer getSellingprice() {
        return sellingprice;
    }

    public Integer getKmdriven() {
        return kmdriven;
    }

    public String getFuel() {
        return fuel;
    }

    public String getSellertype() {
        return sellertype;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getOwner() {
        return owner;
    }

    public String getMileage() {
        return mileage;
    }

    public Integer getEngine() {
        return engine;
    }

    public String getMaxpower() {
        return maxpower;
    }

    public String getTorque() {
        return torque;
    }

    public Integer getSeats() {
        return seats;
    }

    public Long getId() {
        return id;
    }
}
