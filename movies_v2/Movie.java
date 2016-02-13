package movies_v2;

import java.util.List;

public class Movie extends Product implements Buyable {

	enum Genre {
		ACTION, THRILLER, HORROR, SCI_FI, ROMANTIC, COMEDY, DRAMA
	}

	Genre genre;
	long duration;
	double rate;
	List<Person> cast;
	int price;

	public Movie(String id, String title, Person person, Genre genre, long duration, double rate, List<Person> cast,
			int price) {

		super(id, title, person);
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
		this.price = price;
	}

	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre newGenre) {
		this.genre = newGenre;
	}

	public long getDuration() {
		return this.duration;
	}

	public void setDuration(long newDuration) {
		this.duration = newDuration;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double newRate) {
		this.rate = newRate;
	}

	public List<Person> getCast() {
		return this.cast;
	}

	public void setCast(List<Person> newCast) {
		this.cast = newCast;
	}

	@Override
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getInvestment() {
		long investment = 0;

		for (Person person : cast) {
			investment += person.salary;
		}
		return investment;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nTitle: " + title + "\nBuyer: " + person + "\nCast: " + cast + "\nPrice: " + price
				+ "\n";
	}
}
