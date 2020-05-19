import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		MovieManager movieManager = new MovieManager(input);

		selectMenu(input, movieManager);
	}
	public static void selectMenu(Scanner input, MovieManager movieManager ) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu(); 
				num = input.nextInt();

				switch(num) {
				case 1:
					movieManager.addMovie();
					break;
				case 2:
					movieManager.deleteMovie();
					break;
				case 3:
					movieManager.editMovie();
					break;
				case 4:
					movieManager.viewMovies();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
				
			}
		}
	}
	public static void showMenu() {
		System.out.println("** Multiplex TimeTable Management System Menu **");
		System.out.println(" 1. Add Movie");
		System.out.println(" 2. Delete Movie");
		System.out.println(" 3. Edit Movie");
		System.out.println(" 4. View Movie");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1-5");
	}

} 