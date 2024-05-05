package com.example.test.esami.controller;

import com.example.test.esami.models.Chefnew;
import com.example.test.esami.models.Ristorante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InitController {
    @GetMapping("/init")
     public String init(){
        Chefnew chefnew1 = new Chefnew("Cristina","Zito", "email@email.com", "1234", "chef");
        Chefnew chefnew2 = new Chefnew("Anna","Rossi", "email@email.com", "5678", "chef");
        Chefnew chefnew3 = new Chefnew("Maria","Verdi", "email@email.com", "9123", "chef");
        Chefnew chefnew4 = new Chefnew("Luca","Bianco", "email@email.com", "4567", "chef");
        Chefnew chefnew5 = new Chefnew("Gianni","Bruno", "email@email.com", "8912", "chef");

        Ristorante rist1= new Ristorante("Locanda degli Angeli", "via Pippo numero 1");
        Ristorante rist2= new Ristorante("Mc Donald", "via Pluto numero 2");

        List<Chefnew> chefnews = new ArrayList<>();
        chefnews.add(chefnew1);
        chefnews.add(chefnew2);
        chefnews.add(chefnew3);
        chefnews.add(chefnew4);
        chefnews.add(chefnew5);

        List<Ristorante> ristoranti = new ArrayList<>();
        ristoranti.add(rist1);
        ristoranti.add(rist2);

        return "init";
    }
}
