package com.mycompany.assignment_3_oop;

public class BankAccount {

    private int id;
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {

        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraws(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("Executed successfully");

        } else {
            System.out.println("the balance does not sufficient");
        }
    }

    public void deposits(double amount) {
        this.balance += amount;
    }

}
