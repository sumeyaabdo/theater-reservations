package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String fullName = input.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String showDate = input.nextLine();

        System.out.println("How many tickets would you like?");
        int numberOfTickets = input.nextInt();

        String[] names = fullName.trim().split("\\s+");
        String firstName = names[0];
        String lastName = names[names.length - 1];

        String[] dateParts = showDate.split("/");
        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2];
        String formattedDate = year + "-" + month + "-" + day;


    }
}
