package YesSir;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoAltaAlumno extends JDialog {

	private Vista vista;
	private JLabel lblNewLabel;
	private JTextField campoNombre;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextField campoEdad;
	private JButton btnNewButton_1;

	public DialogoAltaAlumno(Vista vista) {
		setModal(true);
		setTitle("Alta");
		this.vista = vista;

		lblNewLabel = new JLabel("Nombre:");

		campoNombre = new JTextField();
		campoNombre.setColumns(10);

		btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonCancelarPulsado();
			}
		});

		lblNewLabel_1 = new JLabel("Edad:");

		campoEdad = new JTextField();
		campoEdad.setColumns(10);

		btnNewButton_1 = new JButton("Dar De Alta");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				botonAltaPulsado();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING,
						groupLayout.createSequentialGroup().addContainerGap(216, Short.MAX_VALUE)
								.addComponent(btnNewButton_1).addGap(18).addComponent(btnNewButton).addGap(22))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false).addGroup(Alignment.LEADING,
								groupLayout.createSequentialGroup().addComponent(lblNewLabel_1)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(campoEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING,
										groupLayout.createSequentialGroup().addComponent(lblNewLabel).addGap(18)
												.addComponent(campoNombre, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(274, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(
						campoNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1).addComponent(
						campoEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(153).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
				.addContainerGap(19, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);
	}

	protected void botonCancelarPulsado() {
		this.setVisible(false);

	}

	protected void botonAltaPulsado() {
		this.vista.altaAlumno(this.campoNombre.getText(), Integer.parseInt(this.campoEdad.getText()));
		
		this.campoNombre.setText("");
		this.campoEdad.setText("");
		this.setVisible(false);
		
	}
}
