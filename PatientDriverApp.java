package assignment2;

import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Driver class to test Patient and Procedure classes
 * Due: 07/27/2024
 * Platform/compiler: Eclipse / Java 17
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Student Name: Jason Martin
 */

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        // Collect patient information from user
        System.out.print("Enter Patient's First Name: ");
        String firstName = inputReader.nextLine();

        System.out.print("Enter Patient's Middle Name: ");
        String middleName = inputReader.nextLine();

        System.out.print("Enter Patient's Last Name: ");
        String lastName = inputReader.nextLine();

        System.out.print("Enter Patient's Address: ");
        String address = inputReader.nextLine();

        System.out.print("Enter City: ");
        String city = inputReader.nextLine();

        System.out.print("Enter State: ");
        String state = inputReader.nextLine();

        System.out.print("Enter ZIP Code: ");
        String zip = inputReader.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = inputReader.nextLine();

        System.out.print("Enter Emergency Contact Name: ");
        String emergencyContactName = inputReader.nextLine();

        System.out.print("Enter Emergency Contact Phone: ");
        String emergencyContactPhone = inputReader.nextLine();

        // Create Patient object with collected info
        Patient patient = new Patient(firstName, middleName, lastName, address, 
        		city, state,
                zip, phoneNumber, emergencyContactName, emergencyContactPhone);

        // Procedure 1 inputs
        System.out.println("Enter Procedure 1 Details:");
        System.out.print("Name: ");
        String procedureOneName = inputReader.nextLine();

        System.out.print("Date: ");
        String procedureOneDate = inputReader.nextLine();

        System.out.print("Practitioner: ");
        String procedureOnePractitioner = inputReader.nextLine();

        System.out.print("Charge: ");
        double procedureOneCharge = Double.parseDouble(inputReader.nextLine());

        Procedure procedureOne = new Procedure(procedureOneName, 
        		procedureOneDate, procedureOnePractitioner, procedureOneCharge);

        // Procedure 2 inputs
        System.out.println("Enter Procedure 2 Details:");
        System.out.print("Name: ");
        String procedureTwoName = inputReader.nextLine();

        System.out.print("Date: ");
        String procedureTwoDate = inputReader.nextLine();

        Procedure procedureTwo = new Procedure(procedureTwoName, 
        		procedureTwoDate);

        System.out.print("Practitioner: ");
        procedureTwo.setPractitioner(inputReader.nextLine());

        System.out.print("Charge: ");
        procedureTwo.setCharge(Double.parseDouble(inputReader.nextLine()));

        // Procedure 3 inputs
        System.out.println("Enter Procedure 3 Details:");
        Procedure procedureThree = new Procedure();
        System.out.print("Name: ");
        procedureThree.setName(inputReader.nextLine());

        System.out.print("Date: ");
        procedureThree.setDate(inputReader.nextLine());

        System.out.print("Practitioner: ");
        procedureThree.setPractitioner(inputReader.nextLine());

        System.out.print("Charge: ");
        procedureThree.setCharge(Double.parseDouble(inputReader.nextLine()));

        // Display all patient and procedure info
        displayPatient(patient);
        displayProcedure(procedureOne);
        displayProcedure(procedureTwo);
        displayProcedure(procedureThree);

        // Calculate and display total charges
        double totalCharges = procedureOne.getCharge() + 
        		procedureTwo.getCharge() + procedureThree.getCharge();
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        inputReader.close();

        System.out.println("\nThe program was developed by a Student: "
        		+ "Jason Martin 06/30/25");
    }

    public static void displayPatient(Patient p) {
        System.out.println(p);
    }

    public static void displayProcedure(Procedure p) {
        System.out.println(p);
    }
}
