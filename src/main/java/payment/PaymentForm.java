package payment;

public class PaymentForm {

    public static void main(String[] args) {
        double amount = 50.0; // Example payment amount
        String paymentStatus = "Not Paid";

        // Check initial status
        System.out.println("Payment Status: " + paymentStatus);

        // Process payment
        if (amount > 0) {
            paymentStatus = "Paid";
            System.out.println("Payment of $" + amount + " has been successfully processed.");
        } else {
            System.out.println("Invalid payment amount. Please enter a positive value.");
        }

        // Check updated status
        System.out.println("Payment Status: " + paymentStatus);
    }
}
