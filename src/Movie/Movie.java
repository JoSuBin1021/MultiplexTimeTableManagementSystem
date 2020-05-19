package Movie;

import java.util.Scanner;

import exception.EndFormatException;
import exception.RunningFormatException;
import exception.StartFormatException;

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
	public void setStart(String start) throws StartFormatException {
		if (!start.contains(":") || start.equals("")) {
			throw new StartFormatException();
		}
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) throws EndFormatException {
		if(!end.contains(":") || end.equals("")) {
			throw new EndFormatException();
		}
		this.end = end;
	}
	public String getRunning() {
		return running;
	}
	public void setRunning(String running) throws RunningFormatException {
		if(!end.contains(":") || running.equals("")) {
			throw new RunningFormatException();
		}
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
		String start = "";
		while (start.contains(":")) {
			System.out.print("Starting Time :");
			start = input.next();
			try {
				this.setStart(start);
			} catch (StartFormatException e) {
				System.out.println("Incorrect Start time Format. put your start time that contains :");
			}	
		}
	}

	public void setEnding(Scanner input) {
		System.out.print("Ending Time :");
		String end = input.next();
		try {
			this.setEnd(end);
		} catch (EndFormatException e) {
			System.out.println("Incorrect End time Format. put your End time that contains :");
		}	
	}
	public void setRunning(Scanner input) {
		System.out.print("Running Time:");
		String running = input.next();
		try {
			this.setRunning(running);
		} catch (RunningFormatException e) {
			System.out.println("Incorrect Running time Format. put your Running time that contains :");
		}	

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

