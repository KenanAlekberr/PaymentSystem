package main.controller;

import main.enums.Payment;
import main.models.Transaction;
import main.services.PaymentMethod;
import main.services.impl.CreditCardPayment;
import main.services.impl.CryptoPayment;
import main.services.impl.PayPalPayment;

public class PaymentProcessor {
    public void processPayment(Payment payment, double amount) {
        PaymentMethod method;
        switch (payment) {
            case CREDIT_CARD -> method = new CreditCardPayment();
            case PAYPAL -> method = new PayPalPayment();
            case CRYPTO -> method = new CryptoPayment();
            default -> throw new IllegalArgumentException("Invalid payment type");
        }
        method.pay(amount);

        Transaction transaction = new Transaction(amount, payment);
        System.out.println(transaction);
    }
}