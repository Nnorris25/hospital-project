
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	Doctor phil = new Doctor("Phil", "1111", "Heart", 90000);

	@Test
	public void careForPatientShouldIncreasePatientHealth() {
		// Arrange
		Patient patient = new Patient(25, 25);
		int patientHealthBeforeCare = patient.getHealthLevel();

		// Act
		phil.careForPatient(patient);
		int patientHealthAfterCare = patient.getHealthLevel();

		// Assert
		assertThat(patientHealthAfterCare, is(equalTo(patientHealthBeforeCare + 10)));
	}

	@Test
	public void calculatePayShouldReturnDoctorSalary() {
		int doctorSalary = phil.calculatePay();

		assertThat(doctorSalary, is(equalTo(90000)));
	}
	
	@Test
	public void drawBloodShouldDecreaseBloodLevel() {
		//arrange
		Patient patient = new Patient(420, 420);
		int patientBloodBeforeBloodDraw = patient.getBloodLevel(); 
		
		//act
		phil.drawBlood(patient);
		int patientBloodAfterBloodDraw = patient.getBloodLevel();
		
		//assert
		assertThat(patientBloodAfterBloodDraw, is(equalTo(patientBloodBeforeBloodDraw - 5)));
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
}