package ca.kohler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FanTest {
    final static Fan fanTest = new Fan("Ceiling Fan Test");

    @Test
    @DisplayName("Pull the speed cord to set the speed 2")
    void pullSpeedCordToSetSpeed2() {
        final int expected = 2;
        fanTest.pullSpeedCord(); //speed 0 to 1
        fanTest.pullSpeedCord(); //speed 1 to 2
        final int actual = fanTest.getSpeed(); ;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Pull the speed cord to back the speed 0")
    void pullSpeedCordTestBackToOff() {
        final int expected = 0;
        fanTest.pullSpeedCord(); //speed 2 to 0
        final int actual = fanTest.getSpeed(); ;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Pull Direction Cord")
    public void pullDirectionCordTest() {
        final boolean expected = true; //Counterclockwise
        fanTest.pullDirectionCord();
        final boolean actual = fanTest.isDirection(); ;
        assertEquals(expected,actual);
    }
}