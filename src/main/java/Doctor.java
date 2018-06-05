
public class Doctor extends Employee implements CareForPatient, DrawBlood {

	private String specialty;

	public Doctor(String name, String employeeNumber, String specialty, int salary) {
		super(name, employeeNumber, salary);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void careForPatient(Patient patient) {
		patient.heal(10);
	}

	public void drawBlood(Patient patient) {
		patient.bleed(5);
	}
}
