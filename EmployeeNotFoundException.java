package EDBMS;

public class EmployeeNotFoundException extends RuntimeException{
	private String message;

	EmployeeNotFoundException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
