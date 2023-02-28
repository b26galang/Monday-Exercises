package Exercises;
import java.util.Random;
public class RandomMethods {
    public static void main(String[] args)  {
        Random rand = new Random();
        // Print out 5 random int numbers from 0-99
        for (int i = 0; i < 5; i++) {
            System.out.println("Random int numbers: " + rand.nextInt(100)); // Ints from 0 to 99 will be printed
        }
        System.out.println();
        // Print out 5 random double numbers from 0-99
        for (int i = 0; i < 5; i++) {
            System.out.println("Random double numbers: " + rand.nextDouble(100)); // Doubles from 0 to 99 will be printed
        }
        System.out.println();
        Random randSeed = new Random(); // Seeded random object
        randSeed.setSeed(10); // 10 is a saved space
        // Print out 5 random seeded int numbers from 0-99
        for (int i = 0; i < 5; i++) {
            System.out.println("Random seeded int numbers: " + randSeed.nextInt(100)); // Seeded ints from 0 to 99 will be printed
        }
    }
}
