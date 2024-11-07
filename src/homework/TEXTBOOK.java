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
public class TEXTBOOK extends BOOK {

    public String status;

    public TEXTBOOK() {
    }

    public TEXTBOOK(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double Calculate_Discount() {

        if (status.equals("new")) {
            return quantily * unitPrice * 0.10;

        } else {
            return quantily * unitPrice * 0.50;
        }
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter status: ");
        status = sc.nextLine();

    }

    public void output() {
        super.output();
        System.out.println(" status: " + status);
    }

    @Override
    public double Calculate_Total() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
