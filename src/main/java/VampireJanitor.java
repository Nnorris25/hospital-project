
public class VampireJanitor extends Janitor implements DrawBlood {
	private int bloodThirst;

	public VampireJanitor(String name, String employeeNumber, int salary, boolean isSweeping, int bloodThirst) {
		super(name, employeeNumber, salary, isSweeping);
		this.bloodThirst = bloodThirst;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.bleed(2);

	}

	public void suckBlood(Patient patient) {
		drawBlood(patient);
		bloodThirst -= 2;

	}

	public int getBloodThirst() {
		return bloodThirst;
	}

}
