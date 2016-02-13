package movies_v2;

public class Product {

	String id;
	String title;
	Person person;

	public Product(String id, String title, Person person) {
		this.id = id;
		this.title = title;
		this.person = person;
	}

	public String getTitle() {
		return title;
	}

	public Person getPerson() {
		return person;
	}

	public long getInvestment(Product product) {
		if (product instanceof Movie) {
			Movie movie = (Movie) product;
			return movie.getInvestment();
		} else if (product instanceof Game) {
			Game game = (Game) product;
			return game.getInvestment();
		} else {
			Book book = (Book) product;
			return book.getInvestment();
		}
	}
}
