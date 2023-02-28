package Exercises;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun => ");
        String noun1 = input.nextLine();

        System.out.println("Enter a noun(plural) => ");
        String nounPlural = input.nextLine();

        System.out.println("Enter an adjective => ");
        String adjective1 = input.nextLine();

        System.out.println("Enter another adjective => ");
        String adjective2 = input.nextLine();

        System.out.println("Enter a verb => ");
        String verb = input.nextLine();

        System.out.println(madLib(noun1, nounPlural, adjective1, adjective2, verb));
        input.close();
    }

    public static String madLib(String noun1, String nounPlural, String adjective1, String adjective2, String verb) {
        return "The " + adjective1 + " " +  noun1 + " " + verb + " to the " + adjective2 + " " + nounPlural;
    }
}
