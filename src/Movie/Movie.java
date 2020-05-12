package Movie;

import java.util.Scanner;

public abstract class Movie implements Movieinput {
	protected MovieKind kind = MovieKind.Family;
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


	public Movie( MovieKind kind, int theater, String name,  String start, String end, String running) {
		super();
		this.kind = kind;
		this.theater = theater;
		this.name = name;
		this.start = start;
		this.end = end;
		this.running = running;
	}

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


	public abstract void printInfo();

	public void setTheater(Scanner input) {
		System.out.print("Theater Number :");
		int theater = input.nextInt();
		this.setTheater(theater);
	}

	public void setMovieName(Scanner input) {
		System.out.print("Movie Name :");
		String name = input.next();
		this.setName(name);
	}

	public void setStarting(Scanner input) {
		System.out.print("Starting Time :");
		String start = input.next();
		this.setStart(start);
	}
	public void setEnding(Scanner input) {
		System.out.print("Ending Time :");
		String end = input.next();
		this.setEnd(end);
	}
	public void setRunning(Scanner input) {
		System.out.print("Running Time:");
		String running = input.next();
		this.setRunning(running);
	}
	public String getKindString() {
		String mkind = "none";
		switch(this.kind) {
		case Family:
			mkind = "Fam.";
			break;
		case ScienceFiction:
			mkind = "SF.";
			break;
		case Action:
			mkind = "Action.";
			break;
		case Romance:
			mkind = "Rom.";
			break;
		case Documentary:
			mkind = "Docu.";
			break;
		case Horror:
			mkind = "Horror.";
			break;
		default:			
		}
		return mkind;
	}
}

