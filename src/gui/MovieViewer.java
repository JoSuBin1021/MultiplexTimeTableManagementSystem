package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MovieViewer extends JPanel {
	
	WindowFrame frame;

	public MovieViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Theater Num");
		model.addColumn("Name");
		model.addColumn("Start");
		model.addColumn("End");
		model.addColumn("Running T");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		
		this.add(sp);		
	}

}
