package movies_v2;

import java.util.ArrayList;
import java.util.List;

import movies_v2.Movie.Genre;
import movies_v2.Person.Gender;

public class RentManager {

	public static void main(String[] args) {
		Person developer1 = new Person("Jhon", "Carmack", Gender.MALE, 500000);
		Person developer2 = new Person("Jhon", "Romero", Gender.MALE, 500000);
		Person developer3 = new Person("Dave", "Taylor", Gender.MALE, 450000);
		Person actor1 = new Person("Keanu", "Reeves", Gender.MALE, 280000);
		Person actor2 = new Person("Carrie-Anne", "Moss", Gender.FEMALE, 245000);
		Person actor3 = new Person("Marion", "Cotillard", Gender.FEMALE, 320000);
		Person actor4 = new Person("Leonardo", "Di Caprio", Gender.MALE, 295000);
		Person writer1 = new Person("David", "Mitchell", Gender.MALE, 2350000);
		Person writer2 = new Person("William", "Shakespear", Gender.MALE, 5250000);
		Person buyer1 = new Person("Jhon", "Doe", Gender.MALE);
		Person buyer2 = new Person("Jane", "Doe", Gender.FEMALE);

		List<Person> staff1 = new ArrayList<Person>();
		staff1.add(developer1);
		staff1.add(developer2);
		staff1.add(developer3);

		List<Person> cast1 = new ArrayList<Person>();
		cast1.add(actor1);
		cast1.add(actor2);

		List<Person> cast2 = new ArrayList<Person>();
		cast2.add(actor3);
		cast2.add(actor4);

		Game game1 = new Game("DOOM", buyer1, false, staff1, 50);
		Game game2 = new Game("DOOM II", buyer2, true, staff1, 60);
		Movie movie1 = new Movie("Matrix", buyer1, Genre.SCI_FI, 120, 9.5, cast1, 25);
		Movie movie2 = new Movie("Inception", buyer2, Genre.ACTION, 120, 9.0, cast2, 30);
		Book book1 = new Book("Cloud Atlas", buyer1, writer1);
		Book book2 = new Book("Macbeth", buyer2, writer2);

		List<Buyable> buyableProducts = new ArrayList<Buyable>();
		buyableProducts.add(game1);
		buyableProducts.add(game2);
		buyableProducts.add(movie1);
		buyableProducts.add(movie2);
		System.out.println("Total prefered income: " + preferdIncome(buyableProducts) + "\n");

		List<Product> prods = new ArrayList<Product>();
		prods.add(game1);
		prods.add(game2);
		prods.add(movie1);
		prods.add(movie2);
		prods.add(book1);
		prods.add(book2);

		for (Product product : prods) {
			System.out.println(product.toString());
		}
		for (Product product : prods) {
			System.out.println(product.title + " investment: " + product.getInvestment());
		}
	}

	public static int preferdIncome(List<Buyable> products) {
		int prefIncome = 0;
		for (Buyable product : products) {
			prefIncome += product.getPrice();
		}
		return prefIncome;
	}
}
