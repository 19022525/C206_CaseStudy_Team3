
public class Instructor {
	private String instructorid ;
	private String instructorname;
	private String instructoremail;
	public Instructor(String instructorid, String instructorname, String instructoremail) {
		super();
		this.instructorid = instructorid;
		this.instructorname = instructorname;
		this.instructoremail = instructoremail;
	}
	public String getInstructorid() {
		return instructorid;
	}
	public void setInstructorid(String instructorid) {
		this.instructorid = instructorid;
	}
	public String getInstructorname() {
		return instructorname;
	}
	public void setInstructorname(String instructorname) {
		this.instructorname = instructorname;
	}
	public String getInstructoremail() {
		return instructoremail;
	}
	public void setInstructoremail(String instructoremail) {
		this.instructoremail = instructoremail;
	}
	
	
}
