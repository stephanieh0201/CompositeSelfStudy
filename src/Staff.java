
public class Staff implements Person {
	private String name;
	private String jobTitle;
	private int salary;
	
	public Staff (String name, String jobTitle, int salary){
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	@Override
	public void print() {
		System.out.println("Staff: " + name);
		System.out.println("Job title: " + jobTitle);
		System.out.println("Salary: " + salary);
		System.out.println("================");
		
	}
	

}
