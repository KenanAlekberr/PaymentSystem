import main.controller.PaymentProcessor;
import main.enums.ExceptionStatus;
import main.enums.Payment;
import main.exceptions.InvalidAmountException;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        try {
            processor.processPayment(Payment.CREDIT_CARD, 217);
            processor.processPayment(Payment.PAYPAL, -5);
        } catch (InvalidAmountException ex) {
            System.err.println("Payment failed: " + ex.getMessage());
        }


        try {
            for (ExceptionStatus status : ExceptionStatus.values()) {
                System.out.println(status.getStatusCode() + ", " + status.getMessage());
            }

            ExceptionStatus exceptionStatus = ExceptionStatus.fromCode(51);
            System.out.println("\n" + exceptionStatus);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}