import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

Receptionist jine = new Receptionist("Jine" , "4444" , 45000,false);

@Test
public void isMakingWorthWhileCalls() {
	//Arrange
	boolean valueOfIsOnPhoneBeforeToggle = jine.isOnPhone();
	jine.toggleIsOnPhone();	
	//Assert
	boolean valueOfIsOnPhoneAfterToggle = jine.isOnPhone();
	
	assertThat(valueOfIsOnPhoneAfterToggle, is(equalTo(!valueOfIsOnPhoneBeforeToggle)));
}

	
	
}
