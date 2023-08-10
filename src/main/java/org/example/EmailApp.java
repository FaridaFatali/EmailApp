package org.example;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=U3Ibvu0htNs&list=PLMJlRf5sZ0zTN_ocpWCsWqaj02N4DVifM&index=1">...</a>
 * @author Farida Fatali
 * Creating email addres for the new worker using his department
 */

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Smith");
        System.out.println("\nYour info: \n" + email.showInfo());
    }
}