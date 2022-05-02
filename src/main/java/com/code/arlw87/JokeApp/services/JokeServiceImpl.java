package com.code.arlw87.JokeApp.services;
import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes cnq;

    public JokeServiceImpl(){
        this.cnq = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return cnq.getRandomQuote();
    }
}
