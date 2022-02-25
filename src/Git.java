import java.util.Scanner;

public class Git {
  public static void main(String[] args) {
    System.out.println("It works!");
    System.out.println("It still works\n");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Type your name: ");
    String userInput = scanner.nextLine();
    System.out.print("Type your age: ");
    int userInput2 = scanner.nextInt();

    System.out.printf("\nWelcome, " + userInput + "(%d)\n", userInput2);

    System.out.println("Test");

  }
}
