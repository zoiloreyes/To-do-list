import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.util.*;

public class Event{
		Scanner sc = new Scanner(System.in);
		private int year;
		private int month;
		private int day;
		private int hour;
		private int min;
		private String title;
		private String description;
		private int importance;

		public void prepareEvent(){
			System.out.println("Welcome to the new Event creator ;-) \n Enter the title of the task");
			String cont = sc.nextLine();
			setTitle(cont);
			System.out.println("Enter the description of the task");
			cont = sc.nextLine();
			setDescription(cont);
			System.out.println("Enter the year");
			int ans = sc.nextInt();
			setYear(ans);
			System.out.println("Enter the month");
			ans = sc.nextInt() - 1;
			setMonth(ans);
			System.out.println("Enter the day");
			ans = sc.nextInt() - 1;
			setDay(ans);
			System.out.println("Enter hour");
			ans = sc.nextInt();
			setHour(ans);
			System.out.println("Enter minutes");
			ans = sc.nextInt();
			setMinute(ans);
		}

		public void displayEvent(){
			Calendar calendar = new GregorianCalendar(year,month,day,hour,min);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd hh:mm a");
			System.out.printf("The Event \"%s\"  with the description \"%s\" is due to \n",title,description);	
			System.out.println(sdf.format(calendar.getTime()));
		}
		public void setImportance(int imp){
			this.importance = imp;
		}

		public int getImportance(){
			return importance;
		}

		public String getTitle(){
			return title;
		}

		public void setTitle(String title){
			this.title = title;
		}

		public String getDescription(){
			return description;
		}

		public void setDescription(String description){
			this.description = description;
		}

		public int getYear(){
			return year;
		}

		public void setYear(int year){
			this.year = year;
		}

		public int getMonth(){
			return month;
		}

		public void setMonth(int month){
			this.month = month;
		}
	
		public int getDay(){
			return day;
		}

		public void setDay(int day){
			this.day = day;
		}
		public int getMinute(){
			return min;
		}

		public void setMinute(int min){
			this.min = min;
		}
		public int getHour(){
			return hour;
		}

		public void setHour(int hour){
			this.hour = hour;
		}
	public static void main(String[] args){
		Event ev = new Event();
		ev.prepareEvent();
		ev.displayEvent();
		
	}
}