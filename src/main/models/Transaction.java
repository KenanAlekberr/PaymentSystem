package main.models;

import main.enums.Payment;

public class Transaction {
    private static int cointer = 1;
    private int id;
    private double amount;
    private Payment payment;

    public Transaction(double amount, Payment payment) {
        this.id = cointer++;
        this.amount = amount;
        this.payment = payment;
    }

    public static int getCointer() {
        return cointer;
    }

    public static void setCointer(int cointer) {
        Transaction.cointer = cointer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Transaction{" + "id=" + id + ", amount=" + amount + ", payment=" + payment + '}';
    }
}