package com.code.arlw87.JokeApp.controller;

import com.code.arlw87.JokeApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService js;

    public JokeController(JokeService jokeService){
        js = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        String joke = js.getJoke();
        System.out.println("Joke is: " + joke);
        model.addAttribute("joke", joke);

        return "index";
    }

}
