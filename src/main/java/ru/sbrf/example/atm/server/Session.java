package ru.sbrf.example.atm.server;

import java.time.LocalDate;

public class Session {
    private String token;
    private LocalDate end;

    public Session(String token, LocalDate end) {
        this.token = token;
        this.end = end;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
