import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataEntry
{
    // TODO 01 + Classes should be PascalCase
    public static void main(String[] args) {
        // TODO 00 + replace XX with your breakout room, and list each student in the breakout room, and which one shared their screen to type the code
        System.out.println("Breakout Room #5"); // Replace 'X' with the room number

        System.out.println("Name: JiaJia Liu (jpl5840@psu.edu)");
        System.out.println("Name: Paul Tzivekis (pmt5207@psu.edu)");
        System.out.println("Name: Aman Patel (asp5348@psu.edu)");
        System.out.println("");
        System.out.println("Student in charge of typing code and submitting .zip:");
        System.out.println("Name: JiaJia Liu (jpl5840@psu.edu)");

        List<Person> people = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        // TODO 02 + Single-letter variable names are bad (except when a loop index)
        Person person;

        boolean newPerson = false;
        do {
            boolean correct = true;
            person = new Person();


            // TODO 03 + The code for the first/midddle/last is virtually the same.  Put a static method in ConsoleHelper, and call it from here
            //First Name
            ConsoleHelper.getFirstName(person);
            /*
            System.out.print("Enter a First Name: ");
            do {
                person.firstName = keyboard.nextLine();
                if (person.firstName.equals("")) {
                    correct = false;
                    System.out.println("Enter a valid Name!");
                } else {
                    correct = true;
                }
            }
            while (!correct);

             */

            //Middle Name
            ConsoleHelper.getMiddleName(person);
            /*
            System.out.print("Enter a Middle Name: ");
            do {
                person.middleName = keyboard.nextLine();
                if (person.middleName.equals("")) {
                    System.out.println("Enter a valid Name!");
                    correct = false;
                } else {
                    correct = true;
                }
            }
            while (!correct);

             */

            //Last Name
            ConsoleHelper.getLastName(person);
            /*
            System.out.print("Enter a Last Name: ");
            do {
                person.lastName = keyboard.nextLine();
                if (person.lastName.equals("")) {
                    System.out.println("Enter a valid Name!");
                    correct = false;
                } else {
                    correct = true;
                }
            }
            while (!correct);

             */

            // TODO 04 - Create a method in ConsoleHelper that accepts a prompt, a list of valid values, and an error message.  Then replace this with a call to that method
            //Eye Color
            String[] validAnswers = {"brown", "blue", "green", "hazel", "amber"};
            System.out.print("Enter an Eye Color (brown/blue/green/hazel/amber): ");

            ConsoleHelper.getEyeColor(keyboard, validAnswers);
            /*
            do {
                person.eyes = keyboard.nextLine();
                if (person.eyes.equals("brown") || person.eyes.equals("blue") || person.eyes.equals("green") || person.eyes.equals("hazel") || person.eyes.equals("amber")) {
                    correct = true;
                } else {
                    System.out.println("Enter a valid eye color!");
                    correct = false;
                }
            } while (!correct);

             */


            // TODO 05 - 1920 is used 3 times.  How can you improve that?
            //Add Birth Year
            boolean validYear;
            do {
                validYear = true;

                System.out.println("Enter a birth year over 1920: ");
                String userInput = keyboard.nextLine();
                try {
                    person.bYear = Integer.parseInt(userInput);
                } catch (Exception e) {
                    validYear = false;
                }
                if (!validYear || (person.bYear <= 1920)) {
                    validYear = false;
                    System.out.println("Enter a year greater than 1920!");
                    System.out.println();
                }
            } while (!validYear);

            //Add the person to the List
            people.add(person);


            // TODO 06 - Can anything be done to clean up this code?
            //Prompt for new person
            String answer = "";
            System.out.println("Would you like to add a new person?");
            newPerson = false;
            answer = keyboard.nextLine();
            if (answer.equals("y") || (answer.equals("yes")) || (answer.equals("Yes"))) {
                newPerson = true;
            } else if (answer.equals("n") || (answer.equals("no")) || (answer.equals("No"))) {
                newPerson = false;
            }

        }
        while (newPerson);

        //Printing the Names
        System.out.println("Would you like the first name printed first? y/n");
        String answerfnf = keyboard.nextLine();

        if (answerfnf.equals("y")) {
            for (Person onePerson : people) {
                System.out.println(onePerson.getName(true));
            }
        } else if (answerfnf.equalsIgnoreCase("n")) {
            for (Person onePerson : people) {
                System.out.println(onePerson.getName(false));
            }
        }

        /*
        if (answerfnf.equals("Yes")) {
            for (Person onePerson : people) {
                System.out.println(onePerson.getName(true));
            }
        } else if (answerfnf.equals("No")) {
            for (Person onePerson : people) {
                System.out.println(onePerson.getName(false));
            }
        }
         */
    }
}
