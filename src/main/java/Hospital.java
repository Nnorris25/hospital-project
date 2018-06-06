import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
	Map<String, Employee> highStHospitalEmployees = new HashMap<>();
	Map<String, Patient> highStHospitalPatients = new HashMap<>();

	public Collection<Patient> getPatients()
	{
		return highStHospitalPatients.values();
	}
	
	public String listPatientNamesAndIDs() {
		String status = "";
		for (Patient patient : getPatients()) {
			status +=  patient.getPatientID() + " " + patient.getPatientName() + "\n";
		}
		return status;		
	}
	
	public int getPatientCount() {
		return highStHospitalPatients.size();
	}

	public void addPatient(Patient patient) {
		highStHospitalPatients.put(patient.getPatientID(), patient);
	}

	public void removePatientId(String patientId) {
		highStHospitalPatients.remove(patientId);
	}

	public int getEmployeeCount() {
		return highStHospitalEmployees.size();
	}

	public void addEmployee(Employee employee) {
		highStHospitalEmployees.put(employee.getEmployeeNumber(), employee);

	}

	public void removeEmployeeNumber(String employeeNumber) {
		highStHospitalEmployees.remove(employeeNumber);

	}

	public String listEmployeesNamesAndIDs() {
		String status = "";
		for (Employee employee : listEmployees()) {
			status +=  employee.getEmployeeNumber() + "\t" + employee.getName() + "\n";
		}
		return status;		
	}

	public Collection<Employee> listEmployees() {
		return highStHospitalEmployees.values();
	}
}
