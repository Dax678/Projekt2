package pl.edu.wszib;

import pl.edu.wszib.interfaces.Smak;

public class ShakeTruskawkowy extends Shake implements Smak {

    @Override
    public void pij() {
        System.out.println("lyk lyk");
    }

    @Override
    public void smak() {
        System.out.println("Smak Truskawkowy :)");
    }
}
