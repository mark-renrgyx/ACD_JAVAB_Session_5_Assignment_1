package week1.day5.assignment1;

/**
 * Child class to implement abstract methods defined in {@link Parent}
 * @author Mark
 *
 */
public class Child extends Parent {
	private String name = "baby";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
