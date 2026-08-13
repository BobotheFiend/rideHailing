package ng.rideHailing.data.models;

import java.math.BigDecimal;

public class Rider extends User {

    private BigDecimal currentBalanace;

    public BigDecimal getCurrentBalanace() {
        return currentBalanace;
    }

    public void setCurrentBalanace(BigDecimal currentBalanace) {
        this.currentBalanace = currentBalanace;
    }
}
