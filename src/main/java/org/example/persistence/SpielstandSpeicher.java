package org.example.persistence;
import org.example.model.WortBildPaar;
import org.json.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SpielstandSpeicher {

    public static void spielstandToJSON(List<WortBildPaar> wortBildPaarList, WortBildPaar ausgewaehlt, int richtigZaehler, int falschZaehler) {

        JSONObject jsonObjectParent = new JSONObject();

        jsonObjectParent.put("richtigZaehler", richtigZaehler);
        jsonObjectParent.put("falschZaehler", falschZaehler);

        // WortBildPaar ausgewaehlt
        JSONObject ausgewaehltJSONobject = new JSONObject();

        ausgewaehltJSONobject.put("url", ausgewaehlt.getUrl());
        ausgewaehltJSONobject.put("wort", ausgewaehlt.getWort());

        jsonObjectParent.put("ausgewaehlt", ausgewaehltJSONobject);

        JSONArray jsonArrayWortBildPaare = new JSONArray();  // das ist für die Liste an Wort-Bild-Paaren

        // WortBildPaar-Objekte in JSON-Objekte umwandeln und dem JSONArray hinzufügen
        for (WortBildPaar wortBildPaar : wortBildPaarList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("url", wortBildPaar.getUrl());
            jsonObject.put("wort", wortBildPaar.getWort());
            jsonArrayWortBildPaare.put(jsonObject);
        }
        jsonObjectParent.put("wortBildListe", jsonArrayWortBildPaare);

        speichern(jsonObjectParent.toString());


    }
    
    public static void speichern(String spielstand){
        String filePath = "spielstand.txt";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(spielstand);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
