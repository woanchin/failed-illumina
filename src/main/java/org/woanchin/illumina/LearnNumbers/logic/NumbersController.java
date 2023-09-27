package org.woanchin.illumina.LearnNumbers.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.woanchin.illumina.LearnNumbers.logic.GameLogic;
import org.woanchin.illumina.LearnNumbers.model.Game;

@Controller
public class NumbersController {
    @Value("${spring.application.name}")
    String appName;

    Game game = new Game();

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("game", game);
        return "index";
    }

    @PostMapping("/updategame")
    public String updateGame(Game game, Model model) {
        Game result = GameLogic.calculateAnswer(game, game.getUserInput());

        model.addAttribute("game", game);
        return "index";
    }
}
