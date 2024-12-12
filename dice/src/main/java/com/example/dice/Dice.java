package com.example.dice;

import org.springframework.stereotype.Component;

import java.util.Random;
// pour injecter la classe dans d'autre classe par exemple le service
@Component
public class Dice {
    private final Random rand = new Random();
    public int lancerDe(){
        return rand.nextInt(6) + 1;
    }

}
