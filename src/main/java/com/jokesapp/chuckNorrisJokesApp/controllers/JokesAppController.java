package com.jokesapp.chuckNorrisJokesApp.controllers;

import com.jokesapp.chuckNorrisJokesApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesAppController {
    private final JokeService jokeService;

    public JokesAppController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model)
    {
        model.addAttribute("joke",jokeService.getRandomJoke());

        return "index";
    }
}
