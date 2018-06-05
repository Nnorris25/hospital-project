import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HospitalTest {
	Hospital hospital = new Hospital();
	Patient patientOne = new Patient();

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
		hospital.removePatientId(patientOne.getPatientID());
		int countAfterRemovingPatient = hospital.getPatientCount();
		// assert
		assertThat(countAfterRemovingPatient, is(equalTo(countBeforeRemovingPatient-1)));
	}

}
