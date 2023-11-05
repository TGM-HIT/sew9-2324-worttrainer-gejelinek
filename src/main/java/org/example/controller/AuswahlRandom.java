package org.example.controller;

import org.example.model.WortBildPaar;

import java.util.List;
import java.util.Random;

public class AuswahlRandom implements AuswahlStrategy{
    Random random = new Random();

    @Override
    public WortBildPaar auswaehlen(List<WortBildPaar> wortBildPaare) {
        int x = random.nextInt(0,wortBildPaare.size());
        return wortBildPaare.get(x);
    }
}
