import java.util.ArrayList;
import java.util.Scanner;

import Movie.Movie;
import Movie.ScienceFictionMovie;

public class MovieManager {
	ArrayList<Movie> movies = new ArrayList<Movie>();
	Scanner input;

	MovieManager(Scanner input){
		this.input = input;
	}

	public void addMovie() {
		int kind = 0;
		Movie movie;
		while (kind != 1 && kind !=2) {
			System.out.print("Select Movie Kind:");
			System.out.print("1 for Family Movie");
			System.out.print("2 for ScinceFiction" );
			System.out.print("Select Genre for Movie Kind between 1 and 2:");
			kind  = input.nextInt();
			if(kind == 1) {
				movie = new Movie();
				movie.getUserInput(input);
				movies.add(movie);
				break;

			}
			else if (kind == 2) {
				movie = new ScienceFictionMovie();
				movie.getUserInput(input);
				movies.add(movie);
				break;
			}
			else {
				System.out.print("Select Genre for Movie Kind between 1 and 2:");
			}
		}
	}
	public void deleteMovie() {

		System.out.print("Movie num:");
		int MovieNum = input.nextInt(); 
		int index = -1;
		for (int i=0; i<movies.size(); i++) {
			if (movies.get(i).getTheater() == MovieNum) {
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
			if (movie.getName() == MovieName) { 
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
						int theater = input.nextInt();
						movie.setTheater(theater);
					}

					else if (num == 2 ) {
						System.out.print("Movie Name :");
						String name = input.next();
						movie.setName(name);
					}
					else if (num == 3 ) {
						System.out.print("Starting Time :");
						String start = input.next();
						movie.setStart(start);
					}
					else if (num == 4 ) {
						System.out.print("Ending Time :");
						String end = input.next();
						movie.setEnd(end);
					}
					else if (num == 5 ) {
						System.out.print("Running Time:");
						String running = input.next();
						movie.setRunning(running);
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
		System.out.println("# of registered movies:" + movies.size());
		for (int i=0; i<movies.size(); i++) {
			movies.get(i).printInfo();
		}
	}
}

