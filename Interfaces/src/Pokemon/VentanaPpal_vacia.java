package Pokemon;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class VentanaPpal_vacia extends JFrame 
{
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JLabel lblNewLabel_4;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JComboBox comboBox_1;
	private JButton btnBorrar;
	private JLabel lblNewLabel_7;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_8;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	public VentanaPpal_vacia() {
		setTitle("Pokemons");
		setSize(new Dimension(500, 400));
		getContentPane().setLayout(new CardLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		panel = new JPanel();
		tabbedPane.addTab("Pokemons", null, panel, null);
		
		lblNewLabel = new JLabel("A\u00F1adir Pokemon");
		lblNewLabel.setBounds(32, 11, 77, 14);
		
		textField = new JTextField();
		textField.setBounds(83, 36, 150, 20);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(26, 36, 41, 14);
		
		lblNewLabel_2 = new JLabel("Generaci\u00F3n (1-9):");
		lblNewLabel_2.setBounds(26, 67, 85, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 64, 150, 20);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Tipo :");
		lblNewLabel_3.setBounds(299, 36, 27, 14);
		panel.setLayout(null);
		panel.add(lblNewLabel_2);
		panel.add(textField_1);
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_1);
		panel.add(textField);
		panel.add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"El\u00E9ctrico", "Agua", "Fuego", "Siniestro", "Bicho ", "Planta", "Lucha", "Volador", "Fantasma", "Tierra", "Roca", "Hielo", "Drag\u00F3n", "Acero", "Hada", "Ps\u00EDquico", "Normal", "Veneno"}));
		comboBox.setBounds(336, 32, 101, 22);
		panel.add(comboBox);
		
		lblNewLabel_4 = new JLabel("Estado Evolutivo:");
		lblNewLabel_4.setBounds(35, 107, 91, 14);
		panel.add(lblNewLabel_4);
		
		rdbtnNewRadioButton = new JRadioButton("Menor");
		rdbtnNewRadioButton.setBounds(127, 103, 55, 23);
		panel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Medio");
		rdbtnNewRadioButton_1.setBounds(178, 103, 55, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Mayor");
		rdbtnNewRadioButton_2.setBounds(235, 103, 55, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(10, 146, 223, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(245, 146, 224, 23);
		panel.add(btnNewButton_1);
		
		lblNewLabel_5 = new JLabel("Borra Pokemon");
		lblNewLabel_5.setBounds(32, 198, 94, 14);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Pokemon a borrar:");
		lblNewLabel_6.setBounds(56, 235, 101, 14);
		panel.add(lblNewLabel_6);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(167, 231, 223, 22);
		panel.add(comboBox_1);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(32, 299, 422, 23);
		panel.add(btnBorrar);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Combates", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblNewLabel_7 = new JLabel("Luchador 1:");
		lblNewLabel_7.setBounds(32, 56, 77, 14);
		panel_1.add(lblNewLabel_7);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(97, 52, 101, 22);
		panel_1.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(313, 52, 101, 22);
		panel_1.add(comboBox_3);
		
		lblNewLabel_8 = new JLabel("Luchador 2:");
		lblNewLabel_8.setBounds(242, 56, 77, 14);
		panel_1.add(lblNewLabel_8);
		
		rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBounds(132, 107, 109, 23);
		panel_1.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("");
		rdbtnNewRadioButton_4.setBounds(351, 107, 109, 23);
		panel_1.add(rdbtnNewRadioButton_4);
		
		btnNewButton_2 = new JButton("Guardar Combate");
		btnNewButton_2.setBounds(10, 299, 222, 23);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setBounds(242, 299, 218, 23);
		panel_1.add(btnNewButton_3);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Listados", null, panel_2, null);
		panel_2.setLayout(null);
		getContentPane().add(tabbedPane, "name_535970085498200");
	}
}
