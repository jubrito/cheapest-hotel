import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelChooser {
	
	
	public static void main(String[] args) {
		boolean repeat = true;
		String name_file;
		String input;

		while (repeat) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nEnter the input file path above or -1 to stop the program");
			System.out.println("Exemple: C:\\Users\\Name\\Downloads\\file_name.txt");
			name_file = scanner.nextLine();
			
			if (!name_file.equals("-1")) {
				try {
					
					repeat = true;
			   		FileReader file = new FileReader(name_file);
			    	BufferedReader readFile = new BufferedReader(file);
			    	input = readFile.readLine();
	
			    	InputValidation validation = new InputValidation();
			    	validation.checkInputFile(input);
	 				
			    	Hotel hotel1 = new Hotel.HotelBuilder("Lakewood")
			    		.rating(3)
			    		.reward_weekend(80)
			    		.reward_weekday(80)
			    		.regular_weekend(90)
			    		.regular_weekday(110)
			    		.createHotel();
			    	Hotel hotel2 = new Hotel.HotelBuilder("Bridgewood")
			    		.rating(4)
			    		.reward_weekend(50)
			    		.reward_weekday(110)
			    		.regular_weekend(60)
			    		.regular_weekday(160)
			    		.createHotel();
			    	Hotel hotel3 = new Hotel.HotelBuilder("Ridgewood")
			    		.rating(5)
			    		.reward_weekend(40)
			    		.reward_weekday(100)
			    		.regular_weekend(150)
			    		.regular_weekday(220)
			    		.createHotel();
	
					Date date = new Date(input);
	
					CheapestHotel cheapesthotel = new CheapestHotel();
					cheapesthotel.calculateCheapestHotel(date, hotel1, hotel2, hotel3);
	
			    	file.close();
	
			    } catch (IOException e) {
		        	System.err.printf("Invalid input file %s.\n \n",
		          	e.getMessage());
		          	repeat = true;
		    	}  catch (NullPointerException e) {
		            System.err.printf("The input file is empty.\n",
		        	e.getMessage());
		        	repeat = true;
		        }  catch (InputMismatchException e) {
		        	 System.err.printf("The input file structure is not valid.\n",
		 		     e.getMessage());
		        	 repeat = true;
		        }
			} else {
				repeat = false;
				if(scanner!=null) scanner.close();
			}
	    }
	}
}