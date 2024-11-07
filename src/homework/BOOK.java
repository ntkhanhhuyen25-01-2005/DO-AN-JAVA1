/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public abstract class BOOK implements IBOOK {

    public String bookID;
    public String publisher;
    public LocalDate entryDate;
    public double unitPrice;
    public double quantily;

    public BOOK() {
    }

    public BOOK(String bookID, String publisher, LocalDate entryDate, double unitPrice, double quantily) {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantily = quantily;

    }

    public abstract double Calculate_Discount();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bookID: ");
        bookID = sc.nextLine();
        System.out.println("Enter publisher: ");
        publisher = sc.nextLine();
        while (true) {
            System.out.print("Enter Entry Date (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {

                entryDate = LocalDate.parse(dateStr, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format! Please enter the date in dd/MM/yyyy format.");
            }
        }
        System.out.println("Enter unitPrice: ");
        unitPrice = sc.nextDouble();
        System.out.println("Enter quantily: ");
        quantily = sc.nextDouble();
    }

    public void output() {
        System.out.println(" bookID: " + bookID);
        System.out.println(" publisher: " + publisher);
        System.out.println(" entryDate: " + entryDate);
        System.out.println(" unitPrice: " + unitPrice);
        System.out.println(" quantily: " + quantily);

    }
}
