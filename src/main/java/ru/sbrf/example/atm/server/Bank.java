package ru.sbrf.example.atm.server;

import java.util.List;

public class Bank {
    private List<Client> client;

    public long getBalance(long clientNumber, String accountNumber){
        //1. валидация запроса
        validate();
        //2. сохранение переменных
        save();
        //3. получить счет
        getAccount();

    }

    private void validate(long clientNumber, String acco) {

    }
}
