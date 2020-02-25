package org.adp.assignment2;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class PetRockTest
{
    /**
     * Rigorous Test :-)
     */

    private PetRock rocky = new PetRock("Rocky");
    //Test for object equality
    @Test
    public void testGetName() throws Exception
    {
        assertEquals("Rocky", rocky.getName());
    }

    //Test for object identity
    @Test
    public void testPetRock() throws Exception{
        PetRock rocky2 = new PetRock("Rocky");
        assertSame(rocky, rocky2);
    }

    //Failing test
    @Test
    public void testFailGetName() throws Exception {
        assertEquals("Potato",rocky.getName());
    }

    //Timeout test
    @Test (timeout = 1)
    public void testUnhappyToStart() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Ignore("Incomplete method")
    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }


}
