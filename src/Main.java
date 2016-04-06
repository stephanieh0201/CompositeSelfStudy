import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Person professor1 = new Professor("Smith", "Computer Science", 100000);
		Person professor2 = new Professor("Roberts", "English", 75000);
		Person professor3 = new Professor("Lance", "Biology", 80000);
	
		Person staff1 = new Staff ("James Hon", "Administrative Assistant", 50000);
		Person staff2 = new Staff ("Emily Sears", "Clerk", 38000);
		
		Person student1 = new Student("Katie Monroe", "Economics", 3.75);
		Person student2 = new Student("Joe Pat", "Marketing", 2.9);
		
		People people = new People();
		people.add(professor1);
		people.add(professor2);
		people.add(professor3);
		people.add(staff1);
		people.add(staff2);
		people.add(student1);
		people.add(student2);
		
		people.print();
		System.out.println("\nGet person at index 3");
		Person find = people.getChild(3);
		find.print();
		
	}

}
