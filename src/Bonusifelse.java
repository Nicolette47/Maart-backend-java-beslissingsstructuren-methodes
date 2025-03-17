import java.util.Scanner;

public class Bonusifelse {
    public static void main(String[] args) {
        //OPDRACHT 1
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Geef een getal: ");
        int chosenNumber = scanner.nextInt();
        evenOddChecker(chosenNumber);
        myNumber(chosenNumber);

        // OPDRACHT 2
        System.out.print(" Welk cijfer heb je gehaald? " );
        int grade = scanner.nextInt();
        grader(grade);

        //OPDRACHT 3: grootste 2 getallen
        System.out.println("Welk getal is het grootst");
        System.out.print("Voer getal 1 in: " );
        int response1 = scanner.nextInt();
        System.out.print("Voer getal 2 in: " );
        int response2 = scanner.nextInt();
        highestNumber(response1, response2);

        //OPDRACHT 4: positief negatief zero
        // methode heet myNumber en wordt aangeroepen bij opdracht 1 omdat daar al getal werd gevraagd.

        //OPDRACHT 5:Leeftijdsklassificatie
        System.out.print(" Wat is je leeftijd? : " );
        int age = scanner.nextInt();
        ageClassification(age);

        //OPDRACHT 6:textlengte
        System.out.print(" Wat is jouw mening over Trump: " );
        String meningTrump = scanner.nextLine();
        scanner.nextLine();
        textLength(meningTrump);


    }
    // OPDR 1
    public static void evenOddChecker(int number) {
        if (number % 2 == 0) {
            System.out.println(number + ": Dit is een even nummer ");
        } else {
            System.out.println(number + ": Dit is een oneven nummer ");
        }
    }

    // OPDR 2
    public static void grader(int grade) {
        if (grade < 3) {
            System.out.println("Je hebt een F gehaald ");
        } else if (grade >= 3 && grade < 5) {
            System.out.println("Je hebt een E gehaald ");
        } else if (grade == 5) {
            System.out.println("Je hebt een D gehaald ");
        } else if (grade == 6) {
            System.out.println("Je hebt een C gehaald ");
        } else if (grade > 6 && grade < 9) {
            System.out.println("Je hebt een B gehaald ");
        } else {
            System.out.println("Je hebt een A gehaald");
        }
    }

    // OPDR 3
    public static void highestNumber (int response1, int response2) {
        if (response1 > response2) {
            System.out.println(response1 + " is groter dan " + response2);
        } else if (response1 == response2) {
            System.out.println(response1 + " is hetzelfde getal als " + response2);
        } else {
            System.out.println(response1 + " is kleiner dan " + response2);
        }
    }

    // OPDR 4

    public static void myNumber (int number) {
        if (number > 0 ) {
            System.out.println(" Dit is een positief getal ");
        } else if (number == 0 ) {
            System.out.println(" Dit getal is nul");
        } else {
            System.out.println(" Dit is een negatief getal");
        }
    }

    // OPDR 5
    public static void ageClassification (int number) {
        if (number >= 0 && number < 12) {
            System.out.println(" Je behoort tot de categorie kinderen.");
        } else if (number >= 12 && number < 18 ) {
            System.out.println(" Je behoort tot de categorie pubers.");
        } else if (number >= 18 && number < 67) {
            System.out.println(" Je behoort tot de categorie volwassenen.");
        } else {
            System.out.println(" Je behoort tot de categorie senioren.");
        }
    }

    // OPDR 6
    public static void textlength(String text) {
        int length = text.length();
        String check = "lang";
        if (length < 10){
            check = "kort";
        } else if (length < 20){
            check = "middellang";
        }
        System.out.println("De tekst is "+ check);
    }
}