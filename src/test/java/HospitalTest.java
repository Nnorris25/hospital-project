import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HospitalTest {
	Hospital hospital = new Hospital();
	Patient patientOne = new Patient("777", "Timmy");
	Employee employeeOne = new Doctor("phil", "3333", "Heart", 90000);

	@Test
	public void shouldAddPatient() {
		// arrange
		int beforeAddingPatient = hospital.getPatientCount();
		// act
		hospital.addPatient(patientOne);
		int afterAddingPatient = hospital.getPatientCount();

		// asset

		assertThat(afterAddingPatient, is(equalTo(beforeAddingPatient + 1)));
	}

	@Test
	public void shouldRemovePatient() {
		// arrange
		hospital.addPatient(patientOne);
		int countBeforeRemovingPatient = hospital.getPatientCount();
		// act
		hospital.removePatientId(patientOne.getPatientId());
		int countAfterRemovingPatient = hospital.getPatientCount();
		// assert
		assertThat(countAfterRemovingPatient, is(equalTo(countBeforeRemovingPatient-1)));
	}
	@Test
	public void shouldAddEmployees() {
		//arrange
		int beforeAddingEmployee = hospital.getEmployeeCount();
		// act
		hospital.addEmployee(employeeOne);
		int afterAddingEmployee = hospital.getEmployeeCount();

		// asset

		assertThat(afterAddingEmployee, is(equalTo(beforeAddingEmployee + 1)));
		
	}
	@Test
	public void shouldRemoveEmployee() {
		// arrange
		hospital.addEmployee(employeeOne);
		int countBeforeRemovingEmployee = hospital.getEmployeeCount();
		// act
		hospital.removeEmployeeNumber(employeeOne.getEmployeeNumber());
		int countAfterRemovingEmployee = hospital.getEmployeeCount();
		// assert
		assertThat(countAfterRemovingEmployee, is(equalTo(countBeforeRemovingEmployee-1)));
	}
	@Test
	public void shouldListAllEmployees() {
		//arrange
		hospital.listEmployees();
		//act
		
		//assert
		
		
		
		
	}

}
