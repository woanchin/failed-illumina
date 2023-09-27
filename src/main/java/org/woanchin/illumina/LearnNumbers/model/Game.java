package org.woanchin.illumina.LearnNumbers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Integer round;
    private Integer firstNumber;
    private Integer secondNumber;
    private Integer score;
    private Integer userInput;
    private String mode = "*"; //+, -, *, /
    private HashSet<Integer> currentList = new HashSet<>();


    //Getters and setters
    public Integer getRound() {
        return round;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getUserInput() {
        return userInput;
    }

    public String getMode() {
        return mode;
    }

    public HashSet<Integer> getCurrentList() {
        return currentList;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setUserInput(Integer userInput) {
        this.userInput = userInput;
    }

    public void updateCurrentList(Integer firstNumber, Integer secondNumber) {
        this.currentList.remove(firstNumber);
        this.currentList.remove(secondNumber);
    }

    public Integer getGameNumber() {
        List<Integer> l = new ArrayList<Integer>(this.currentList);
        int gameNumber = l.get(0);
        this.currentList.remove(gameNumber);

        return gameNumber;
    }

    public Game() {
        this.round = 0;
        this.mode = "*";
        this.firstNumber = 1;
        this.secondNumber = 2;
        this.currentList = new HashSet<>(List.of(5,6,7));
    }
}
