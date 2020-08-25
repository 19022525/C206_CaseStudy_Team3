import java.util.ArrayList;

public class CategoryDB {

	public static ArrayList<Category> categoryList = new ArrayList<Category>();
	
	
	public static void addCategory(Category cat) {
		// TODO Auto-generated method stub
		if (categoryList.size() == 0 && (cat.getCategory().length()<25)) {
			categoryList.add(cat);
			System.out.println("Category added");
		}
		else if (categoryList.size()>0){
			for (int i = 0; i < categoryList.size(); i++) {
		
			if((!cat.equals(categoryList.get(i))&& (cat.getCategory().length()<25))) {
		categoryList.add(cat);
		System.out.println("Category added");}
		}
		}
		
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
		CategoryDB.viewAllCategories();
		String id= Helper.readString("Enter Category ID > ");
		String category = Helper.readString("Enter Category > ");
		if (categoryList.size() != 0) {
			for (int i = 0; i < categoryList.size(); i++) {
				if(id.equalsIgnoreCase(categoryList.get(i).getCategoryId()) && category.equalsIgnoreCase(categoryList.get(i).getCategory())) 
			{
				categoryList.remove(i);
				}
				
			}
		}else{
			System.out.println("Invalid category id or category");
		}
		
	}
	public static void updateCategory(Category cat) {
		CategoryDB.viewAllCategories();
		String id= Helper.readString("Enter Category ID > ");
		String category = Helper.readString("Enter Category > ");
		for (int i = 0; i < categoryList.size(); i++) {
			if((id.equalsIgnoreCase(categoryList.get(i).getCategoryId())) && (cat.getCategory().length()<25)) 
			{
				categoryList.get(i).setCategoryId(id);
				categoryList.get(i).setCategory(category);
			}else{
				System.out.println("Invalid category id or category");
				
			}
		}
		
		
	}
	public static void showCategoryMenu() {
		CategoryDB.setHeader("CATEGORY LIST:");
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Delete Category");
		System.out.println("4. Update Category");
		Helper.line(80, "-");
		
		
	}
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}
	public static Category inputCategory() {
		String id= Helper.readString("Enter Category ID > ");
		String category = Helper.readString("Enter Category > ");
		Category cat = new Category(id, category);
		return cat;
	}
	}


