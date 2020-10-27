import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Driver {
	
	public static void printCourses(ArrayList<Course> course) {
		for (Course c : course) {
			System.out.println("Course name is " + c.getCourseName() + " which takes" + c.getDuration() +
					" weeks.\nThe instructor of this course is " +
					c.getInstructor().getFirstName() +  " " + c.getInstructor().getLastName() +
					" who is a " + c.getInstructor().getStatus(c.getInstructor().getYearOfExperience()) +
					" instructor with " + c.getInstructor().getYearOfExperience() +
					" year of experience.\nThe Phone number of the instructor is " + c.getInstructor().getPhoneNumber());			
		}
	}

	public static String findInstructor(ArrayList<Course> course, String lastName) {
		for (Course c : course) {
			if (c.getInstructor().getLastName().equalsIgnoreCase(lastName)) {
				return c.getCourseName();
			}
		}
		return "This instructor does not teach any courses";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Course> courses = new ArrayList<Course>();
		
		Instructor instructor1 = new Instructor("Adam", "Levine", "221-553-1223", 9);
		Instructor instructor2 = new Instructor("Martin", "Garrix", "8252", 4);
		Instructor instructor3 = new Instructor("Andrew", "Taggart", "887-364-0234", 2);
		
		Course course1 = new Course("A Higher Place", 8, instructor1);
		Course course2 = new Course("Higher Ground", 12, instructor2);
		Course course3 = new Course("Closer", 12, instructor3);
		Course course4 = new Course("Paris", 10, instructor3);
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
					
		printCourses(courses);
		
		System.out.println("");
		System.out.print("Enter a last name of instructor: ");
		String lName = input.next();
		System.out.println(findInstructor(courses, lName));
	}

}
