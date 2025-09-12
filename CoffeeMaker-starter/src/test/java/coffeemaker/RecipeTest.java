package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import coffeemaker.domain.Recipe;
import coffeemaker.exceptions.RecipeException;

public class RecipeTest {
    private Recipe CuT;

    @BeforeEach
    public void setUp() {
        this.CuT = new Recipe();
    }

    @AfterEach
    public void tearDown() {
        CuT = null;
    }

    /**
     * setName states
     * "The name to set; must have at least one non-blank character."
     * This test checks for that
     */
    @Test
    public void setName_1() {
        RecipeException exception = assertThrows(RecipeException.class,
        () -> CuT.setName(""));
        assertEquals("Name must have at least one non-blank character", exception.getMessage());
    }

    @Test
    public void setName_2() {
        // "It must have a non-null String name (class description)"
        assertNotNull(CuT.getName());
    }

    @Test
    public void setName_3() {
        // "It must have a non-null String name (class description)"        
        CuT.setName(null);
        assertNotNull(CuT.getName());
    }

    @Test
    public void setName_4() {
        CuT.setName("Test1");
        assertEquals(CuT.getName(), "Test1");        
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "-1", "-999", "3.14159"})
    void setPrice_1(String x) {
        // testing assertion
        RecipeException exception = assertThrows(RecipeException.class,
        () -> CuT.setPrice(""));
        //RecipeException does not have a built in message
        assertEquals("Price must be a positive integer", exception.getMessage());
    }  

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 9999, 34})
    void setPrice_2(int x) {
        CuT.setPrice(Integer.toString(x));
        assertEquals(x, CuT.getPrice());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "-1", "-999", "3.14159"})
    void setAmtCoffee_1(String x) {
        // testing assertion
        RecipeException exception = assertThrows(RecipeException.class,
        () -> CuT.setAmtCoffee(""));
        //RecipeException does not have a built in message
        assertEquals("Units of coffee must be a positive integer", exception.getMessage());
    }  

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 9999, 34})
    void setAmtCoffee_2(int x) {
        CuT.setAmtCoffee(Integer.toString(x));
        assertEquals(x, CuT.getAmtCoffee());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "-1", "-999", "3.14159"})
    void setAmtMilk_1(String x) {
        // testing assertion
        RecipeException exception = assertThrows(RecipeException.class,
        () -> CuT.setAmtMilk(""));
        //RecipeException does not have a built in message
        assertEquals("Units of milk must be a positive integer", exception.getMessage());
    }  

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 9999, 34})
    void setAmtMilk_2(int x) {
        CuT.setAmtMilk(Integer.toString(x));
        assertEquals(x, CuT.getAmtMilk());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "-1", "-999", "3.14159"})
    void setAmtSugar_1(String x) {
        // testing assertion
        RecipeException exception = assertThrows(RecipeException.class,
        () -> CuT.setAmtSugar(""));
        //RecipeException does not have a built in message
        assertEquals("Units of sugar must be a positive integer", exception.getMessage());
    }  


    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 9999, 34})
    void setAmtSugar_2(int x) {
        CuT.setAmtSugar(Integer.toString(x));
        assertEquals(x, CuT.getAmtSugar());
    }

    @Test
    public void hashCode_1() {
        CuT.setName("Test1");
        int expectedHash = 80698846;
        assertEquals(CuT.hashCode(), expectedHash);
    }

    @Test
    public void hashCode_2() {
        CuT.setName(null);
        // testing that name doesn't change from "" when set to null
        int expectedHash = 31;
        assertEquals(CuT.hashCode(), expectedHash);
    }

    @Test
    public void hashCode_3() {
        CuT.setName("Test1");
        CuT.setAmtChocolate("1");
        Recipe CuT2 = new Recipe();
        CuT2.setName("Test1");
        CuT2.setAmtChocolate("2");
        // Two objects (that aren't equal) should have seperate hashcodes
        assertNotEquals(CuT.hashCode(), CuT2.hashCode());
    }

    @Test
    public void equals_1() {
        assertNotEquals(CuT, new Object());
    }

    @Test
    public void equals_2() {
        assertNotEquals(CuT,null);
    }

    @Test
    public void equals_3() {
        CuT.setName("Test1");
        CuT.setAmtChocolate("1");
        Recipe CuT2 = new Recipe();
        CuT2.setName("Test1");
        CuT2.setAmtChocolate("2");
        // Two objects with different states should not be equal
        assertNotEquals(CuT2, CuT2);
    }

    @Test 
    public void equals_4() {
        assertEquals(CuT, CuT);
    }

    @Test
    public void equals_5() {
        Recipe CuT2 = new Recipe();
        CuT2.setName("Test1");
        assertNotEquals(CuT, CuT2);
    }

    @Test
    public void toString_1() {
        CuT.setName(null); // defaults to this anyways
        assertEquals(CuT.toString(), "Recipe{}");
    }

    @Test
    public void toString_2() {
        CuT.setName(" ");
        assertEquals(CuT.toString(), "Recipe{ }");
    }

    @Test
    public void toString_3() {
        CuT.setName("43.4321432");
        assertEquals(CuT.toString(), "Recipe{43.4321432}");
    }

    @Test
	@DisplayName("Sample test that just succeeds.  Ignore it.")
	public void tautology() {
		assertTrue(true, "Always pass.");
	}
}
