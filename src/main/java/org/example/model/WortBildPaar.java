package org.example.model;

import java.net.MalformedURLException;

public class WortBildPaar {
    private String url;
    private String wort;

    public WortBildPaar(String url, String wort) throws IllegalAccessException {
        if(isURLValid(url)&&isWortValid(wort)) {
            this.url = url;
            this.wort = wort;
        }else{
            throw new IllegalAccessException();
        }
    }

    private boolean isWortValid(String wort) {
        if(wort == null){
            return false;
        }else{
            return true;
        }
    }

    private boolean isURLValid(String url) {
        try{
            new java.net.URL(url);
            return true;
        }catch(MalformedURLException e){
            return false;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(isURLValid(url)) {
            this.url = url;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getWort() {
        return wort;
    }

    public void setWort(String wort) {
        if(isWortValid(wort)) {
            this.wort = wort;
        }else{
            throw new IllegalArgumentException();
        }
    }

}
