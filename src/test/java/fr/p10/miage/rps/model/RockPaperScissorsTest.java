package fr.p10.miage.rps.model;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest<pierre> {
    public RockPaperScissors rps;

    @BeforeClass
    public void setUp() {
    rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() {
    rps = null;
    }

    @Parameters({"papier","pierre"})
    @Test
    public void testWinPlay1(String p1, String p2){
    assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.WIN);
    }

    @Parameters({"pierre","ciseaux"})
    @Test
    public void testWinPlay2(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.WIN);
    }

    @Parameters({"ciseaux","papier"})
    @Test
    public void testWinPlay3(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.WIN);
    }

    @Parameters({"ciseaux","ciseaux"})
    @Test
    public void testTiePlay1(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.TIE);
    }

    @Parameters({"papier","papier"})
    @Test
    public void testTiePlay2(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.TIE);
    }

    @Parameters({"pierre","pierre"})
    @Test
    public void testTiePlay3(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.TIE);
    }

    @Parameters({"ciseaux","pierre"})
    @Test
    public void testLostPlay1(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.LOST);
    }
    @Parameters({"pierre","papier"})
    @Test
    public void testLostPlay2(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.LOST);
    }
    @Parameters({"papier","ciseaux"})
    @Test
    public void testLostPlay3(String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1), Play.valueOf(p2)), Result.LOST);
    }


    @Test
    public void testApp(){
        Play p1 ;
        p1 = Play.ROCK;
        Play p2 ;
        p2 = Play.SCISSORS;
        assertEquals(RockPaperScissors.play(p1,p2),Result.WIN);
    }
}
