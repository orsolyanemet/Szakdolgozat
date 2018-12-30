package ro.edu.ubb.entity;

/**
 * Enum for the types of courses.
 * 
 * @author Nemet Orsolya, noim1553
 *
 */
public enum CourseType {
	COURSE("Course"), LABORATORY("Laboratory"), SEMINAR("Seminar");
	private final String courseTypeName;

	private CourseType(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}

	public String getCourseType() {
		return courseTypeName;
	}

	public static CourseType valueOfIgnoreCase(String courseTypeName) {
		return valueOf(courseTypeName.toUpperCase());
	}
}
