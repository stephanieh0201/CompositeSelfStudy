
public class Student implements Person {
	private String name;
	private String major;
	private double gpa;
	
	public Student (String name, String major, double gpa){
		this.name=name;
		this.major=major;
		this.gpa=gpa;
	}
	
	
	@Override
	public void print() {
		System.out.println("Student: " + name);
		System.out.println("Major: " + major);
		System.out.println("GPA: " + gpa);
		System.out.println("================");
	}

}
