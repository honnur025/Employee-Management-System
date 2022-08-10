package EDBMS;

public class Employee {
	private int eid;
	private String name;
	private Double salary;
	private String desig;
	public Employee(int eid, String name, double salary, String desig) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
	}
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String toString() {
		return "Eid :"+eid+"\nEName :"+name+"\nSalary :"+salary+"\nDesignation :"+desig+"\n";
	}
}
