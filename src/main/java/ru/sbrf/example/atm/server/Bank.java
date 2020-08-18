package ru.sbrf.example.atm.server;

import sun.tools.jstat.Token;

import java.time.LocalDate;
import java.util.List;

public class Bank {
    private Client client;

    public long getBalance(long clientNumber, String accountNumber){
        //1. валидация запроса
        String token = validate(clientNumber);
        //2. сохранение переменных
        Session session = save(token);
        //3. получить счет
        Account account = getAccount(session);

        return account.getBalance();
    }

    private String validate(long clientNumber) {
        return null;
    }

    private Session save(String token){
        return new Session(token, LocalDate.now().plusDays(1));
    }

    private Account getAccount(Session session){
        return null;
    }

}
