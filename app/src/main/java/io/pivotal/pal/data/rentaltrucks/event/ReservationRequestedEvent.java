package io.pivotal.pal.data.rentaltrucks.event;

import java.time.LocalDate;
import java.util.Objects;

public class ReservationRequestedEvent {

    private final LocalDate pickupDate;
    private final LocalDate dropoffDate;
    private final String customerName;
    private final String confirmationNumber;

    public ReservationRequestedEvent(LocalDate pickupDate,
                                     LocalDate dropoffDate,
                                     String customerName,
                                     String confirmationNumber) {
        this.pickupDate = pickupDate;
        this.dropoffDate = dropoffDate;
        this.customerName = customerName;
        this.confirmationNumber = confirmationNumber;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public LocalDate getDropoffDate() {
        return dropoffDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationRequestedEvent that = (ReservationRequestedEvent) o;
        return Objects.equals(pickupDate, that.pickupDate) &&
                Objects.equals(dropoffDate, that.dropoffDate) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(confirmationNumber, that.confirmationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pickupDate, dropoffDate, customerName, confirmationNumber);
    }

    @Override
    public String toString() {
        return "ReservationRequestedEvent{" +
                "pickupDate=" + pickupDate +
                ", dropoffDate=" + dropoffDate +
                ", customerName='" + customerName + '\'' +
                ", confirmationNumber='" + confirmationNumber + '\'' +
                '}';
    }
}
