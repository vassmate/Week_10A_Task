package movies_v2;

public class Book extends Product {

	Person author;

	public Book(String id, String title, Person person, Person author) {
		super(id, title, person);
		this.author = author;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public long getInvestment() {
		long investment = 0;
		investment += author.salary;
		return investment;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nTitle: " + title + "\nBuyer: " + person + "\nAuthor: " + author + "\n";
	}
}
