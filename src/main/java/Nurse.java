
public class Nurse extends Employee implements CareForPatient {
	private int numberOfPatients;

	public Nurse(String name, String employeeNumber, int numberOfPatients, int salary) {
		super(name, employeeNumber, salary);
		this.numberOfPatients = numberOfPatients;

	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void careForPatient(Patient patient) {
		patient.heal(5);
	}

	@Override
	public String toString() {
		return getName() + " " + getEmployeeNumber() + " " + getNumberOfPatients();
	}
}
