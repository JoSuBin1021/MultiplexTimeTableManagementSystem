import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager {
	ArrayList<Movie> movies = new ArrayList<Movie>();
	Scanner input;

	MovieManager(Scanner input){
		this.input = input;
	}
	public void addMovie() {
		Movie movie = new Movie();  
		System.out.print("Theater number:");
		movie.theater = input.nextInt();
		System.out.print("Movie Name:");
		movie.name = input.next();
		System.out.print("Screening Start Time:");
		movie.start = input.next(); 
		System.out.print("Screening End Time:");
		movie.end = input.next(); 	
		System.out.print("Screen Running Time:");
		movie.running = input.next(); 	
		movies.add(movie);
	}
	public void deleteMovie() {

		System.out.print("Theater Number:");
		int MovieNum = input.nextInt(); 
		int index = -1;
		for (int i=0; i<movies.size(); i++) {
			if (movies.get(i).theater == MovieNum) {
				index = i;
				break;
			}
		}

		if (index>=0) {
			movies.remove(index);
			System.out.println("the Theater movie" + MovieNum + "is deleted");
		}
		else {
			System.out.println("the movie has not been registered");
			return;
		}
	} 




	public void editMovie() {

		System.out.print("Movie Name:");
		String MovieName = input.next(); 
		for(int i=0; i<movies.size(); i++) {
			Movie movie = movies.get(i);
			if (movie.name == MovieName) { 
				int num = -1;
				while(num != 6) {
					System.out.println("** Multiplex Info Edit Menu **");
					System.out.println(" 1. Edit Theater");
					System.out.println(" 2. Edit Movie Name");
					System.out.println(" 3. Edit Starting Time");
					System.out.println(" 4. Edit End Time");
					System.out.println(" 5. Edit Running Time");
					System.out.println(" 6. Exit");
					System.out.println("Select one number between 1-6");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Movie Name :");
						movie.theater = input.nextInt();
					}

					else if (num == 2 ) {
						System.out.print("Movie Name :");
						movie.name = input.next();
					}
					else if (num == 3 ) {
						System.out.print("Starting Time :");
						movie.start = input.next();
					}
					else if (num == 4 ) {
						System.out.print("Ending Time :");
						movie.end = input.next();
					}
					else if (num == 5 ) {
						System.out.print("Running Time:");
						movie.running = input.next();
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for

	} 
	public void viewMovies() {

		//		System.out.print("Movie Name:");
		//		String MovieName = input.next(); 
		for (int i=0; i<movies.size(); i++) {
			movies.get(i).printInfo();
		}
	}
}

