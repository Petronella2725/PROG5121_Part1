/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121_part1;

import java.util.Scanner;

/**
 *
 * @author petro
 */
public class PROG5121_Part1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Login loginApp = new Login();

        System.out.println("=== USER REGISTRATION ===");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Cell Phone Number (e.g., +27123456): ");
        String cellNumber = scanner.nextLine();

        String regResult = loginApp.registerUser(username, password, cellNumber, firstName, lastName);
        System.out.println("\n" + regResult + "\n");

        // Proceed to Login only if registration passed
        if (regResult.contains("successfully added")) {
            System.out.println("=== USER LOGIN ===");

            System.out.print("Enter Username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = scanner.nextLine();

            boolean isAuthenticated = loginApp.loginUser(loginUser, loginPass);
            System.out.println(loginApp.returnLoginStatus(isAuthenticated));
        }

        scanner.close();
    }
}
