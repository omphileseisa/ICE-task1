/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class IceTask1 {

    public static void main(String[] args) {
   String studentName;
   int numberOfTickets;
   int  ticketPrice = 200;
   int totalAmount;
   
   
   Scanner input = new Scanner(System.in);
        System.out.println("Enter your studentName:");
        studentName = input.nextLine();
        System.out.println("Enter numberOfTickets:");
        numberOfTickets = Integer.parseInt(input.nextLine());
        
        
        //Calculate the total amount
        totalAmount = ticketPrice * numberOfTickets;
        
        // Display results
        JOptionPane.showMessageDialog(null,"studentName is " + studentName );
        JOptionPane.showMessageDialog(null, "numberOfTickets " + numberOfTickets );
        JOptionPane.showMessageDialog(null, studentName + "\n" + "you need to pay R " + "\n" + totalAmount);
        
    }
}
