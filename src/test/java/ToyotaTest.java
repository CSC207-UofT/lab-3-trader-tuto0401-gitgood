/*
 * This file contains sample JUnit test cases for Toyota.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class ToyotaTest {
    Toyota t;

    @Before
    public void setUp() throws Exception {
        t = new Toyota();
    }

    @Test
    public void TestGetPrice()
    {
        assertEquals(200, t.getPrice());
    }
    @Test
    public void TestGetMaxSpeed()
    {
        assertEquals(2, t.getMaxSpeed());
    }
    @Test
    public void TestUpgradeSpeed()
    {
        t.upgradeSpeed();
        assertEquals(3, t.getMaxSpeed());
    }

    @Test
    public void TestDowngradeSpeed()
    {
        t.downgradeSpeed();
        assertEquals(1, t.getMaxSpeed());
    }

}
