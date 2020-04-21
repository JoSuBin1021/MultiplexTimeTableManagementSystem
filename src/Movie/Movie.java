package Movie;

import java.util.Scanner;

public class Movie {
    protected int theater;
	protected String name;
	protected String start;
	protected String end;
	protected String running;
	
	public Movie() {
		
	}
	public Movie( String name, String running) {
		this.name = name;
	
		this.running = running;
	}

	
	public Movie( int theater, String name,  String start, String end, String running) {
		super();
		this.theater = theater;
		this.name = name;
		this.start = start;
		this.end = end;
		this.running = running;
	}
	protected MovieKind kind = MovieKind.Family;
	public MovieKind getKind() {
		return kind;
	}
	public void setKind(MovieKind kind) {
		this.kind = kind;
	}
	public int getTheater() {
		return theater;
	}
	public void setTheater(int theater) {
		this.theater = theater;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getRunning() {
		return running;
	}
	public void setRunning(String running) {
		this.running = running;
	}


	public void printInfo() {
		System.out.println("Theater:" + theater + "name:" + name +"start:" + start + "end:" + end + "running" + running );
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Theater Number:");
		int theater = input.nextInt();
		this.setTheater(theater);
		
		System.out.print("Movie Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Screening Start Time:");
		String start = input.next(); 
		this.setStart(start);
		
		System.out.print("Screening End Time:");
		String end = input.next();
		this.setEnd(end);
		
		System.out.print("Screen Running Time:");
		String running = input.next(); 	
		this.setRunning(running);	
		}
}
