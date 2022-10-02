package pl.edu.wszib;

import pl.edu.wszib.interfaces.Jadalne;
import pl.edu.wszib.interfaces.Pijalny;

public abstract class Shake implements Jadalne, Pijalny {
    @Override
    public void jedz() {
        pij();
    }
}
