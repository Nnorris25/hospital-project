
public abstract class Employee {
	private String name;
	private String employeeNumber;
	private int salary;

	public Employee(String name, String employeeNumber, int salary) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.salary =salary;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public int calculatePay() {
	return salary;
		
	}
}
