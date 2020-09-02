import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            /*
            Each question and response is structured like the following:
            ----------
            print(question);
            variable = answer;
            print(response with answer);
            ----------
            The variables are named accordingly.
            */
            System.out.println("What is your name?");
            String name = scan.next();
            System.out.println("Nice to meet you, " + name + ". My name is Chatbot.");

            System.out.println("What is your favorite color?");
            String color = scan.next();
            System.out.println("I also like " + color + ". However, my favorite color is not in the human visible spectrum.");

            System.out.println("What is your favorite kind of music?");
            String music = scan.next();
            System.out.println("Sometimes I like to listen to " + music + ", but most of the time I listen to Cosmic Static.");

            System.out.println("How are you feeling today?");
            String feeling = scan.next();
            System.out.println("I understand that you feel " + feeling + ". If I had feelings, I'm sure I'd feel that way too.");

            System.out.println("On a scale of 1 to 10, how much do you like Computer Science?");
            String CompSci = scan.next();
            System.out.println("Well, on a scale from 1 to 10, I'd say your taste in classes is " + CompSci + "/10!");


        scan.close();
    }
}
