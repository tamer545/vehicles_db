package ch.vehicles.vehicles;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VehicleID implements Serializable{
    private String namex;
    private String yearx;

    public String getNamex() {
        return namex;
    }

    public String getYearx() {
        return yearx;
    }

    public void setNamex(String namex) {
        this.namex = namex;
    }

    public void setYearx(String yearx) {
        this.yearx = yearx;
    }
}

