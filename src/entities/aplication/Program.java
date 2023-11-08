package entities.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee.Employee;
import entities.employee.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int qtContract = sc.nextInt();
		List <Employee> contract = new ArrayList<>();
		
		for(int i =0; i< qtContract; i++) {
			System.out.println("Employee "+ (i+1)+ " data");
			System.out.print("Outsourced (y/n)?");
			char carect = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name =sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHours = sc.nextDouble();
		
		if(carect == 'y') {
			System.out.print("Additional charge:");
			double addCharge = sc.nextDouble();
			Employee  employeeOut=  new OutsourcedEmployee(name,hours,valueHours,addCharge);
			contract.add(employeeOut);
		}
		else {
			Employee employee = new Employee(name,hours,valueHours);
			contract.add(employee);
		}
		}
		System.out.println("Payments:");
		for (Employee contracts : contract) {
			
			System.out.println(contracts.getName()+" - $ "+String.format("%.2f",contracts.payment()));
		}
	
	}
}
