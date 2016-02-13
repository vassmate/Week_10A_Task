package movies_v2;

public class IdGenerator {

	public static String generator(Product product) {

		if (product instanceof Movie) {
			Movie movie = (Movie) product;
			return movie.id = "MOV";
		} else if (product instanceof Game) {
			Game game = (Game) product;
			return game.id = "GAM";
		} else {
			Book book = (Book) product;
			return book.id = "BOO";
		}
	}
}
