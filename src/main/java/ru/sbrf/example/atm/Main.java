package ru.sbrf.example.atm;

import ru.sbrf.example.atm.client.ATM;
import ru.sbrf.example.atm.client.User;
import ru.sbrf.example.atm.server.Bank;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(new Bank());

        User user = new User();

    }
}
