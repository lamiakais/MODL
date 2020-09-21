package fr.p10.miage.rps.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

    protected String nom;
    protected int score;
    protected List<Play> mvts;

    public Player(String n, List<Play> col){
        this.nom = n;
        this.mvts = col;
    }

    public Player(String n){
        this.nom = n;
        this.mvts = generateCol();
    }

    public List<Play> generateCol(){
        Random rand = new Random();
        int nb = rand.nextInt(20 - 10 + 1) + 10;
        List<Play> play = new ArrayList<>();

        for(int i = 0; i< nb ; i++){
            Random rand2 = new Random();
            int coup = rand.nextInt(2 - 0 + 1) + 0;

            if(coup == 0){
                play.add(Play.ROCK);
            }else if(coup == 1){
                play.add(Play.SCISSORS);
            }else{
                play.add(Play.PAPER);
            }
        }
        return play;
    }

    public int getScore() {
        return this.score;
    }

    public String getNom(){
        return this.nom;
    }

    public int getMvt(){
        return mvts.size();
    }

    //On suppose que l'on supprime à chaque coup l'élément joué
    public Play getNextMove(){
        return mvts.get(0);
    }

    public void setScore(int score) {
        this.score = score;
    }
}