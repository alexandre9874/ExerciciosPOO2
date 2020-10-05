package ExercicioNove;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExercicioNove extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioNove frame = new ExercicioNove();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExercicioNove() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Borda Recheada");
		chckbxNewCheckBox.setBounds(242, 133, 141, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Molho");
		chckbxNewCheckBox_1.setBounds(180, 133, 60, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Queijo");
		chckbxNewCheckBox_2.setBounds(105, 133, 66, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bacon");
		chckbxNewCheckBox_3.setBounds(35, 133, 66, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton = new JButton("Confirmar pedido");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Aba nw = new Aba ();
				nw.newScreen();
			}
		});
		btnNewButton.setBounds(35, 176, 150, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(35, 85, 308, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Pizzaria Do Marciello");
		lblNewJgoodiesTitle.setFont(new Font("MV Boli", Font.ITALIC, 26));
		lblNewJgoodiesTitle.setBounds(35, 31, 269, 23);
		contentPane.add(lblNewJgoodiesTitle);
	}
}
