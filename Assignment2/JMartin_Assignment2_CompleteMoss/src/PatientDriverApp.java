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
   Print your Name here: Jason Martin
*/

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Patient's First Name: ");
		String first = sc.nextLine();
		System.out.print("Enter Patient's Middle Name: ");
		String middle = sc.nextLine();
		System.out.print("Enter Patient's Last Name: ");
		String last = sc.nextLine();
		System.out.print("Enter Patient's Address: ");
		String address = sc.nextLine();
		System.out.print("Enter City: ");
		String city = sc.nextLine();
		System.out.print("Enter State: ");
		String state = sc.nextLine();
		System.out.print("Enter ZIP Code: ");
		String zip = sc.nextLine();
		System.out.print("Enter Phone Number: ");
		String phone = sc.nextLine();
		System.out.print("Enter Emergency Contact Name: ");
		String emergencyName = sc.nextLine();
		System.out.print("Enter Emergency Contact Phone: ");
		String emergencyPhone = sc.nextLine();

		Patient patient = new Patient(first, middle, last, address, city, state, zip, phone, emergencyName, emergencyPhone);

		System.out.println("Enter Procedure 1 Details:");
		System.out.print("Name: ");
		String p1name = sc.nextLine();
		System.out.print("Date: ");
		String p1date = sc.nextLine();
		System.out.print("Practitioner: ");
		String p1doc = sc.nextLine();
		System.out.print("Charge: ");
		double p1charge = Double.parseDouble(sc.nextLine());
		Procedure proc1 = new Procedure(p1name, p1date, p1doc, p1charge);

		System.out.println("Enter Procedure 2 Details:");
		Procedure proc2 = new Procedure();
		System.out.print("Name: ");
		proc2.setName(sc.nextLine());
		System.out.print("Date: ");
		proc2.setDate(sc.nextLine());
		System.out.print("Practitioner: ");
		proc2.setPractitioner(sc.nextLine());
		System.out.print("Charge: ");
		proc2.setCharge(Double.parseDouble(sc.nextLine()));

		System.out.println("Enter Procedure 3 Details:");
		Procedure proc3 = new Procedure(sc.nextLine(), sc.nextLine());
		System.out.print("Practitioner: ");
		proc3.setPractitioner(sc.nextLine());
		System.out.print("Charge: ");
		proc3.setCharge(Double.parseDouble(sc.nextLine()));

		System.out.println(patient);
		System.out.println(proc1);
		System.out.println(proc2);
		System.out.println(proc3);

		double total = proc1.getCharge() + proc2.getCharge() + proc3.getCharge();
		System.out.printf("Total Charges: $%,.2f\n", total);

		System.out.println("\nThe program was developed by a Student: Jason Martin 06/30/25");
		sc.close();
	}
}
