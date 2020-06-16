package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Movie.Movieinput;
import manager.MovieManager;

public class MovieViewer extends JPanel {
	
	WindowFrame frame;
	
	MovieManager movieManager;

	public MovieViewer(WindowFrame frame, MovieManager movieManager) {
		this.frame = frame;
		this.movieManager = movieManager;
		System.out.println("***" + movieManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Theater Num");
		model.addColumn("Name");
		model.addColumn("Start");
		model.addColumn("End");
		model.addColumn("Running T");
		
		for (int i=0; i < movieManager.size(); i++) {
			Vector row = new Vector();
			Movieinput mi = movieManager.get(i);
			row.add(mi.getTheater());
			row.add(mi.getName());
			row.add(mi.getStart());
			row.add(mi.getEnd());
			row.add(mi.getRunning());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		
		this.add(sp);		
	}

}
