import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VampireJanitorTest {
VampireJanitor cain = new VampireJanitor("Cain", "0000", 61003, false);

@Test
public void suckBloodShouldDecreaseBloodLevel() {
	//arrange
	Patient patient = new Patient("777", "Timmy");
	int patientBloodBeforeBloodSuck = patient.getBloodLevel();
	
	//act
	cain.suckBlood(patient);
	int patientBloodAfterBloodSuck = patient.getBloodLevel();
	
	//assert
	assertThat(patientBloodAfterBloodSuck, is(equalTo(patientBloodBeforeBloodSuck -2)));
}
}
