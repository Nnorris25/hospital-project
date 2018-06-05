
public class VampireJanitor extends Janitor implements DrawBlood {
	private int bloodThirsty;

	public VampireJanitor(String name, String employeeNumber, int salary, boolean isSweeping) {
		super(name, employeeNumber, salary, isSweeping);
		this.bloodThirsty = bloodThirsty;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.bleed(2);

	}

	public void suckBlood(Patient patient) {
		drawBlood(patient);
		bloodThirsty -= 2;

	}

}
