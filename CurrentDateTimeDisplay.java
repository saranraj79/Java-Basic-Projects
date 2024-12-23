import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CurrentDateTimeDisplay{
	public static void main(String args[]){
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter newdatetime=DateTimeFormatter.ofPattern("E,dd MMM yyyy \nHH:mm");
		String currentDateTime=datetime.format(newdatetime);
		System.out.println(currentDateTime);
	}
}