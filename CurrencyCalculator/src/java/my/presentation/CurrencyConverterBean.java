package my.presentation;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.text.DecimalFormat;

// This class is a Java Bean used in a Jakarta EE web application.
@Named("CurrencyConverterBean")
@RequestScoped
public class CurrencyConverterBean implements Serializable {

    private double dollarAmount;
    private double randAmount;

    // Getter method for retrieving the Dollar amount.
    public double getDollarAmount() {
        return dollarAmount;
    }

    // Setter method for setting the Dollar amount.
    public void setDollarAmount(double dollarAmount) {
        this.dollarAmount = dollarAmount;
    }

    // Getter method for retrieving the Rand amount.
    public double getRandAmount() {
        return randAmount;
    }

    // Setter method for setting the Rand amount.
    public void setRandAmount(double randAmount) {
        this.randAmount = randAmount;
    }

    // Method to convert the Dollar amount to Rand.
    public void convertCurrency() {
        randAmount = dollarAmount * 18.40; //Conversion rate based on scenario
    }

    // Method to get the formatted Dollar amount as a string.
    public String getFormattedDollarAmount() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(dollarAmount);
    }

    // Method to get the formatted Rand amount as a string.
    public String getFormattedRandAmount() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(randAmount);
    }

    // Method to clear the input (set Dollar amount to an initial value).
    public void clearInput() {
        dollarAmount = 0.00; // Set to zero
    }
}
