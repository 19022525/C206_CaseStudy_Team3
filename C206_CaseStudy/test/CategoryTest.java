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
		assertSame("Test that category added equals to category object added (cat2)",cat2,CategoryDB.categoryList.get(0));
		
		//Test that null values cannot be added to category list
		
	}
	@Test
	public void viewAllCategoriesTest() {
		// Test if category list is not null but empty -boundary
		
	}

}
