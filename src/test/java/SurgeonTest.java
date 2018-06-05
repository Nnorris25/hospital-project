import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	Surgeon harry = new Surgeon("Harry", "3333", "Plastic Surgeon", 120000, false);
	
	
	@Test
	public void toggleOperatingShouldChangeValueOfOperation() {
		//Arrange
		boolean valueOfOperatingBeforeToggle = harry.isOperating();
		
		//Act
		harry.toggleIsOperating();
		boolean valueOfOperatingAfterToggle = harry.isOperating();
		//Assert
		assertThat(valueOfOperatingAfterToggle, is(equalTo(!valueOfOperatingBeforeToggle)));
	}

}
