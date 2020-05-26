import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Movie.Action;
import Movie.Family;
import Movie.Movie;
import Movie.MovieKind;
import Movie.Movieinput;
import Movie.ScienceFiction;


public class MovieManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5941090462440847439L;
	
	ArrayList<Movieinput> movies = new ArrayList<Movieinput>();
	transient Scanner input;
	MovieManager(Scanner input){
		this.input = input;
	}

	public void addMovie() {
		int kind = 0;
		Movieinput movieInput;
		while (kind != 1 && kind !=2) {
			try {
				System.out.print("Select Movie Kind:");
				System.out.print("1 for Family Movie");
				System.out.print("2 for ScinceFiction" );
				System.out.print("3 for Action");
				System.out.print("Select Genre for Movie Kind between 1 and 2:");
				kind  = input.nextInt(); 

				if(kind == 1) {
					movieInput = new Family(MovieKind.Family);
					movieInput.getUserInput(input);
					movies.add(movieInput);
					break;

				}

				else if (kind == 2) {
					movieInput = new ScienceFiction(MovieKind.ScienceFiction);
					movieInput.getUserInput(input);
					movies.add(movieInput);
					break;
				}
				else if (kind == 3) {
					movieInput = new Action(MovieKind.Action);
					movieInput.getUserInput(input);
					movies.add(movieInput);
					break;
				}

				else {
					System.out.print("Select Genre for Movie Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteMovie() {

		System.out.print("Movie num:");
		int MovieNum = input.nextInt(); 
		int index = findIndex(MovieNum);
		removefromMovies(index, MovieNum);
	} 
	public int findIndex(int MovieNum) {
		int index = -1;
		for (int i=0; i<movies.size(); i++) {
			if (movies.get(i).getTheater() == MovieNum) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromMovies(int index, int MovieNum) {
		if (index>=0) {
			movies.remove(index);
			System.out.println("the Theater movie" + MovieNum + "is deleted");
			return 1;
		}
		else {
			System.out.println("the movie has not been registered");
			return -1;
		}
	}


	public void editMovie() {

		System.out.print("Movie Name:");
		String MovieName = input.next(); 
		for(int i=0; i<movies.size(); i++) {
			Movieinput movie = movies.get(i);
			if (movie.getName() == MovieName) { 
				int num = -1;
				while(num != 6) {
					showEditMenu(); 
					num = input.nextInt();
					switch(num) {
					case 1:
						movie.setTheater(input);
						break;
					case 2:
						movie.setMovieName(input);
						break;
					case 3:
						movie.setStarting(input);
						break;
					case 4:
						movie.setEnding(input);
						break;
					case 5:
						movie.setRunning(input);
						break;
					default:
						continue;
					}
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
			((Movie) movies.get(i)).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("** Multiplex Info Edit Menu **");
		System.out.println(" 1. Edit Theater");
		System.out.println(" 2. Edit Movie Name");
		System.out.println(" 3. Edit Starting Time");
		System.out.println(" 4. Edit End Time");
		System.out.println(" 5. Edit Running Time");
		System.out.println(" 6. Exit");
		System.out.println("Select one number between 1-6");
	}

	public void setScanner(Scanner input) {
		this.input = input;
		
	}
	
}

