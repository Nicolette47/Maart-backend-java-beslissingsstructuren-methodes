import java.util.Scanner;

public class Bonusifelse {
    public static void main(String[] args) {
        //OPDRACHT 1
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Geef een getal: ");
        int chosenNumber = scanner.nextInt();
        evenOddChecker(chosenNumber);

        // OPDRACHT 2
        System.out.print(" Welk cijfer heb je gehaald? " );
        int grade = scanner.nextInt();
        grader(grade);

    }

    public static void evenOddChecker(int number) {
        if (number % 2 == 0) {
            System.out.println(number + ": Dit is een even nummer ");
        } else {
            System.out.println(number + ": Dit is een oneven nummer ");
        }
    }

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
}