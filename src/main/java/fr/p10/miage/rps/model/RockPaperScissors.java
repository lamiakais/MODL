package fr.p10.miage.rps.model;
//import static org.testng.annotations.AfterMethod;
//import static org.testng.Assert.*;
import java.lang.String.*;
public class RockPaperScissors {

    public static Result play(Play p1, Play p2){
        if( (String.valueOf(p1).equals("PAPER") && String.valueOf(p2).equals("ROCK"))
                || (String.valueOf(p1).equals("ROCK") && String.valueOf(p2).equals("SCISSORS") )
                || (String.valueOf(p1).equals("SCISSORS") && String.valueOf(p2).equals("PAPER") ) ) {
            return Result.WIN;
        }
        else if((String.valueOf(p1).equals("PAPER") && String.valueOf(p2).equals("PAPER"))
        || (String.valueOf(p1).equals("SCISSORS") && String.valueOf(p2).equals("SCISSORS"))
        || (String.valueOf(p1).equals("ROCK") && String.valueOf(p2).equals("ROCK"))){
            return Result.TIE;
        } else{
            return Result.LOST;
        }
    }
}
