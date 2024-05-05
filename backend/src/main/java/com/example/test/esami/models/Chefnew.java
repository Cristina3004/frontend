package com.example.test.esami.models;

public class Chefnew extends Persona{
    private String specializzazione;

    public Chefnew(String nome, String cognome, String email, String cellulare, String specializzazione) {
        super(nome, cognome, email, cellulare);
        this.specializzazione = specializzazione;
    }

    public Chefnew(){}


    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }
}
