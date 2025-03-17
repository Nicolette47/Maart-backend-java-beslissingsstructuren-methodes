import java.util.ArrayList;

public class Bonusloops {
    public static void main(String[] args) {
        //OPDRACHT 1

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("De som van alle even getallen tot 100 is " + sum);

        //OPDRACHT 2
        ArrayList<Integer> numberMultiply = new ArrayList<>();

        int sum2 = 1;

        while (sum2 < 1000) {
            numberMultiply.add(sum2);
            sum2 = sum2 * 2;
        }
        System.out.println(numberMultiply);

        //OPDRACHT 3
        int[] listOpdr3 = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};

        String present = "niet aanwezig";

        for (int i = 0; i < listOpdr3.length; i++) {

            if (listOpdr3[i] == 45) {
                System.out.println(" Er is een 45 gevonden! Hij zit op plek " + i);
                present = "aanwezig";
            }
        }
        System.out.println(" het getal 45 is in deze lijst " + present);

        // alternatief for each loop
        String aanwezig = "niet aanwezig";
        for (int i : listOpdr3) {
            if (i == 45) {
                aanwezig = "aanwezig";
            }
        }
        System.out.println("Het getal 45 is in deze lijst " + aanwezig);

        //OPDRACHT 4
        int[] listOpdr4 = {12, 5, 7, 2, 18, 3, 9, 12};

        int sumresultaat = 0;

        for (int i = 0; i < listOpdr4.length; i++) {
            sumresultaat = sumresultaat + listOpdr4[i];
        }
        System.out.println(" Het resultaat is " + sumresultaat);

        //OPDRACHT 5
       String[] opdr5Lijst= {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};

       int i = 0;

       while ( i < opdr5Lijst.length && !opdr5Lijst[i].equals("")) {
           System.out.print (opdr5Lijst[i] + " , ");
           i++;
       }


    }
}
