package org.adp.assignment2;

/**
 * Hello world!
 *
 */
public class PetRock
{
    private String name;
    private boolean happy = false;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args ) {

    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }
}
