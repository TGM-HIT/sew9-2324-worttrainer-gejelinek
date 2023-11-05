package org.example.controller;

import org.example.model.WortBildPaar;

import java.util.List;

public class AuswahlIndex implements AuswahlStrategy{
    private int index;

    public AuswahlIndex() {
        this.index = 0;
    } //index auf 0 setzen


    // Gib das WortBildPaar basierend auf dem aktuellen Index zurück und inkrementiere den Index.
    // Der Modulo-Operator (%) wird verwendet, um sicherzustellen, dass der Index im gültigen Bereich bleibt.
    @Override
    public WortBildPaar auswaehlen(List<WortBildPaar> wortBildPaare) {
        return wortBildPaare.get(index++ % wortBildPaare.size());

    }
}