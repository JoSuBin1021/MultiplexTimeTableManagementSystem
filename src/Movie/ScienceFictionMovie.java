package Movie;

import java.util.Scanner;
public class ScienceFictionMovie extends Movie {

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
