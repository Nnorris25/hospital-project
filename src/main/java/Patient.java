
public class Patient {
	private final int BLOOD_LEVEL = 20;
	private final int HEALTH_LEVEL = 10;
	private String patientId;
	private String patientName;

	private int bloodLevel = BLOOD_LEVEL;
	private int healthLevel = HEALTH_LEVEL;

	public int getBLOOD_LEVEL() {
		return BLOOD_LEVEL;
	}

	public int getHEALTH_LEVEL() {
		return HEALTH_LEVEL;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public Patient(String patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;
	}

	public Patient(String patientId, String patientName, int bloodLevel, int healthLevel) {
		this.bloodLevel = bloodLevel;
		this.healthLevel = healthLevel;
		this.patientId = patientId;
		this.patientName = patientName;

	}

	public void heal(int amountToHeal) {
		healthLevel += amountToHeal;

	}

	public void bleed(int amountToBleed) {
		bloodLevel -= amountToBleed;

	}

	public String getPatientID() {
		return patientId;
		
	}

	public String getPatientName() {
		return patientName;
	}

	
	
}
