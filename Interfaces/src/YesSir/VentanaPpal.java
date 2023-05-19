package YesSir;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPpal extends JFrame {
	
	private Vista vista;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	
	public VentanaPpal(Vista vista) {
		setTitle("Gestion De Alumnos");
		setMinimumSize(new Dimension(400, 300));
		this.vista = vista;
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		
		mnNewMenu = new JMenu("Alumnos");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Alta");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuAltaPulsado();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Listar todo");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
	
	private void menuAltaPulsado() {
		this.vista.menuAltaPulsado();
	}
	
	protected void menuListarTodoPulsado() {
		this.miAreaTexto.setText(this.vista.getListaCompleto());
	}

}
