import java.util.HashMap;
import java.util.Map;

public class Hospital {
	Map<String, Employee> highStHospitalEmployees = new HashMap<>();
	Map<String, Patient> highStHospitalPatients = new HashMap<>();

	// add employees
	// total amount of employees
	// remove patients
	// remove employees
	// total amount of patients
	// status of employees

	public int getPatientCount() {

		return highStHospitalPatients.size();
	}

	public void addPatient(Patient patient) {
		highStHospitalPatients.put(patient.getPatientID(), patient);
	}

	public void removePatientId(String patientId) {
		highStHospitalPatients.remove(patientId);
	}
}
