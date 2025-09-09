package main.services.impl;

import main.exceptions.InvalidAmountException;
import main.services.PaymentMethod;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        if (amount <= 0) throw new InvalidAmountException("Amount must be greater than 0");
        else System.out.println(amount + " AZN paid successfully via Crypto");
    }
}