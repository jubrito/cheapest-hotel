public class CheapestHotel {

	public int compareRating (double hotel1_rate, double hotel2_rate) {
		if (hotel1_rate > hotel2_rate) return 1;
		else { return 2; }
	}

	public int comparePrice (double [][] hotels) {
		double aux = hotels[0][0];
		double auxrate = hotels[0][1];
		int hotel = 0;

		for (int i=1; i<hotels.length; i++) {
			if (hotels[i][0] == aux) {
				if (compareRating(hotels[i][1], auxrate) == 1){
					aux = hotels[i][0];
					hotel = i;
				}
			}
			if (hotels[i][0] < aux) {
				aux = hotels[i][0];
				auxrate = hotels[i][1];
				hotel = i;
			}
		}
		return hotel+1;
	}

	public void calculateCheapestHotel(Date date, Hotel hotel1, Hotel hotel2, Hotel hotel3) {
		
		Calculator calculator = new Calculator();

		double hotel1_price = calculator.totalPriceCalculator(date, hotel1);
		double hotel1_rating = hotel1.getRating();
		String hotel1_name = hotel1.getName();

		double hotel2_price = calculator.totalPriceCalculator(date, hotel2);
		double hotel2_rating = hotel2.getRating();
		String hotel2_name = hotel2.getName();

		double hotel3_price = calculator.totalPriceCalculator(date, hotel3);
		double hotel3_rating = hotel3.getRating();
		String hotel3_name = hotel3.getName();

		double [][] hotels = {
			{hotel1_price, hotel1_rating},
			{hotel2_price, hotel2_rating},
			{hotel3_price, hotel3_rating}
		};
		
		int hotel = comparePrice(hotels);

		switch (hotel) {
			case 1: 
				System.out.println(hotel1_name);
				break;
			case 2: 
				System.out.println(hotel2_name);
				break;
			case 3:
				System.out.println(hotel3_name);
				break;
		}
	}
}
