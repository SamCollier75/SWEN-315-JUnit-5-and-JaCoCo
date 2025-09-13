package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Inventory;
import coffeemaker.domain.Recipe;
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
        assertEquals(15, result, "Expected 15: Coffee amount wrong");
    }
    @Test
    @DisplayName("Test Case: initial setup milk=15")
    void getMilkTest() {
        int result = CuT.getMilk();
        assertEquals(15, result, "Expected 15: Milk amount wrong");
    }
    @Test
    @DisplayName("Test Case: initial setup sugar=15")
    void getSugarTest() {
        int result = CuT.getSugar();
        assertEquals(15, result, "Expected 15: Sugar amount wrong");
    }
    @Test
    @DisplayName("Test Case: initial setup chocolate=15")
    void getChocolateTest() {
        int result = CuT.getChocolate();
        assertEquals(15, result, "Expected 15: Chocolate amount wrong");
    }

    //Testing Sets
    //Coffee
    @Test
    @DisplayName("Test Case: set coffee=2")
    void setCoffeeTest_1() {
        CuT.setCoffee(2);
        int result = CuT.getCoffee();
        assertEquals(2, result, "Expected 2: Coffee amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set coffee=-1")
    void setCoffeeTest_2() {
        CuT.setCoffee(-1);
        int result = CuT.getCoffee();
        assertEquals(15, result, "Expected 15: Coffee amount set wrong");
    }
    //Milk
    @Test
    @DisplayName("Test Case: set milk=2")
    void setMilkTest_1() {
        CuT.setMilk(2);
        int result = CuT.getMilk();
        assertEquals(2, result, "Expected 2: Milk amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set milk=-1")
    void setMilkTest_2() {
        CuT.setMilk(-1);
        int result = CuT.getMilk();
        assertEquals(15, result, "Expected 15: Milk amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set sugar=2")
    void setSugarTest_1() {
        CuT.setSugar(2);
        int result = CuT.getSugar();
        assertEquals(2, result, "Expected 2: Sugar amount set wrong");
    }
    //Sugar
    @Test
    @DisplayName("Test Case: set sugar=-1")
    void setSugarTest_2() {
        CuT.setSugar(-1);
        int result = CuT.getSugar();
        assertEquals(15, result, "Expected 15: Sugar amount set wrong");
    }
    //Chocolate
    @Test
    @DisplayName("Test Case: set chocolate=2")
    void setChocolateTest_1() {
        CuT.setChocolate(2);
        int result = CuT.getChocolate();
        assertEquals(2, result, "Expected 2: Chocolate amount set wrong");
    }
    @Test
    @DisplayName("Test Case: set chocolate=-1")
    void setChocolateTest_2() {
        CuT.setChocolate(-1);
        int result = CuT.getChocolate();
        assertEquals(15, result, "Expected 15: Chocolate amount set wrong");
    }

    //Testing add items
    //Coffee
    @Test
    @DisplayName("Test Case: add 1 unit of coffee")
    void addCoffeeTest_1() {
        CuT.addCoffee("1");
        int result = CuT.getCoffee();
        assertEquals(16, result, "Expected 16: added 1 unit of coffee");
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
    @Test
    @DisplayName("Test Case: add null unit of coffee")
    void addCoffeeTest_4() {
       assertThrows(InventoryException.class, () -> {
        CuT.addCoffee(null);
       }, "Expected InventoryException: added null unit of coffee");
    }
    //Milk
    @Test
    @DisplayName("Test Case: add 1 unit of milk")
    void addMilkTest_1() {
        CuT.addMilk("1");
        int result = CuT.getMilk();
        assertEquals(16, result, "Expected 16: added 1 unit of milk");
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
    @Test
    @DisplayName("Test Case: add null unit of milk")
    void addMilkTest_4() {
       assertThrows(InventoryException.class, () -> {
        CuT.addMilk(null);
       }, "Expected InventoryException: added null unit of milk");
    }
    //Sugar
    @Test
    @DisplayName("Test Case: add 1 unit of sugar")
    void addSugarTest_1() {
        CuT.addSugar("1");
        int result = CuT.getSugar();
        assertEquals(16, result, "Expected 16: added 1 unit of sugar");
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
    @Test
    @DisplayName("Test Case: add null unit of sugar")
    void addSugarTest_4() {
       assertThrows(InventoryException.class, () -> {
        CuT.addSugar(null);
       }, "Expected InventoryException: added null unit of sugar");
    }
    //Chocolate
    @Test
    @DisplayName("Test Case: add 1 unit of chocolate")
    void addChocolateTest_1() {
        CuT.addChocolate("1");
        int result = CuT.getChocolate();
        assertEquals(16, result, "Expected 16: added 1 unit of chocolate");
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
    @Test
    @DisplayName("Test Case: add null unit of chocolate")
    void addChocolateTest_4() {
       assertThrows(InventoryException.class, () -> {
        CuT.addChocolate(null);
       }, "Expected InventoryException: added null unit of chocolate");
    }

    //Testing enough ingredients
    //Coffee
    @Test
    @DisplayName("Test Case: enough coffee amount")
    void enoughIngredientsCoffeeTest_1() {
        CuT.setCoffee(10);
        Recipe r = new Recipe();
        r.setAmtCoffee("1");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough coffee");
    }
    @Test
    @DisplayName("Test Case: not enough coffee amount")
    void enoughIngredientsCoffeeTest_2() {
        CuT.setCoffee(1);
        Recipe r = new Recipe();
        r.setAmtCoffee("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, false, "Expected false: have enough coffee");
    }
    @Test
    @DisplayName("Test Case: equal coffee amount")
    void enoughIngredientsCoffeeTest_3() {
        CuT.setCoffee(10);
        Recipe r = new Recipe();
        r.setAmtCoffee("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough coffee");
    }
    //Milk
    @Test
    @DisplayName("Test Case: enough milk amount")
    void enoughIngredientsMilkTest_1() {
        CuT.setMilk(10);
        Recipe r = new Recipe();
        r.setAmtMilk("1");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough milk");
    }
    @Test
    @DisplayName("Test Case: not enough milk amount")
    void enoughIngredientsMilkTest_2() {
        CuT.setMilk(1);
        Recipe r = new Recipe();
        r.setAmtMilk("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, false, "Expected false: have enough milk");
    }
    @Test
    @DisplayName("Test Case: equal milk amount")
    void enoughIngredientsMilkTest_3() {
        CuT.setMilk(10);
        Recipe r = new Recipe();
        r.setAmtMilk("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough milk");
    }
    //Sugar
    @Test
    @DisplayName("Test Case: enough sugar amount")
    void enoughIngredientsSugarTest_1() {
        CuT.setSugar(10);
        Recipe r = new Recipe();
        r.setAmtSugar("1");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough sugar");
    }
    @Test
    @DisplayName("Test Case: not enough sugar amount")
    void enoughIngredientsSugarTest_2() {
        CuT.setSugar(1);
        Recipe r = new Recipe();
        r.setAmtSugar("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, false, "Expected false: have enough sugar");
    }
    @Test
    @DisplayName("Test Case: equal sugar amount")
    void enoughIngredientsSugarTest_3() {
        CuT.setSugar(10);
        Recipe r = new Recipe();
        r.setAmtSugar("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough sugar");
    }
    //Chocolate
    @Test
    @DisplayName("Test Case: enough chocolate amount")
    void enoughIngredientsChocolateTest_1() {
        CuT.setChocolate(10);
        Recipe r = new Recipe();
        r.setAmtChocolate("1");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough chocolate");
    }
    @Test
    @DisplayName("Test Case: not enough chocolate amount")
    void enoughIngredientsChocolateTest_2() {
        CuT.setChocolate(1);
        Recipe r = new Recipe();
        r.setAmtChocolate("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, false, "Expected false: have enough chocolate");
    }
    @Test
    @DisplayName("Test Case: equal chocolate amount")
    void enoughIngredientsChocolateTest_3() {
        CuT.setChocolate(10);
        Recipe r = new Recipe();
        r.setAmtChocolate("10");
        boolean result = CuT.enoughIngredients(r);
        assertEquals(result, true, "Expected true: don't have enough chocolate");
    }

    //Testing useIngredients
    @Test
    @DisplayName("Test Case: not enough ingredients")
    void useIngredientsTest_1() {
        CuT.setCoffee(0);
        CuT.setMilk(0);
        CuT.setSugar(0);
        CuT.setChocolate(0);
        Recipe r = new Recipe();
        r.setAmtCoffee("1");
        r.setAmtMilk("1");
        r.setAmtSugar("1");
        r.setAmtChocolate("1");
        boolean result = CuT.useIngredients(r);
        assertEquals(result, false, "Expected false: used ingredients");
    }
    @Test
    @DisplayName("Test Case: enough ingredients")
    void useIngredientsTest_2() {
        CuT.setCoffee(10);
        CuT.setMilk(10);
        CuT.setSugar(10);
        CuT.setChocolate(10);
        Recipe r = new Recipe();
        r.setAmtCoffee("1");
        r.setAmtMilk("1");
        r.setAmtSugar("1");
        r.setAmtChocolate("1");
        boolean result = CuT.useIngredients(r);
        assertEquals(result, true, "Expected true: did not use ingredients");
    }

    //Testing toString
    @Test
    @DisplayName("Test Case: to string, set parameters")
    void toStringTest_1() {
        CuT.setCoffee(0);
        CuT.setMilk(0);
        CuT.setSugar(0);
        CuT.setChocolate(0);
        String result = CuT.toString();
        assertEquals(result, "Coffee: 0\n" + //
                        "Milk: 0\n" + //
                        "Sugar: 0\n" + //
                        "Chocolate: 0\n", "Expected toString with set parameters");
    }
    @Test
    @DisplayName("Test Case: to string, default parameters")
    void toStringTes_2() {
        String result = CuT.toString();
        assertEquals(result, "Coffee: 15\n" + //
                        "Milk: 15\n" + //
                        "Sugar: 15\n" + //
                        "Chocolate: 15\n", "Expected toString with default parameters");
    }
}

//test when haven't set a parameter 