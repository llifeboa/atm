package ru.sbrf.example.atm.server;

public class Account {
    private String number;
    private long balance;
    private Currency currency;

    public Account(String number, long balance, Currency currency) {
        this.number = number;
        this.balance = balance;
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
