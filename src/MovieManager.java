import java.util.Scanner;

public class MovieManager {
	Movie movie;
	Scanner input;
	
	MovieManager(Scanner input){
		this.input = input;
	}
	public void addMovie() {
		movie = new Movie(); 
		System.out.print("Movie Name:");
		movie.name = input.next();  
		System.out.print("Theater number:");
		movie.theater = input.nextInt(); 
		System.out.print("Screening Start Time:");
		movie.start = input.next(); 
		System.out.print("Screening End Time:");
		movie.end = input.next(); 	
		System.out.print("Screen Running Time:");
		movie.running = input.next(); 	
	}
	public void deleteMovie() {

		System.out.print("Movie Name:");
		String MovieName = input.next(); 
		if (movie == null) {
			System.out.println("the movie has not been registered");
			return;
		}
		if (movie.name == MovieName) {
			movie = null;
			System.out.println("the movie is deleted");
		}
	} 
	public void editMovie() {

		System.out.print("Movie Name:");
		String MovieName = input.next(); 
		if (movie.name == MovieName) { 
			System.out.println("the movie to be edited is " + MovieName);
		}
		
	} 
	public void viewMovie() {

		System.out.print("Movie Name:");
		String MovieName = input.next(); 
		if (movie.name.equals(MovieName)) {
			movie.printInfo();
		}
	} 

}
