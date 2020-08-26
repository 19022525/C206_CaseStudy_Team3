import java.util.ArrayList;
public class C206_CaseStudy {

	private static final int CATEGORY_UPDATE = 4;

	private static final int CATEGORY_DELETE = 3;

	private static final int CATEGORY_VIEW = 2;

	private static final int CATEGORY_ADD = 1;

	private static final int OPTION_CCA = 4;

	private static final int OPTION_INSTRUCTOR = 3;

	private static final int OPTION_STUDENTS = 2;

	private static final int OPTION_PARENTS = 1;

	private static final int OPTION_CATEGORY = 5;
	
	private static final int OPTION_QUIT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				ArrayList<Category> categoryList = new ArrayList<Category>();
				

				categoryList.add(new Category("001", "Sports"));
				categoryList.add(new Category("002", "Cooking"));


				int option = 0;

				while (option != OPTION_QUIT) {

					C206_CaseStudy.menu();
					option = Helper.readInt("Enter an option > ");

					if (option == OPTION_PARENTS) {
						// parents
						C206_CaseStudy.setHeader("Parents");

					} else if (option == OPTION_STUDENTS) {
						// student
						C206_CaseStudy.setHeader("Students");

					} else if (option == OPTION_INSTRUCTOR) {
						// instructor
						C206_CaseStudy.setHeader("Instructor");

					} else if (option == OPTION_CCA) {
						// CCA
						C206_CaseStudy.setHeader("CCA");
					} else if (option == OPTION_CATEGORY) {
						// Category
						C206_CaseStudy.setHeader("Category");
						CategoryDB.showCategoryMenu();
						int catOption = Helper.readInt("Enter option to select item type > ");
						if (catOption == CATEGORY_ADD) {
							 Category cat = CategoryDB.inputCategory();
							 CategoryDB.addCategory(cat);
						} else if (catOption == CATEGORY_VIEW) {
							CategoryDB.viewAllCategories();
						} else if (catOption == CATEGORY_DELETE) {
							Category cat = CategoryDB.inputCategory();
							CategoryDB.delCategory(cat);
						} else if (catOption == CATEGORY_UPDATE) {
							CategoryDB.inputCategory();
							Category cat = CategoryDB.inputCategory();
							CategoryDB.updateCategory(cat);
						} else {
							System.out.println("Invalid category option");
						}
					}
					else if (option == OPTION_QUIT) {
						System.out.println("Bye!");
					} else { 
						System.out.println("Invalid option");}
					}
					}

				

			

			public static void menu() {
				C206_CaseStudy.setHeader("C206 Case Study Menu");
				System.out.println("1. Parent's Menu");
				System.out.println("2. Student's Menu");
				System.out.println("3. Instructor's Menu");
				System.out.println("4. CCA Menu");
				System.out.println("5. Category Menu");
				System.out.println("6. Quit");
				Helper.line(80, "-");

			}
			
			public static void setHeader(String header) {
				Helper.line(80, "-");
				System.out.println(header);
				Helper.line(80, "-");
			}
}
	


