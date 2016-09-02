import java.util.*;
public class ToDoList{
	private String title;
	private ArrayList<Task> list = new ArrayList<Task>();
	public void setTitle(String s){
		this.title = s;
	}

	public String getTitle(){
		return title;
	}
	public void addTask(Task tk){
		list.add(tk);
	}
	public void removeTask(){

	}

	public String[] listTitles(){
			int qnt = this.list.size();
			String[] titles = new String[qnt];
			for (int i = 0 ; i < qnt ; i++) {
				titles[i] = list.get(i).getTitle();
			}
			return titles;
	}
	public void prepToDoList(){
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Welcome to the TO DO LIST 0.0.0.0.1 \n would you like to start? y/n");
		c = sc.nextLine().charAt(0);
		if(c == 'y'){
			boolean addmore = false;
			do{
				Task t = new Task();
				System.out.println("Welcome to the new Task creator ;-) \n Enter the title of the task");
				String cont = sc.nextLine();
				t.setTitle(cont);

				System.out.println("Enter the description of the task");
				cont = sc.nextLine();
				t.setDescription(cont);
				
				System.out.println("Enter the year");
				int ans = sc.nextInt();
				t.setYear(ans);
				
				System.out.println("Enter the month");
				ans = sc.nextInt() - 1;
				t.setMonth(ans);
				
				System.out.println("Enter the day");
				ans = sc.nextInt() - 1;
				t.setDay(ans);
				
				System.out.println("Enter hour");
				ans = sc.nextInt();
				t.setHour(ans);
				
				System.out.println("Enter minutes");
				ans = sc.nextInt();
				t.setMinute(ans);

				String us = sc.nextLine();
				System.out.println("Enter tag");
				String tagIp = sc.nextLine();
				t.addTag(tagIp);
				addTask(t);
				
				System.out.println("Would you like to add more tasks? y/n");
				char d = sc.nextLine().charAt(0);
				if(d == 'y'){
					addmore = true;
				}else{
					addmore = false;
				}
			}while(addmore == true);
		}else if(c == 'n'){
			System.exit(0);
		}else{
			System.out.println("Can't you read? jeez next time use y or n ¬¬");
		}
	}


	public static void main(String[] args){
		ToDoList tdl = new ToDoList();
		tdl.prepToDoList();
		String[] titles = tdl.listTitles();
		for(String el : titles){
			System.out.println(el);
		}
	}
}