import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		MovieManager movieManager = new MovieManager(input);
		int num = -1;
		while(num != 5) {
			System.out.println("** Multiplex TimeTable Management System Menu **");
			System.out.println(" 1. Add Movie");
			System.out.println(" 2. Delete Movie");
			System.out.println(" 3. Edit Movie");
			System.out.println(" 4. View Movie");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1-5");
			num = input.nextInt();
			if (num == 1) {
				movieManager.addMovie();
			}
			else if (num == 2 ) {
				movieManager.deleteMovie();
			}
			else if (num == 3 ) {
				movieManager.editMovie();
			}
			else if (num == 4 ) {
				movieManager.viewMovies();
			}
			else {
				continue;
			}

		}
	}

}