/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class BOOKLIST {

    private final ArrayList<BOOK> list = new ArrayList<>();

    public void addNew(BOOK book) {
        list.add(book);
    }

    public void showListBook() {
        int i = 1;
        System.out.println("------------LIST BOOK------------");
        for (BOOK book : list) {
            System.out.println("-------------book " + i + "--------------");
            book.output();
            i++;
        }
    }

    public void updateInforByID(String ID) {
        BOOK book = FindBookID(ID);
        if (book != null) {
            book.input();
        } else {
            System.out.println("No book found with ID: " + ID);
        }
    }

    public BOOK FindBookID(String ID) {
        for (BOOK book : list) {
            if (book.bookID.equals(ID)) {
                return book;
            }
        }
        return null;
    }

    public void deleteBOOK(String ID) {
        BOOK book = FindBookID(ID);
        if (book != null) {
            list.remove(book);
        } else {
            System.out.println("No book found with ID: " + ID);
        }
    }

    public void FindBOOkByID(String ID) {
        BOOK book = FindBookID(ID);
        if (book != null) {
            book.output();
        } else {
            System.out.println("No book found with ID: " + ID);
        }
    }

    public void showMenu() {
        int choice;
        String bookid;
        do {
            System.out.println("1. Add book.");
            System.out.println("2. Show list book.");
            System.out.println("3. Find book by id.");
            System.out.println("4. Update book by id.");
            System.out.println("5. Delete book by id.");
            System.out.println("6. Exit.");
            System.out.print("Enter selection: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---------------------------------");
                    int choice1;
                    System.out.println("Enter (1-Text book, 2-Reference book)");
                    do {
                        System.out.print("Selecion: ");
                        choice1 = sc.nextInt();
                        if (choice1 == 1) {
                            TEXTBOOK textbook = new TEXTBOOK();
                            textbook.input();
                            list.add(textbook);
                            break;
                        } else if (choice1 == 2) {
                            REFERENCE_BOOK refbook = new REFERENCE_BOOK();
                            refbook.input();
                            list.add(refbook);
                            break;
                        }
                        System.out.println("Erorr, please enter(1-Text book, 2-Reference book)");
                    } while (true);
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    showListBook();
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.print("Enter ID: ");
                    sc.nextLine();
                    bookid = sc.nextLine();
                    System.out.println("-----------BOOKS FOUND-----------");
                    FindBOOkByID(bookid);
                    System.out.println("---------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.print("Enter ID: ");
                    sc.nextLine();
                    bookid = sc.nextLine();
                    System.out.println("-----------BOOK UPDATE-----------");
                    updateInforByID(bookid);
                    System.out.println("---------------------------------");
                    break;
                case 5:
                    System.out.println("---------------------------------");
                    System.out.print("Enter ID: ");
                    sc.nextLine();
                    bookid = sc.nextLine();
                    deleteBOOK(bookid);
                    System.out.println("Book deleted successfully.");
                    System.out.println("---------------------------------");
            }
        } while (choice != 6);
    }
}
