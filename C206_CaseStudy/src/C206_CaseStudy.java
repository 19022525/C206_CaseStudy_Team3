import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				ArrayList<Category> categoryList = new ArrayList<Category>();
				

				categoryList.add(new Category("001", "Sports"));
				categoryList.add(new Category("002", "Cooking"));


				int option = 0;

				while (option != 6) {

					C206_CaseStudy.menu();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// parents
						C206_CaseStudy.setHeader("Parents");

					} else if (option == 2) {
						// student
						C206_CaseStudy.setHeader("Students");

					} else if (option == 3) {
						// instructor
						C206_CaseStudy.setHeader("Instructor");

					} else if (option == 4) {
						// CCA
						C206_CaseStudy.setHeader("CCA");
					} else if (option == 5) {
						// Category
						C206_CaseStudy.setHeader("Category");
						CategoryDB.showCategoryMenu();
						int catOption = Helper.readInt("Enter option to select item type > ");
						if (catOption == 1) {
							 Category cat = CategoryDB.inputCategory();
							 CategoryDB.addCategory(cat);
						} else if (catOption == 2) {
							CategoryDB.viewAllCategories();
						} else if (catOption == 3) {
							Category cat = CategoryDB.inputCategory();
							CategoryDB.delCategory(cat);
						} else if (catOption == 4) {
							CategoryDB.inputCategory();
							Category cat = CategoryDB.inputCategory();
							CategoryDB.updateCategory(cat);
						} else {
							System.out.println("Invalid category option");
						}
					}
					else if (option == 6) {
						System.out.println("Bye!");
					}
					} 
						System.out.println("Invalid option");
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
	


