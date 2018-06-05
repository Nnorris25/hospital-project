import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	Janitor maulik = new Janitor("Maulik", "1666", 500, false);
	
	@Test
	public void isTheJanitorSweeping() {
	boolean valueOfIsTheJanitorSweepingBeforeToggle = maulik.isSweeping();
	maulik.toggleIsSweeping();	
	//Assert
	boolean valueOfIsSweepingAfterToggle = maulik.isSweeping();
	
	assertThat(valueOfIsSweepingAfterToggle, is(equalTo(!valueOfIsTheJanitorSweepingBeforeToggle)));
	}
}
