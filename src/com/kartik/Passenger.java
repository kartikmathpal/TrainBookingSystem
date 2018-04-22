package com.kartik;

import java.util.*;

public class Passenger {

     private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Booking book= new Booking();
        //Booking cancel = new Booking();
        Train train = new Train();
        String option;
        System.out.println("Enter departure station");
        train.setToStation(scanner.nextLine());
        System.out.println("\nEnter arrival station");
        train.setFromStation(scanner.nextLine());
        System.out.println("Train(s) departing from -> " + train.getFromStation() + " and arriving at -> " + train.getToStation() + " are :");
        System.out.println(train.getTrainList());;
        System.out.println("Select Train to check seat availability");
        option = scanner.nextLine();
        switch (option){
            case "A":
                System.out.println("Seat available in Train A : ");
                System.out.println(train.getHm().get("A"));
                break;
            case "B":
                System.out.println("Seat available in Train B: ");
                System.out.println(train.getHm().get("B"));
                break;
            case  "C":
                System.out.println("Seat available in Train C : ");
                System.out.println(train.getHm().get("C"));
                break;
            case "D":
                System.out.println("Seat available in Train D : ");
                System.out.println(train.getHm().get("D"));
                break;
            default:
                System.out.println("Not a Valid option Bro!");
                break;
        }
        System.out.println("\n----Seat Booking---");
        System.out.println("Input Train and No of Tickets");

        System.out.println("Input Train");
        String obj = scanner.nextLine();
        System.out.println("Input no of seats to book");
        int tickets = scanner.nextInt();
        book.bookTicket(obj, tickets);
//
//        System.out.println("Cancel Ticket");
//        System.out.println("Input Train");
//        String obj1 = scanner.nextLine();
//        System.out.println("Input no of seats to cancel");
//        int ticket1 = scanner.nextInt();
//        book.cancelTicket(obj1,ticket1);
    }


}
