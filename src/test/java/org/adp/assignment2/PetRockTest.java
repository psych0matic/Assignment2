package org.adp.assignment2;

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
    @Test
    public void testGetName() throws Exception
    {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testFailGetName() throws Exception {
        assertEquals("Potato",rocky.getName());
    }

    @Test
    public void testUnhappyToStart() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }


}
