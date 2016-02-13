package movies_v2;

import java.util.List;

public class Game extends Product implements Buyable {

	boolean preOrdered;
	List<Person> staff;
	int price;

	public Game(String id, String title, Person person, boolean preOrdered, List<Person> staff, int price) {
		super(id, title, person);
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = price;
	}

	public boolean isPreOrdered() {
		return preOrdered;
	}

	public void setPreOrdered(boolean preOrdered) {
		this.preOrdered = preOrdered;
	}

	public List<Person> getStaff() {
		return staff;
	}

	public void setStaff(List<Person> staff) {
		this.staff = staff;
	}

	@Override
	public int getPrice() {
		if (isPreOrdered()) {
			price -= price / 5;
			System.out.println("Preordered game: " + title + " | New price: " + price);
			return price;
		} else {
			return price;
		}
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getInvestment() {
		long investment = 0;

		for (Person person : staff) {
			investment += person.salary;
		}
		return investment;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nTitle: " + title + "\nBuyer: " + person + "\nStaff: " + staff + "\nPrice: " + price
				+ "\n";
	}
}
