package EDBMS;

import java.util.Scanner;

public class EmployeeDB {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		EmployeeManagementSystem e= new EmployeeManagementSystemImpl();

		System.out.println("Welcome to EDBMS\n  ------------");

		while(true) {
			System.out.println("1:ADD EMPLOYEE\n2:REMOVE EMPLOYEE\n3:REMOVE ALL EMPLOYEES");
			System.out.println("4:DISPLAY EMPLOYEE\n5:DISPLAY ALL EMPLOYEE\n6:UPDATE EMPLOYEES");
			System.out.println("7:COUNT EMPLOYEE\n8:SORT EMPLOYEE\n9:EXIT");

			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				e.addEmployee();
				break;
			case 2:
				e.removeEmployee();
				break;
			case 3:
				e.removeAllEmpmoyee();
				break;
			case 4:
				e.displayEmployee();
				break;
			case 5:
				e.displayAllEmployee();
				break;
			case 6:
				e.updateEmployee();
				break;
			case 7:
				e.countEmployee();
				break;
			case 8:
				e.sortEmployee();
				break;
			case 9:
				System.out.println("Thank You...!\n");
				System.exit(0);
			default:
				System.out.println("Invalid Choice\n");
			}
		}
	}
}
