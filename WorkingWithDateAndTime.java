import java.time.LocalDate;
import java.time.LocalTime;

public class WorkingWithDateAndTime{
	public static void main(String[] args){
		
		LocalDate currentdate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2014,5,17);
		LocalDate resumptionDate = LocalDate.parse("2026-06-17");
		
		if(myDate.equals(currentdate)){
			System.out.println("Today is your appointment day");
		}
		else{
			System.out.println("Today is not your appointment day");
		}
		
		System.out.println("Working with dates");
		System.out.printf("Today's date is %s%n",currentdate);
		System.out.printf("The weding date is %s%n",myDate);
		System.out.printf("The resumption date is %s%n",resumptionDate);
		System.out.printf("The Year is %s%n",currentdate.getYear());
		System.out.printf("The Month is %s%n",currentdate.getMonth());
		System.out.printf("The Day is %s%n",currentdate.getDayOfMonth());
		System.out.printf("My exams will be on the %s%n ",currentdate.plusDays(7));
		System.out.printf("The year is %s%n ",currentdate.plusYears(2));
		System.out.printf("My month is %s%n ",currentdate.plusMonths(6));
		
		
		System.out.println("Working with time ");
		LocalTime currentTime = LocalTime.now();
		LocalTime myTime = LocalTime.of(2,3,12);
		LocalTime resumptionTime = LocalTime.parse("03:55:17");
		
	
		System.out.printf("The time is %s%n",currentTime);
		System.out.printf("The weding time is %s%n",myTime);
		System.out.printf("The resumption time is %s%n",resumptionTime);
		System.out.printf("The hour is %s%n",currentTime.getHour());
		System.out.printf("The Minute is %s%n",currentTime.getMinute());
		System.out.printf("The seconds is %s%n",currentTime.getSecond());
		System.out.printf("My exams time will be by %s%n ",currentTime.plusHours(2));
		System.out.printf("The Time is %s%n ",currentTime.plusMinutes(60));
		System.out.printf("The seconds is %s%n ",currentTime.plusSeconds(30));
		
		
	}
}