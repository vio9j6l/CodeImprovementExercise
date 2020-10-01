import java.util.Scanner;

public class ConsoleHelper
{
    public static Scanner keyboard = new Scanner(System.in);
    public static boolean correct = true;

    public static void getName(Person person){
        //First Name
        System.out.print("Enter a First Name: ");
        do {
            person.firstName = keyboard.nextLine();
            if (person.firstName.equals("")) {
                correct = false;
                System.out.println("Enter a valid Name!");
            }
            else {
                correct = true;
            }
        }
        while (!correct);
    }

    public static void getFirstName(Person person) {
        //First Name
        System.out.print("Enter a First Name: ");
        do {
            person.firstName = keyboard.nextLine();
            if (person.firstName.equals("")) {
                correct = false;
                System.out.println("Enter a valid Name!");
            }
            else {
                correct = true;
            }
        }
        while (!correct);
    }

    public static void getMiddleName(Person person) {
        System.out.print("Enter a Middle Name: ");
        do {
            person.middleName = keyboard.nextLine();
            if (person.middleName.equals("")) {
                System.out.println("Enter a valid Name!");
                correct = false;
            }
            else {
                correct = true;
            }
        }
        while (!correct);
    }

    public static void getLastName(Person person) {
        System.out.print("Enter a Last Name: ");
        do {
            person.lastName = keyboard.nextLine();
            if (person.lastName.equals("")) {
                System.out.println("Enter a valid Name!");
                correct = false;
            }
            else {
                correct = true;
            }
        }
        while (!correct);
    }

    public static String getEyeColor(Scanner keyboard, String[] validAnswers){
        String userInput = "";
        while (!correct){
            userInput = keyboard.nextLine();

            for(String validAnswer : validAnswers){
                if (userInput.equals(validAnswer)) {
                    // you know what they typed in is valid
                    correct = true;
                    break;
                } else {
                    System.out.println("Enter a valid eye color!");
                    //System.out.print(prompt);
                    //userInput = keyboard.nextLine();
                    correct = false;
                }
            }
        }
        return userInput;

    }

}
