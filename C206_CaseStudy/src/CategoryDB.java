import java.util.ArrayList;

public class CategoryDB {

	public static ArrayList<Category> categoryList = new ArrayList<Category>();

	public static void addCategory(Category cat) {
		// TODO Auto-generated method stub
		categoryList.add(cat);
	}
	public static String viewAllCategories(){
		String output = "";
		for (int i = 0; i < categoryList.size(); i++) {

			output += String.format("%-10s %-60s\n", categoryList.get(i).getCategoryId(), categoryList.get(i).getCategory());
		}
		System.out.println(output);
		return output; 
		
	}
	public static void delCategory(Category cat) {	
		categoryList.remove(cat);
	}
	public static void showCategoryMenu() {
		CategoryDB.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Delete Category");
		
		
	}
	public static void setHeader(String header) {
		
		System.out.println(header);
		
	}
	}


