public class Main {
    public static void main(String[] args) {

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";


        greet();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);


    }

    public static void greet() {
        System.out.println("Hello, World!");
    }

    public static void positiveOrNegative(int number) {
        if (number % 2 == 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number == 0) {
            System.out.println("This number is zero!");
        } else if (number % 2 == 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void bartender(String name) {

        switch (name) {
            case "Henk":
                System.out.println(name + " wants a Bacardi Cola. ");
                break;
            case "Cassy":
                System.out.println(name + " wants a Bloody Mary. ");
                break;
            case "Hendrik-Jan":
                System.out.println(name + " wants a Cognac. ");
                break;
            case "Joep":
                System.out.println(name + " wants a Bier. ");
                break;
            case "Sandra":
                System.out.println(name + " wants a Witte wijn. ");
                break;
            case "Kitty":
                System.out.println(name + " wants a Rode wijn. ");
                break;
            case "Agnes":
                System.out.println(name + " wants a sparkling water. ");
                break;
            default:
                System.out.println("Er is geen bestelling.");
        }
    }

    public static void sum (int input1, int input2) {
        System.out.println(input1 + " summed by " + input2 + " = " + (input1 + input2));

    }
    //"input1 summed by input2 = 24".



}