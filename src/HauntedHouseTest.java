import static org.junit.jupiter.api.Assertions.*;


class HauntedHouseTest {

    @org.junit.jupiter.api.Test
    void ReturningGhost()
    {
        HauntedHouse house = new HauntedHouse();
        house.scareAwayGhost();
        house.RetGhost();
        assertTrue(house.isGhostPresent());
    }

    @org.junit.jupiter.api.Test
    void RunningLow()
    {
        HauntedHouse house = new HauntedHouse();
        {
            house.trickOrTreat(10);
            assertEquals(10, house.getCandyCount());
        }
    }

    @org.junit.jupiter.api.Test
    void NegativeCandy()
    {
        HauntedHouse house = new HauntedHouse();
        house.refillCandyBowl(-30);
        assertEquals(10,house.getCandyCount());
    }

    @org.junit.jupiter.api.Test
        void tooManyPeople()
        {
            HauntedHouse house = new HauntedHouse();
            house.trickOrTreat(20);
            assertEquals(10, house.getCandyCount());
        }



    @org.junit.jupiter.api.Test
    void isGhostPresent() {
        HauntedHouse house = new HauntedHouse();
        assertTrue(house.isGhostPresent());
    }

    @org.junit.jupiter.api.Test
    void scareAwayGhost() {
        HauntedHouse house = new HauntedHouse();
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
    }

    @org.junit.jupiter.api.Test
    void refillCandyBowl() {
        HauntedHouse house = new HauntedHouse();
        house.trickOrTreat(10);
house.refillCandyBowl(10);
assertEquals(20,house.getCandyCount());
    }

    @org.junit.jupiter.api.Test
    void trickOrTreat() {
        HauntedHouse house = new HauntedHouse();
       house.refillCandyBowl(30);
       house.trickOrTreat(20);
       assertEquals(20,house.getCandyCount());
    }

    @org.junit.jupiter.api.Test
    void getCandyCount() {
    }

    @org.junit.jupiter.api.Test
    void spookySound() {
        HauntedHouse house = new HauntedHouse();
        assertEquals("Boo!",house.spookySound());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}