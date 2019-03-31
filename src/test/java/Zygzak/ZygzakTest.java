package Zygzak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ZygzakTest {

    private final String ZYG = "ZYG";
    private final String ZAK = "ZAK";
    private final String ZYGZAK = "ZYG ZAK";

    Zygzak zygzak = new Zygzak();

    @Test
    public void shouldNotStartWhen00rLessIsInput(){
        assertEquals(zygzak.start(0).get(0), "Sorry, you cannot use 0 or lower.");
    }

    @Test
    public void listshouldNotBeEmptyWithNumbers() {
        assertFalse(zygzak.start(10).isEmpty());
        assertTrue(!zygzak.start(10).isEmpty());
        assertNotEquals(0, zygzak.start(0).get(0));
    }

    @Test
    public void shouldAdddCorrectNumbersToTheList() {
        int listLenght = 10;
        assertTrue(zygzak.start(listLenght).get(0).equals(String.valueOf(1)));
        assertTrue(zygzak.start(listLenght).get(3).equals(String.valueOf(4)));
        assertTrue(zygzak.start(listLenght).get(6).equals(String.valueOf(7)));
        }

    @Test
    public void shouldSayZygWhenDividingBy3IsPossible(){
        assertTrue(zygzak.start(10).get(2).equals(ZYG));
        assertTrue(zygzak.start(10).get(8).equals(ZYG));
    }


    @Test
    public void shouldntSayZakWhenDividingBy3IsImpossible(){
        assertFalse(zygzak.start(10).get(0).equals(ZYG));
        assertFalse(zygzak.start(10).get(1).equals(ZYG));
    }

    @Test
    public void shouldSayZakWhenDividingBy5IsPossible() {
        assertTrue(zygzak.start(10).get(4).equals(ZAK));
        assertTrue(zygzak.start(10).get(9).equals(ZAK));
    }

    @Test
    public void shouldntSayZakWhenDividingBy5IsImpossible() {
        assertFalse(zygzak.start(10).get(0).equals(ZAK));
        assertFalse(zygzak.start(10).get(2).equals(ZAK));
    }

    @Test
    public void shouldSayZygZakWhenBothDividesPossible() {}

}
