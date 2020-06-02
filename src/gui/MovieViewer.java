package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MovieViewer extends JFrame {

	public MovieViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Theater Num");
		model.addColumn("Name");
		model.addColumn("Start");
		model.addColumn("End");
		model.addColumn("Running T");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
