package com.jokesapp.chuckNorrisJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) - this throws No bean found named ChuckNorrisQuotes
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
