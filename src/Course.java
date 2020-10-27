
public class Course {
	private String courseName;
	private int duration;
	private Instructor instructor;
	
	public Course(String courseName, int duration, Instructor instructor) {
		setCourseName(courseName);
		setDuration(duration);
		setInstructor(instructor);
	}
	
	// getters
	public String getCourseName() {
		return courseName;
	}
	public int getDuration() {
		return duration;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	
	// setters
	public void setCourseName(String courseName) {
		if (!courseName.isEmpty() && !courseName.equalsIgnoreCase(null)) {
			this.courseName = courseName;
		} else {
			this.courseName = "Unknown";
		}
	}
	public void setDuration(int duration) {
		if (duration > 4) {
			this.duration = duration;
		}
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
}
