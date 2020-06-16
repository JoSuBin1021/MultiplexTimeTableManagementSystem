package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		MovieManager movieManager = getObject("moviemanger.ser");
		if(movieManager == null) {
			movieManager = new MovieManager(input);
		}
		else {
			movieManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(movieManager);
		selectMenu(input, movieManager);
		putObject(movieManager, "moviemanger.ser");
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
					logger.log("add a Movie");
					break;
				case 2:
					movieManager.deleteMovie();
					logger.log("delete a Movie");
					break;
				case 3:
					movieManager.editMovie();
					logger.log("edit a Movie");
					break;
				case 4:
					movieManager.viewMovies();
					logger.log("view a list of Movie");
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

	public static MovieManager getObject(String filename) {
		MovieManager movieManager = null;



		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			movieManager = (MovieManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return movieManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return movieManager;

	}
	public static void putObject(MovieManager movieManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(movieManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} 