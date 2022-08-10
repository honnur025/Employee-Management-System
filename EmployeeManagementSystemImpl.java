package EDBMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem{

	Scanner sc = new Scanner(System.in);

	Map<Integer,Employee> m= new LinkedHashMap<Integer, Employee>();

	@Override
	public void addEmployee() {
		System.out.println("Enter your EId,EName,Salary and Designation");
		int eid=sc.nextInt();
		String ename=sc.next();
		double sal=sc.nextDouble();
		String desig=sc.next();
		Employee e= new Employee(eid, ename, sal, desig);
		m.put(eid, e);
		System.out.println("Employee Recorded...!\n");
	}

	@Override
	public void removeEmployee() {
		System.out.println("Enter Employee id");
		int eid=sc.nextInt();
		if(m.containsKey(eid)) {
			m.remove(eid);
			System.out.println("Employee Removed....!\n");
		}else {
			try {
				throw new EmployeeNotFoundException("Employee not Found...!");
			}
			catch(EmployeeNotFoundException e) {
				System.err.println(e.getMessage()+"\n");
			}
		}
	}

	@Override
	public void removeAllEmpmoyee() {
		m.clear();
		System.out.println("Deleted All Employees....!\n");
	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter Employee id");
		int eid=sc.nextInt();
		if(m.containsKey(eid)) {
			System.out.println(m.get(eid));
		}else {
			try {
				throw new EmployeeNotFoundException("Employee Not Found....!");
			}
			catch(EmployeeNotFoundException e) {
				System.err.println(e.getMessage()+"\n");
			}
		}
	}

	@Override
	public void displayAllEmployee() {
		Set<Integer> s= m.keySet();
		for(int eid: s) {
			System.out.println("Employee Info\n"+m.get(eid));
		}
	}

	/**
	 *
	 */
	@Override
	public void updateEmployee() {
		System.out.println("Enter Employee Id");
		int eid=sc.nextInt();
		if(m.containsKey(eid)) {
			Employee e=m.get(eid);
			System.out.println("1:Update EName\n2:Update Salary\n3:Update Designation\n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Employee Name");
				String name=sc.next();
				e.setName(name);
				System.out.println("Name Updated...!\n");
				break;
			case 2:
				System.out.println("Enter Employee Salary");
				double sal=sc.nextDouble();
				e.setSalary(sal);
				System.out.println("Salary Is Updated...!\n");
				break;
			case 3:
				System.out.println("Enter Employee Designation");
				String desig=sc.next();
				e.setDesig(desig);
				System.out.println("Designation Is Updated...!\n");
				break;
			default :
				System.out.println("Invalid Choice\n");
			}
		}
	}

	@Override
	public void countEmployee() {
		System.out.println("Num Of Employee :"+m.size()+"\n");
	}

	@Override
	public void sortEmployee() {
		ArrayList<Employee> al= new ArrayList<Employee>();
		Set<Integer> s= m.keySet();
		for(Integer emp: s) {
			al.add(m.get(emp));
		}
		System.out.println("1:Sort By Eid\n2:Sort By EName\n3:Sort By Salary\n4:Sort By Designation\n");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Sort By Employee Id");
			Collections.sort(al,new SortByEmployeeId());
			for(Employee emp:al) {
				System.out.println(emp);
			}
			break;
		case 2:
			System.out.println("Sort By Employee Name");
			Collections.sort(al,new SortByEmployeeName());
			for(Employee emp:al) {
				System.out.println(emp);
			}
			break;
		case 3:
			System.out.println("Sort By Employee Salary");
			Collections.sort(al,new SortByEmployeeSalary());
			for(Employee emp:al) {
				System.out.println(emp);
			}
			break;
		case 4:
			System.out.println("Sort By Employee Designation");
			Collections.sort(al,new SortByEmployeeDesig());
			for(Employee emp:al) {
				System.out.println(emp);
			}
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
