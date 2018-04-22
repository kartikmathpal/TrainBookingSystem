package com.kartik;

import java.util.Scanner;

public class Booking {

    Train train = new Train();

    //bookTicket
    void bookTicket(String obj, int ticketCount) {
        //Check if seat available
        if (ticketCount <= train.getHm().get(obj)) {
            //Enter Info
            //Select Payment
            System.out.println("Dear customer  " + ticketCount + " tickets were booked sucessfully.");

            //update seats
            int val = train.getHm().get(obj) - ticketCount;
            if (val < 0) {
                System.out.println("All seats Full!!!");
            } else {
                train.hm.put(obj, val);
                System.out.println("Current Seats remaining : " + train.getHm().get(obj));
            }

        } else {
            System.out.println("No of requested seats not available!!");
        }
    }

    //cancelTicket
    void cancelTicket(String obj, int ticketCount) {
        //take user info
        // check if cancel count more than booking count for that id
        System.out.println("Ticket for Train " + obj + " Cancelled.");

        //update seat
        int val = train.getHm().get(obj) + ticketCount;
        if (val > train.getHm().get(obj)) {
            System.out.println("All seats Empty!!!");
        } else {
            train.hm.put("A", val);
            System.out.println("Current Seats remaining : " + train.getHm().get(obj));
        }

    }
}



