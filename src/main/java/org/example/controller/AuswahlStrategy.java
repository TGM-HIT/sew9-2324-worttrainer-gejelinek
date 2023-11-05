package org.example.controller;

import org.example.model.WortBildPaar;

import java.util.List;

public interface AuswahlStrategy {
     WortBildPaar auswaehlen(List<WortBildPaar> wortBildPaare);

}
