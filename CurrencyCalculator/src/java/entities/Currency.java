package entities;

import jakarta.ejb.Stateless;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// This class is marked as an entity, indicating that it represents a database table.
@Stateless
public class Currency {

    // These annotations specify that 'id' is the primary key and should be auto-generated.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double dollarAmount;
    private double randAmount;

    // Default constructor for the Currency class.
    public Currency() {
    }

    // Constructor to initialize a Currency object with dollar and rand amounts.
    public Currency(double dollarAmount, double randAmount) {
        this.dollarAmount = dollarAmount;
        this.randAmount = randAmount;
    }

    // Getter method to retrieve the unique identifier (ID) of this currency record.
    public Long getId() {
        return id;
    }

    // Setter method to set the unique identifier (ID) of this currency record.
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method to retrieve the dollar amount associated with this currency record.
    public double getDollarAmount() {
        return dollarAmount;
    }

    // Setter method to set the dollar amount associated with this currency record.
    public void setDollarAmount(double dollarAmount) {
        this.dollarAmount = dollarAmount;
    }

    // Getter method to retrieve the Rand amount associated with this currency record.
    public double getRandAmount() {
        return randAmount;
    }

    // Setter method to set the Rand amount associated with this currency record.
    public void setRandAmount(double randAmount) {
        this.randAmount = randAmount;
    }
}
