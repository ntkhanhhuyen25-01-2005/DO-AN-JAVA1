/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class REFERENCE_BOOK extends BOOK {

    public double tax;

    public REFERENCE_BOOK() {
    }

    public REFERENCE_BOOK(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double Calculate_Discount() {
        return quantily * unitPrice * 0.05;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tax: ");
        tax = sc.nextDouble();

    }

    public void output() {
        super.output();
        System.out.println(" tax: " + tax);
    }

    @Override
    public double Calculate_Total() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
