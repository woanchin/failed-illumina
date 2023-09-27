package org.woanchin.illumina.LearnNumbers.logic;

import org.woanchin.illumina.LearnNumbers.model.Game;

public class GameLogic {
    public static Game calculateAnswer(Game game, Integer userInput) {
        boolean isUserCorrect = false;
        int first = game.getFirstNumber();
        int second = game.getSecondNumber();
        System.out.println("test");
        System.out.println(game.getMode());
        System.out.println(first);
        System.out.println(second);
        System.out.println(userInput);
        System.out.println(userInput == first * second);

        switch (game.getMode()) {
            case "*":
                isUserCorrect = userInput == first * second;
                break;
            case "+":
                isUserCorrect = userInput == first + second;
                break;
            case "-":
                isUserCorrect = userInput == first - second;
                break;
            case "/":
                isUserCorrect = userInput == first / second;
                break;
        }

        if (isUserCorrect) {
            int newFirstNumber = game.getGameNumber();
            int newSecondNumber = game.getGameNumber();
            game.setFirstNumber(newFirstNumber);
            game.setSecondNumber(newSecondNumber);
        }

        int round = game.getRound();
        game.setRound(round + 1); //set new round

        return game;
    }
}
