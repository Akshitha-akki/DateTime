package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
	      System.out.println("Current date: "+date);
	      //Getting the current time value
	      LocalTime time = LocalTime.now();
	      System.out.println("Current time: "+time);
	      //Getting the current date-time value
	      LocalDateTime dateTime = LocalDateTime.now();
	      System.out.println("Current date-time: "+dateTime);
	      
	      Date date1 = new Date();
	      String timeFormatString = "hh:mm:ss a";
	      DateFormat timeFormat = new SimpleDateFormat(timeFormatString);
	      String currentTime = timeFormat.format(date1);
	      System.out.println("Current time: "+currentTime);
	      String dateFormatString = "EEE, MMM d, ''yy";
	      DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
	      String currentDate = dateFormat.format(date1);
	      System.out.println("Current date: "+currentDate);
	}

}
