package org.example;
import java.util.Scanner;

public class PhoneBookMenu {
    private Add phoneBook;
    private Scanner scanner;

    public PhoneBookMenu(Add phoneBook) {
        this.phoneBook = phoneBook;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nВыберите опцию:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Показать контакты");
            System.out.println("3. Выход");
            System.out.print("Ваша команда ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCont();
                    break;
                case 2:
                    phoneBook.displayContacts();
                    break;
                case 3:
                    System.out.println("Выход.");
                    System.exit(0);
                default:
                    System.out.println("Не корректно задана опция, повторите");
            }
        }
    }
}


