import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.util.*;

public class Task{
		Scanner sc = new Scanner(System.in);
		private int year;
		private int month;
		private int day;
		private int hour;
		private int min;
		private String title;
		private String description;
		private int importance;
		private boolean done;
		private ArrayList<String> tags = new ArrayList<String>();

		public Task(){

		}
		//Initialize variables of Task class
		public Task(String title, String description, int importance,int year,int month,int day,int hour,int min,String tag ){
			this.title = title;
			this.description = description;
			this.importance = importance;
			this.year = year;
			this.month = month;
			this.day = day;
			this.hour = hour;
			this.min = min;
			this.done = false;
			addTag(tag);
		}
		//In case of no tags
		public Task(String title, String description, int importance,int year,int month,int day,int hour,int min){
			this.title = title;
			this.description = description;
			this.importance = importance;
			this.year = year;
			this.month = month;
			this.day = day;
			this.hour = hour;
			this.min = min;
			this.done = false;
		}

		public void displayTask(){
			Calendar calendar = new GregorianCalendar(year,month,day,hour,min);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd hh:mm a");
			System.out.printf("The Task \"%s\"  with the description \"%s\" is due to \n",title,description);	
			System.out.println(sdf.format(calendar.getTime())+" with the tags: " + getTags());
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

		public void addTags(String tag){
			String[] tagArr = tag.split(", ");
			for (int i = 0 ; i < tagArr.length ; i++){
				this.tags.add(tagArr[i]);
			}
			
		}

		public void addTag(String tag){
			this.tags.add(tag);
		}
		public void setDone(boolean d){
			this.done = d;
		}

		public boolean getDone(){
			return done;
		}

		public String getTags() {
			String devolver = "";
			int qnt = this.tags.size();
			for (int i = 0 ; i < qnt ; i++) {
				devolver = devolver + this.tags.get(i) + ", ";
				
				
			}
			devolver = devolver.substring(0, devolver.length()-2);
			return devolver;
		}

}
