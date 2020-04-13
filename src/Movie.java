
public class Movie {

	String name;
	int theater;
	String start;
	String end;
	String running;
	
	public Movie() {
		
	}
	public Movie(int theater, String name, String running) {
		this.name = name;
		this.theater = theater;
		this.running = running;
	}

	
	public Movie(int theater, String name,  String start, String end, String running) {
		super();
		this.name = name;
		this.theater = theater;
		this.start = start;
		this.end = end;
		this.running = running;
	}

	public void printInfo() {
		System.out.println( "theater:" + theater + "name:" + name +"start:" + start + "end:" + end + "running" + running );
	}
	
}
