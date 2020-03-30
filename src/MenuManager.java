import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num = 5;

		while(num != 6) {
			System.out.println("** Multiplex TimeTable Management System Menu **");
			System.out.println(" 1. Add Movie");
			System.out.println(" 2. Delete Movie");
			System.out.println(" 3. Edit Movie");
			System.out.println(" 4. View Movie");
			System.out.println(" 5. Show a menu ");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1-5");
			num = input.nextInt();
			if (num == 1) {
				addMovie();
			}
			else if (num == 2 ) {
				deleteMovie();
			}
			else if (num == 3 ) {
				editMovie();
			}
			else if (num == 4 ) {
				viewMovie();
			}
			else {
				continue;
			}
			
		}
	}

	public static void addMovie() {

		Scanner input = new Scanner (System.in);
		System.out.print("Movie Name:");
		String MovieName = input.next();  
		System.out.print("Theater number:");
		int TheaterNumber = input.nextInt(); 
		System.out.println(TheaterNumber);
		System.out.print("Screening Start Time:");
		String StartTime = input.next(); 
		System.out.println(StartTime);
		System.out.print("Screening End Time:");
		String EndTime = input.next(); 	
		System.out.print("Screen Running Time:");
		String RunningTime = input.next(); 	
	}
	public static void deleteMovie() {
		Scanner input = new Scanner (System.in);
		System.out.print("Movie Name:");
		String MovieName = input.next(); 
	} 
	public static void editMovie() {
		Scanner input = new Scanner (System.in);
		System.out.print("Movie Name:");
		String MovieName = input.next(); 
	} 
	public static void viewMovie() {
		Scanner input = new Scanner (System.in);
		System.out.print("Movie Name:");
		String MovieName = input.next(); 
	} 

}