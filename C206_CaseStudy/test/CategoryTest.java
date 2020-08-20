import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	private Category cat1;
	private Category cat2;
	
	@Before
	public void setUp() throws Exception {
		cat1 = new Category("001","Sports");
		cat2 = new Category("002","Cooking");
		
	}

	@After
	public void tearDown() throws Exception {
		cat1 = null;
		cat2 = null;
		CategoryDB.categoryList.clear();
	}

	@Test
	public void addCategoryTest() {
		// test that category list is NOT null
		assertNotNull("Test that category list is not null", CategoryDB.categoryList);
		
		// test that category list size is 0 before adding any categories
		assertEquals("Test that category list size is 0 before adding any categories",0,CategoryDB.categoryList.size());
		
		// test that size of cat list is 1 after adding a category
		CategoryDB.addCategory(cat1);
		assertEquals("Test that category list size is 0 before adding any categories",1,CategoryDB.categoryList.size());
		
		// test that category object added equals to category object added (cat1)
		assertSame("Test that category added equals to category object added (cat1)",cat1,CategoryDB.categoryList.get(0));
		
		// test that size of cat list is 2 after adding another category
		CategoryDB.addCategory(cat2);
		assertEquals("Test that category list size is 1 before adding another category",2,CategoryDB.categoryList.size());
		
		// test that category object added equals to category object added (cat2)
		assertSame("Test that category added equals to category object added (cat2)",cat2,CategoryDB.categoryList.get(1));
		
		//Test that null values cannot be added to category list
		
	}
	@Test
	public void viewAllCategoriesTest() {
		// Test if category list is not null but empty -boundary
		assertNotNull("Test if there is valid Category arraylist to retrieve categories", CategoryDB.categoryList);
		
		//test if the list of categories retrieved from the C206 case study is empty - boundary
		String allCategories= CategoryDB.viewAllCategories();
		String testOutput = "";
		assertEquals("Test that the retrieved Category list is empty?", testOutput, allCategories);
		
		//Given an empty CategoryList, after adding 2 categories, test if the size of the list is 2 (normal) 
		CategoryDB.addCategory(cat1);
		CategoryDB.addCategory(cat2);
		assertEquals("Test that category arraylist size is 2", 2, CategoryDB.categoryList.size());
		
		//test if the expected output string same as the list of categories retrieved from the Category DB
		allCategories= CategoryDB.viewAllCategories();
		testOutput = String.format("%-10s %-60s\n", cat1.getCategoryId(),cat1.getCategory());
		testOutput += String.format("%-10s %-60s\n", cat2.getCategoryId(),cat2.getCategory());
		assertEquals("Test that viewAllCategorieslist", testOutput, allCategories);

		
	}
	@Test
	public void delCategoryTest() {
		// Test if category list is not null but empty -boundary
		assertNotNull("Test if there is valid Category arraylist to retrieve categories", CategoryDB.categoryList);
		
		// Test if category exist in the list so that it can be deleted
		CategoryDB.addCategory(cat1);
		assertSame("Test that category added equals to category object added (cat1)",cat1,CategoryDB.categoryList.get(0));
		// test that category chosen is deleted
		CategoryDB.delCategory(cat1);
		assertEquals("Test that category in arraylist has decreased once category object removed (cat1)",0,CategoryDB.categoryList.size());
		
	}

}
