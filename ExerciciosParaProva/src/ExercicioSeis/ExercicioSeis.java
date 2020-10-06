package ExercicioSeis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExercicioSeis extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioSeis frame = new ExercicioSeis();
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
	public ExercicioSeis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 231, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nome = new JTextField();
		nome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome.getText();
			}
		});
		nome.setBounds(89, 27, 86, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		idade = new JTextField();
		idade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				idade.getText();
			}
		});
		idade.setBounds(89, 69, 86, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Nome");
		lblNewJgoodiesTitle.setBounds(10, 30, 79, 14);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Idade");
		lblNewJgoodiesTitle_1.setBounds(12, 72, 67, 14);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		JButton btnNewButton = new JButton("Estou apto ? ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a;
				
				a = Integer.parseInt(idade.getText());
				
				if (a >= 16 ) {
					JOptionPane.showMessageDialog(null,nome.getText() +" você pode tirar carteira de motorista");
				} else {
					JOptionPane.showMessageDialog(null,nome.getText() +" você não pode tirar carteira de motorista");
				}	
			}
		});
		btnNewButton.setBounds(56, 101, 119, 23);
		contentPane.add(btnNewButton);
	}
}
