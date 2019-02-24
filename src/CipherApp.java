import java.util.InputMismatchException;
import java.util.Scanner;

public class CipherApp {

    private Controller controller;
    private Scanner scr = new Scanner(System.in);

    public CipherApp() {
        controller = new Controller();
    }

    private void printMenu() {
        System.out.println("0 - exit");
        System.out.println("1 - encrypt string");
        System.out.println("2 - decrypt string");
    }

    public void mainLoop() {
        boolean isRunning = false;

        while (!isRunning) {
            printMenu();

                String option = scr.nextLine();

            switch (option) {
                case "0":
                    isRunning = true;
                    System.out.println("Shutting down");
                    break;
                case "1":
                    encryptString();
                    break;
                case "2":
                    decryptString();
                    break;
                default:
                    System.out.println("Invalid input, try again");
            }
        }
    }

    private void encryptString() {
        System.out.println("Enter text to encrypt");
        String plainText = scr.nextLine();
        System.out.println("Enter offset");
        int offset = Integer.valueOf(scr.nextLine());
        String encrypted = controller.encrypt(plainText, offset);
        System.out.println(encrypted);

    }

    private void decryptString() {
        System.out.println("Enter encrypted string");
        String encryptedString = scr.nextLine();
        controller.decrypt(encryptedString);
    }
}
