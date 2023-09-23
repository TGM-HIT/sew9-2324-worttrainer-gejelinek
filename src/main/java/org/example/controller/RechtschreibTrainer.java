package org.example.controller;

import org.example.model.WortBildPaar;

import java.util.*;

public class RechtschreibTrainer {
    private List<WortBildPaar> wortBildPaare;
    private WortBildPaar ausgewaehlt;
    private int richtigZaehler;
    private int falschZaehler;

    public RechtschreibTrainer() {
        this.wortBildPaare = new ArrayList<>();
        this.ausgewaehlt = null;
        this.richtigZaehler = 0;
        this.falschZaehler = 0;
    }

    public void auswaehlen(){
        Random random = new Random();
        int x = random.nextInt(0,wortBildPaare.size());
        ausgewaehlt = wortBildPaare.get(x);
    }

    public WortBildPaar getAusgewaehlt() {
        return ausgewaehlt;
    }
    public void raten(String wort){
        if(ausgewaehlt == null){
            auswaehlen();
        }
        if(wort.equals(ausgewaehlt.getWort())){
            ausgewaehlt = null;
            richtigZaehler++;
        }else{
            falschZaehler++;
        }
    }
}
