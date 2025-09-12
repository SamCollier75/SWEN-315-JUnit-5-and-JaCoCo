package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Inventory;
import coffeemaker.exceptions.InventoryException;


/**
 * Sample component test suite.
 */
public class InventoryTest {

	/**
	 * Component under Test.
	 */
	private Inventory CuT;

	@BeforeEach
	public void setUp() {
		// add setup here
		CuT = new Inventory();
	}

	@AfterEach
	public void tearDown() {
		// add tear down here
		CuT = null;
	}

	@Test
	@DisplayName("Sample test that just succeeds.  Ignore it.")
	public void tautology() {
		assertTrue(true, "Always pass.");
	}

    // Testing Gets
    @Test
    @DisplayName("Test Case: initial setup coffee=15")
    void getCoffeTest() {
        int result = CuT.getCoffee();
        assertEquals(15, result, "Coffee amount wrong");
    }
    @Test
    @DisplayName("Test Case: initial setup milk=15")
    void getMilkTest() {
        int result = CuT.getMilk();
        assertEquals(15, result, "Milk amount wrong");
    }
    @Test
    @DisplayName("Test Case: initial setup sugar=15")
    void getSugarTest() {
        int result = CuT.getSugar();
        assertEquals(15, result, "Sugar amount wrong");
    }
    @Test
    @DisplayName("Test Case: initial setup chocolate=15")
    void getChocolateTest() {
        int result = CuT.getChocolate();
        assertEquals(15, result, "Chocolate amount wrong");
    }

    //Testing Sets
    //Coffee
    @Test
    @DisplayName("Test Case: set coffee=2")
    void setCoffeeTest_1() {
        CuT.setCoffee(2);
        int result = CuT.getCoffee();
        assertEquals(2, result, "Coffee amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set coffee=-1")
    void setCoffeeTest_2() {
        CuT.setCoffee(-1);
        int result = CuT.getCoffee();
        assertEquals(15, result, "Coffee amount set wrong");
    }
    //Milk
    @Test
    @DisplayName("Test Case: set milk=2")
    void setMilkTest_1() {
        CuT.setMilk(2);
        int result = CuT.getMilk();
        assertEquals(2, result, "Milk amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set milk=-1")
    void setMilkTest_2() {
        CuT.setMilk(-1);
        int result = CuT.getMilk();
        assertEquals(15, result, "Milk amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set sugar=2")
    void setSugarTest_1() {
        CuT.setSugar(2);
        int result = CuT.getSugar();
        assertEquals(2, result, "Sugar amount set wrong");
    }
    //Sugar
    @Test
    @DisplayName("Test Case: set sugar=-1")
    void setSugarTest_2() {
        CuT.setSugar(-1);
        int result = CuT.getSugar();
        assertEquals(15, result, "Sugar amount set wrong");
    }
    //Chocolate
    @Test
    @DisplayName("Test Case: set chocolate=2")
    void setChocolateTest_1() {
        CuT.setChocolate(2);
        int result = CuT.getChocolate();
        assertEquals(2, result, "Chocolate amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set chocolate=-1")
    void setChocolateTest_2() {
        CuT.setChocolate(-1);
        int result = CuT.getChocolate();
        assertEquals(15, result, "Chocolate amount set wrong");
    }

    //Testing add items
    //Coffee
    @Test
    @DisplayName("Test Case: add 1 unit of coffee")
    void addCoffeeTest_1() {
        CuT.addCoffee("1");
        int result = CuT.getCoffee();
        assertEquals(16, result, "Expected 16 units of coffee");
    }
    @Test
    @DisplayName("Test Case: add -1 unit of coffee")
    void addCoffeeTest_2() {
        assertThrows(InventoryException.class, () -> {
            CuT.addCoffee("-1");
        }, "Expected InventoryException: added -1 unit of coffee");
    }
    @Test
    @DisplayName("Test Case: add x unit of coffee")
    void addCoffeeTest_3() {
       assertThrows(InventoryException.class, () -> {
        CuT.addCoffee("x");
       }, "Expected InventoryException: added x unit of coffee");
    }
    //Milk
    @Test
    @DisplayName("Test Case: add 1 unit of milk")
    void addMilkTest_1() {
        CuT.addMilk("1");
        int result = CuT.getMilk();
        assertEquals(16, result, "Expected 16 units of milk");
    }
    @Test
    @DisplayName("Test Case: add -1 unit of milk")
    void addMilkTest_2() {
        assertThrows(InventoryException.class, () -> {
            CuT.addMilk("-1");
        }, "Expected InventoryException: added -1 unit of milk");
    }
    @Test
    @DisplayName("Test Case: add x unit of milk")
    void addMilkTest_3() {
       assertThrows(InventoryException.class, () -> {
        CuT.addMilk("x");
       }, "Expected InventoryException: added x unit of milk");
    }
    //Sugar
    @Test
    @DisplayName("Test Case: add 1 unit of sugar")
    void addSugarTest_1() {
        CuT.addSugar("1");
        int result = CuT.getSugar();
        assertEquals(16, result, "Expected 16 units of sugar");
    }
    @Test
    @DisplayName("Test Case: add -1 unit of sugar")
    void addSugarTest_2() {
        assertThrows(InventoryException.class, () -> {
            CuT.addSugar("-1");
        }, "Expected InventoryException: added -1 unit of sugar");
    }
    @Test
    @DisplayName("Test Case: add x unit of sugar")
    void addSugarTest_3() {
       assertThrows(InventoryException.class, () -> {
        CuT.addSugar("x");
       }, "Expected InventoryException: added x unit of sugar");
    }
    //Chocolate
    @Test
    @DisplayName("Test Case: add 1 unit of chocolate")
    void addChocolateTest_1() {
        CuT.addChocolate("1");
        int result = CuT.getChocolate();
        assertEquals(16, result, "Expected 16 units of chocolate");
    }
    @Test
    @DisplayName("Test Case: add -1 unit of chocolate")
    void addChocolateTest_2() {
        assertThrows(InventoryException.class, () -> {
            CuT.addChocolate("-1");
        }, "Expected InventoryException: added -1 unit of chocolate");
    }
    @Test
    @DisplayName("Test Case: add x unit of chocolate")
    void addChocolateTest_3() {
       assertThrows(InventoryException.class, () -> {
        CuT.addChocolate("x");
       }, "Expected InventoryException: added x unit of chocolate");
    }

}

// change error message to Expected for test gets and test sets 