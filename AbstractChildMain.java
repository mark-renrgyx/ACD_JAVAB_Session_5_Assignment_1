package week1.day5.assignment1;

public class AbstractChildMain {

	public static void main(String[] args) {
		Parent p = new Child();
		p.setName("Kiddo");
		
		System.out.println("Welcome to the world, " + p.getName());
	}
}
