/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: GradeBook class that stores and manipulates scores for students.
 * Due: 07/07/2025
 * Platform/compiler: Eclipse IDE / Java 17
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jason Martin
 */

public class GradeBook {

    private double[] scores;
    private int scoresSize;

    /**
     * Creates a GradeBook with space to hold up to the specified number of scores.
     * @param capacity The maximum number of scores allowed
     */
    public GradeBook(int capacity) {
        scores = new double[capacity];
        scoresSize = 0;
    }

    /**
     * Adds a new score to the list if space is available.
     * @param score The score value to add
     * @return true if added successfully; false if GradeBook is full
     */
    public boolean addScore(double score) {
        if (scoresSize < scores.length) {
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        }
        return false;
    }

    /**
     * Calculates the total of all entered scores.
     * @return The combined value of all scores in the GradeBook
     */
    public double sum() {
        double total = 0;
        for (int i = 0; i < scoresSize; i++) {
            total += scores[i];
        }
        return total;
    }

    /**
     * Returns the lowest score added so far.
     * @return The smallest score value; or 0 if no scores exist
     */
    public double minimum() {
        if (scoresSize == 0) return 0;

        double min = scores[0];
        for (int i = 1; i < scoresSize; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    /**
     * Computes the final grade by summing all scores and removing the lowest,
     * if there are two or more scores.
     * @return The adjusted final score or 0 if empty
     */
    public double finalScore() {
        if (scoresSize == 0)
            return 0;
        else if (scoresSize == 1)
            return scores[0];
        else
            return sum() - minimum();
    }

    /**
     * Gets the number of scores currently in the GradeBook.
     * @return The count of scores stored
     */
    public int getScoreSize() {
        return scoresSize;
    }

    /**
     * Converts the scores array into a string with each score separated by a space.
     * @return A space-separated string of all entered scores
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < scoresSize; i++) {
            sb.append(scores[i]).append(" ");
        }
        return sb.toString();
    }
}
