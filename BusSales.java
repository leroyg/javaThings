/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussales;

   import java.util.Scanner;
/**
 *
 * @author workstation1
 */
public class BusSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Get the # of bus seats required
        System.out.print("How many bus seats would you like to purchase? ");
        int busTickets = in.nextInt();

        //Get the cost per seat
        System.out.print("How much does each seat cost (in $)? ");
        double ticketPrice = in.nextDouble();

        //Compute the price
       double busSales = busTickets * ticketPrice;

       // Display the incremental cost each and total.
       System.out.println("Great, you've reserved " + busTickets + " seats on the bus!");
       System.out.printf("One ticket cost $%.2f", ticketPrice);
       System.out.println();
       System.out.printf("Your total for all your tickets is $%.2f", busSales);
       System.out.println();
       System.out.println("Thank you for your business. Please travel again.");

       /*Confirm amount with user
       *System.out.print("Is that total correct (Yes or no)? ");
       *String transactionConfirm = in.next();
       *
       *Evaluate confirmation
       *if ("Yes" == transactionConfirm )
       *{
       *System.out.println("Thank you for your business. Please travel again.");
    *}
       *else (return);
    */
    }
}
