package main.services;

import main.exceptions.InvalidAmountException;

public interface PaymentMethod {
    void pay(double amount) throws InvalidAmountException;
}