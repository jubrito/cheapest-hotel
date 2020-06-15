public class Date {
	
	private int weekend;
	private int weekday;
	private boolean reward = false;

	public Date (String availability){
		this.reward = checkReward(availability);
		this.weekend = checkDates(availability, true);
		this.weekday = checkDates(availability, false);
	}

	public int getWeekend() {
		return this.weekend;
	}

	public int getWeekday() {
		return this.weekday;
	}

	public boolean getReward() {
		return this.reward;
	}

	int checkDates (String availability, boolean isWeekend) {
		String [] dates = availability.split(" ");
		int weekend = 0;
		int weekday = 0;
		for (int i=1; i<dates.length; i++) {
			if (dates[i].contains("sat") || dates[i].contains("sun"))  weekend ++;
			else weekday ++;
		}

		if (isWeekend) return weekend;
		else return weekday;
	}

	boolean checkReward (String availability){
		if (availability.contains("Rewards")) {
			return true;
		} else {
			return false;
		} 
	}
}
