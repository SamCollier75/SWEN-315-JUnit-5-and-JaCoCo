package coffeemaker;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecipeBookTest {
	
	/**
	 * Component under Test.
	 */
	private RecipeBookTest CuT;

	@BeforeEach
	public void setUp() {
		// add setup here
//		CuT = new CoffeeMaker();
	}

	@AfterEach
	public void tearDown() {
		// add tear down here
//		CuT = null;
	}

	@Test
	@DisplayName("Sample test that just succeeds.  Ignore it.")
	public void tautology() {
		assertTrue(true, "Always pass.");
	}

}
