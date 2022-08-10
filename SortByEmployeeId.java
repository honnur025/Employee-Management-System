package EDBMS;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEid()-e2.getEid();
	}

}
