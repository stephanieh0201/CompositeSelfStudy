
public class Professor implements Person {
	private String lastName;
	private String department;
	private int salary;
	
	public Professor (String lastName, String department, int salary){
		this.lastName=lastName;
		this.department=department;
		this.salary=salary;
	}
	
	@Override
	public void print() {
		System.out.println("Professor: " + lastName);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
		System.out.println("================");
		
	}

}
