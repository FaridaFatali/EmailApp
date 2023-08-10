package org.example;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "anycompany.com";


    Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
    }

    private String setDepartment() {
        System.out.println("Department codes to create a new email address for the new worker:" +
                "\n\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting" +
                "\n0 for none" +
                "\nEnter your department code:");

        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();

        if (departmentChoice == 1) {
            department = "sales";
        } else if (departmentChoice == 2) {
            department = "dev";
        } else if (departmentChoice == 3) {
            department = "acct";
        } else {
            department = "";
        }

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + (department.isEmpty() ? "" : department + ".") + companySuffix;

        return department;
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ-abcdefghijklmnopqrstuvwxyz_1234567890%&*";
        char[] password = new char[length];

        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nRANDOM PASSWORD: " + this.password +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
