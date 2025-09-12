package coffeemaker;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Recipe;

public class RecipeTest {
    private Recipe CuT;

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
        
    }

    @Test
	@DisplayName("Sample test that just succeeds.  Ignore it.")
	public void tautology() {
		assertTrue(true, "Always pass.");
	}
}
