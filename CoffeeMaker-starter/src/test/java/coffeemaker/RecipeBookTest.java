package coffeemaker;

import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import coffeemaker.domain.Recipe;
import coffeemaker.domain.RecipeBook;

public class RecipeBookTest {
	
	/**
	 * Component under Test.
	 */
	private RecipeBook CuT;
	private Recipe recipe;
	private Recipe recipe2;
	private Recipe recipe3;

	@BeforeEach
	public void setUp() {
		CuT = new RecipeBook();

		recipe = new Recipe();
		recipe.setName("Coffee");

		recipe2 = new Recipe();
		recipe2.setName("Mocha");

		recipe3 = new Recipe();
		recipe3.setName("Latte");
	}

	@AfterEach
	public void tearDown() {
		CuT = null;
		recipe = null;
		recipe2 = null;
		recipe3 = null;
	}

	@Test
	@DisplayName("Sample test that just succeeds.  Ignore it.")
	public void tautology() {
		assertTrue(true, "Always pass.");
	}

	@Test
	@DisplayName("Test that the initial book is empty")
	public void testInitiallyNull() {
		Recipe[] recipes = CuT.getRecipes();

		for(Recipe r : recipes){
			assertEquals(null, r);
		}
	}

	@ParameterizedTest
	@CsvSource({"0, Coffee", "1, null"})
	@DisplayName("Tests for deleting a recipe")
	public void testDeleteRecipes(int index, String expectedResult) {
		CuT.addRecipe(recipe);

		if ("null".equals(expectedResult)) {
        	assertEquals(null, CuT.deleteRecipe(index));
		} else {
			assertEquals(expectedResult, CuT.deleteRecipe(index));
		}
	}

	@Test
	@DisplayName("Tests for adding a recipe that already exists")
	public void testAddExistingRecipe(){
		CuT.addRecipe(recipe);
		assertEquals(false, CuT.addRecipe(recipe));
	}

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3})
	@DisplayName("Tests for filling recipe book")
	public void testFillRecipeBook(int index){
		for(int i = 0; i <= index; i++){
			Recipe recipe = new Recipe();
			recipe.setName("Recipe" + i);
			CuT.addRecipe(recipe);
		}
		assertEquals("Recipe" + index, CuT.getRecipes()[index].getName());
	}

	@Test
	@DisplayName("Test for replacing an empty recipe slot")
	public void testReplaceEmptyRecipes(){
		assertEquals(null, CuT.replaceRecipe(0, recipe));
	}

	@Test
	@DisplayName("Test for replacing a recipe")
	public void testReplaceRecipe(){
		CuT.addRecipe(recipe);

		Recipe newRecipe = new Recipe();
		newRecipe.setName("New Coffee");

		assertEquals("Coffee", CuT.replaceRecipe(0, newRecipe));
	}

	@Test
	@DisplayName("Test for new recipe being set")
	public void testReplacementRecipe(){
		CuT.addRecipe(recipe);

		Recipe newRecipe = new Recipe();
		newRecipe.setName("New Coffee");

		CuT.replaceRecipe(0, newRecipe);

		assertEquals("New Coffee", CuT.getRecipes()[0].getName());
	}

	@Test
	@DisplayName("Test for replacing with unique recipe")
	public void testReplaceWithUniqueRecipe(){
		CuT.addRecipe(recipe);
		CuT.addRecipe(recipe2);

		CuT.replaceRecipe(1, recipe);

		assertEquals("Mocha", CuT.getRecipes()[1].getName());
	}

}
