import java.util.ArrayList;

public class InstructorDB {

	public static ArrayList<Instructor> instructorList = new ArrayList<Instructor>();

	public static void addInstructor(Instructor in) {
		instructorList.add(in);
		System.out.println("Instructor added");
	}


	public static String retrieveAllInstructor(ArrayList<Instructor> instructorList) {
		String output = "";

		for (int i = 0; i < instructorList.size(); i++) {

			output += String.format("%-84s\n", instructorList.get(i).toString());
		}
		return output;
	}
	public static void viewAllCamcorder(ArrayList<Instructor> camcorderList) {
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "name",
				"email");
		 output += retrieveAllInstructor(instructorList);	
		System.out.println(output);
	}






	public static void deleteInstructor(Instructor in) {
		instructorList.delete(in);
		System.out.println("instructor deleted");
		
	}






	

}
