package EDBMS;

import java.util.Comparator;

public class SortByEmployeeDesig implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.getDesig().compareTo(e2.getDesig());
	}
}
