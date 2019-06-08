package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti parola:");
        String password = input.nextLine();
        boolean valid = true;

        if (password.length()<6) {
            System.out.println("Lungimea trebuie minim 6 caractere!");
            valid=false;
        }

        if(!Pattern.matches(".*[a-z].*",password)) {
            System.out.println("Minim o litera mica");
            valid=false;
        }

        if(!Pattern.matches(".*[A-Z].*",password))
        {
            System.out.println("Minim o litera mare");
            valid=false;
        }

        if(!Pattern.matches(".*\\d.*",password))
        {
            System.out.println("Minim un digit!");
            valid=false;
        }

        System.out.println(valid ? "Parola corecta!":"Parola incorecta!");
    }
}
