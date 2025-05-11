package ArrayProblems;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your girlfriend's name: ");
        String name = scanner.nextLine();
        
        String message = "I ❤️ You, " + name + "!";
        
        // Heart ASCII art
        String[] heart = {
            "  **     **     **  ",
            " *  *   *  *   *  * ",
            "*    * *    * *    *",
            "*     *      *     *",
            " *             *   * ",
            "  *           *   *  ",
            "   *         *   *   ",
            "    *       *   *    ",
            "     *     *   *     ",
            "      *   *   *      ",
            "       * *   *       ",
            "        *   *        ",
            "         * *         ",
            "          *          "
        };

        // Print the animated heart
        for (int i = 0; i < 3; i++) {
            for (String line : heart) {
                System.out.println(line);
                Thread.sleep(200); // Pause for effect
            }
            System.out.println();
        }

        // Print the final message
        System.out.println("\n" + message);
        System.out.println("You make my code run smoothly! 💖");
        scanner.close();
    }
}
