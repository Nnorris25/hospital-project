import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class PatientTest {
	Patient patient = new Patient("1234", "Kevin Bacon", 20,20);

	@Test
	public void healShouldIncreasePatientHealth() {
		// Arrange
		int patientHealthBeforeHealing = patient.getHealthLevel();

		// Act
		patient.heal(5);
		int patientHealthAfterHealing = patient.getHealthLevel();

		// Assert

		assertThat(patientHealthAfterHealing, is(equalTo(patientHealthBeforeHealing + 5)));
	}

	@Test
	public void bleedShouldDecreasePatientBlood() {
		// arrange
		int patientBloodBeforeBleed = patient.getBloodLevel();

		// act
		patient.bleed(5);

		int patientBloodAfterBleed = patient.getBloodLevel();

		// assert
		assertThat(patientBloodAfterBleed, is(equalTo(patientBloodBeforeBleed - 5)));

	}
	
	@Test
	public void shouldHavePatientId() {
		//Arrange
		String patientId = patient.getPatientID();
		
		//Act
		
		//Assert
		assertThat(patientId, is(equalTo("1234")));
		
		
	}

	@Test
	public void shouldHavePatientName() {
		//Arrange
		String patientName = patient.getPatientName();
		
		//Act
		
		//Assert
		assertThat(patientName, is(equalTo("Kevin Bacon")));
		
		
	}
	
		
		
	}

