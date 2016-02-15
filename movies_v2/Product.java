package movies_v2;

public abstract class Product {

	String id;
	String title;
	Person person;

	public Product(String title, Person person) {
		this.title = title;
		this.person = person;
		id = IdGenerator.generator(this);
	}

	public String getTitle() {
		return title;
	}

	public Person getPerson() {
		return person;
	}

	public abstract long getInvestment();
}
