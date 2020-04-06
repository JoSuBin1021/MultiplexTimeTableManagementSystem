
public class Movie {

	String name;
	int theater;
	String start;
	String end;
	String running;
	
	public Movie() {
		
	}
	public Movie(String name, int theater, String running) {
		this.name = name;
		this.theater = theater;
		this.running = running;
	}

	
	public Movie(String name, int theater, String start, String end, String running) {
		super();
		this.name = name;
		this.theater = theater;
		this.start = start;
		this.end = end;
		this.running = running;
	}

	public void printInfo() {
		System.out.println("name:" + name + "theater:" + theater + "start:" + start + "end:" + end + "running" + running );
	}
	
}
