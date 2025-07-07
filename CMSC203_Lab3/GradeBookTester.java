/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: This JUnit test class verifies the functionality of the GradeBook class.
 * Due: 07/07/2025
 * Platform/compiler: Eclipse IDE / Java 17
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jason Martin
 */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {

    private GradeBook g1;
    private GradeBook g2;

    /**
     * This method sets up the test environment before each test case is run.
     * It creates two GradeBook instances and fills them with sample data.
     */
    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        g1.addScore(50);
        g1.addScore(75);

        g2.addScore(80);
        g2.addScore(60);
        g2.addScore(70);
    }

    /**
     * This method resets the test environment after each test case runs.
     * It clears the GradeBook objects by setting them to null.
     */
    @After
    public void tearDown() throws Exception {
        g1 = null;
        g2 = null;
    }

    /**
     * Validates that scores are being added correctly and that the score count is accurate.
     */
    @Test
    public void testAddScore() {
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertEquals(2, g1.getScoreSize());

        assertTrue(g2.toString().equals("80.0 60.0 70.0 "));
        assertEquals(3, g2.getScoreSize());
    }

    /**
     * Tests the sum() method by comparing actual sum to expected total.
     */
    @Test
    public void testSum() {
        assertEquals(125.0, g1.sum(), 0.0001);
        assertEquals(210.0, g2.sum(), 0.0001);
    }

    /**
     * Confirms that the minimum score is correctly identified.
     */
    @Test
    public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.001);
        assertEquals(60.0, g2.minimum(), 0.001);
    }

    /**
     * Ensures the finalScore method returns the sum minus the lowest score when appropriate.
     */
    @Test
    public void testFinalScore() {
        assertEquals(75.0, g1.finalScore(), 0.001);     // Drops 50
        assertEquals(150.0, g2.finalScore(), 0.001);    // Drops 60
    }
}
