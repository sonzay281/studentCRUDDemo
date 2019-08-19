/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.studentapp;

import com.ismt.studentapp.services.AddStudent;
import java.util.Scanner;

/**
 *
 * @author nepz
 */
public class StudentView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            switch (sc.nextInt()) {
                case 1:
                    AddStudent.addStudent();
                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:
                    System.out.println("Thank you for using our system.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option.");
                    System.exit(0);
            }

            System.out.println("Would you like to perform another action?[Y/N]");
            if (!sc.next().equalsIgnoreCase("Y")) {
                System.out.println("Thank you for using our system.");
                System.exit(0);
            }
        }
    }

    public static void menu() {
        System.out.println("Welcome to student management system.");
        System.out.println("1. Add Student\t 2. Gel All \t 3.Update ");
        System.out.println("4. Delete \t 5. Get By Id \t 6. Exit");
        System.out.print("Option:");
    }

}
