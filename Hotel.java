public class Hotel {
	private String name;
	private int rating;
	private double reward_weekend;
	private double reward_weekday;
	private double regular_weekend;
	private double regular_weekday;

	private Hotel(String name, int rating, double reward_weekend, double reward_weekday, double regular_weekend, double regular_weekday) {
		this.name = name;
		this.rating = rating;
		this.reward_weekend = reward_weekend;
		this.reward_weekday = reward_weekday;
		this.regular_weekend = regular_weekend;
		this.regular_weekday =regular_weekday;
	}

	public static class HotelBuilder {
		private String name;
		private int rating;
		private double reward_weekend;
		private double reward_weekday;
		private double regular_weekend;
		private double regular_weekday;

		public HotelBuilder(){

		}
		
		public HotelBuilder(String name) {
			this.name = name;
		}

		public HotelBuilder name(String name){
			this.name = name;
			return this;
		}

		public HotelBuilder rating(int rating){
			this.rating = rating;
			return this;
		}

		public HotelBuilder reward_weekend(double reward_weekend){
			this.reward_weekend = reward_weekend;
			return this;
		}

		public HotelBuilder reward_weekday(double reward_weekday){
			this.reward_weekday = reward_weekday;
			return this;
		}

		public HotelBuilder regular_weekend(double regular_weekend){
			this.regular_weekend = regular_weekend;
			return this;
		}

		public HotelBuilder regular_weekday(double regular_weekday){
			this.regular_weekday = regular_weekday;
			return this;
		}

		public Hotel createHotel() {
			return new Hotel(name, rating, reward_weekend, reward_weekday, regular_weekend, regular_weekday);
		}
	}

	public int getRating() {
		return this.rating;
	}

	public String getName(){
		return this.name;
	}

	public double hotelPriceCalculator(Date date) {

		int weekday = date.getWeekday();
		int weekend = date.getWeekend();
		boolean reward = date.getReward();
		double price;

		if (reward) {
			price = (reward_weekend*weekend)+(reward_weekday*weekday);
		} else {
			price = (regular_weekend*weekend)+(regular_weekday*weekday);
		}

		return price;
	}
}
