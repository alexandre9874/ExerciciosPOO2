package ExercicioSete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExercicioSete extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioSete frame = new ExercicioSete();
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
	public ExercicioSete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		texto1 = new JTextField();
		texto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto1.getText();
			}
		});
		texto1.setBounds(101, 11, 184, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto2.getText();
			}
		});
		texto2.setBounds(101, 42, 184, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JButton Juntar = new JButton("Juntar Textos");
		Juntar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, ""+ texto1.getText() +" "+ texto2.getText() + "");
			}
		});
		Juntar.setBounds(78, 104, 134, 23);
		contentPane.add(Juntar);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Texto 1");
		lblNewJgoodiesTitle.setBounds(43, 14, 48, 14);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Texto 2");
		lblNewJgoodiesTitle_1.setBounds(43, 45, 59, 14);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		textField = new JTextField();
		textField.setBounds(126, 73, 86, 20);
		contentPane.add(textField);
		
		textField.setColumns(10);
	}
}
