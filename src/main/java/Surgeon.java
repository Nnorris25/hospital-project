
public class Surgeon extends Doctor {

	private boolean isOperating;
	
	public Surgeon(String name, String employeeNumber, String specialty, int salary, boolean isOperating) {
		super(name, employeeNumber, specialty, salary);
	
		this.isOperating = isOperating;
		
	}

	public boolean isOperating() {
		return isOperating;
	}

	public void toggleIsOperating() {
		isOperating = !isOperating;
	}
	
	

}
