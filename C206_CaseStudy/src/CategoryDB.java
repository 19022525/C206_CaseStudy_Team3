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
	
	}
	}


