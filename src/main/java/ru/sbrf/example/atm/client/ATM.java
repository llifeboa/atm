package ru.sbrf.example.atm.client;

import ru.sbrf.example.atm.server.Bank;

public class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    //пин, номер счета, имя, номер карты
    public long getBalance(long clientNumber, String accountNumber){

        return  bank.getBalance(clientNumber,accountNumber);
    }

}
