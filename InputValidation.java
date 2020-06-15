import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

	
	public void checkInputFile(String input) throws InputMismatchException {
		
		// ^(Rewards|Regular)\\:\\s = Starts with Rewards or with Regular, followed by ":" and a space
		// (0?[1-9]|[12][0-9]|3[01]) = Days of a month from 01 to 31
		// ([a-zA-Z]{3,4} = Months 
		// [2][0]\\d{2} = Years from 2000 to 2099
		// \\((mon|tue|wed|thur|fri|sat|sun)\\)\\,? = name of a week or weekend days between "()", followed or not by " ,"
		String regex = "^(Rewards|Regular)\\:\\s((0?[1-9]|[12][0-9]|3[01])([a-zA-Z]{3,4})[2][0]\\d{2}\\((mon|tue|wed|thur|fri|sat|sun)\\)(\\,\\s)?)+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if (!(matcher.find() && matcher.start() == 0)) {
			throw new InputMismatchException();
		}
		
	}
}
