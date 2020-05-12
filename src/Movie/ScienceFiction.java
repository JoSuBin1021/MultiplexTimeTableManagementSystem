package Movie;

import java.util.Scanner;

public class ScienceFiction extends Movie {
	
	public ScienceFiction(MovieKind kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner input) {
		setTheater(input);
		setMovieName(input);
		setStarting(input);
		setEnding(input);
		setRunning(input);
		}
	public void printInfo() {
	    String mkind = getKindString();
		System.out.println("kind:" + mkind + "Theater:" + theater + "name:" + name +"start:" + start + "end:" + end + "running" + running );
	
	}

}
