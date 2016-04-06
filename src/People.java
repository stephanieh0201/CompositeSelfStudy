import java.util.ArrayList;
import java.util.List;

public class People implements Person {
	private ArrayList<Person> peopleList =new ArrayList<Person>();
	
	
	@Override
	public void print() {
		for (Person person: this.peopleList){
			person.print();
		}	
	}
	
	public void add(Person person){ 
		this.peopleList.add(person);
	}


	public void remove(Person person){
		this.peopleList.remove(person);
	}
	
	public Person getChild(int i){
		return this.peopleList.get(i);
	}
	
	public ArrayList<Person> getChildren(){
		return this.peopleList;
	}
	
}
