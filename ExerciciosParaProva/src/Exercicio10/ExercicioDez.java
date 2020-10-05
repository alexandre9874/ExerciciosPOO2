package Exercicio10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class ExercicioDez extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioDez frame = new ExercicioDez();
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
	public ExercicioDez() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Abre Campo");
		comboBox.addItem("Acaiaca");
		comboBox.addItem("Aguanil");
		comboBox.addItem("Aiuruoca");
		comboBox.addItem("Albertina");
		comboBox.setSelectedItem(null);
		
		
		comboBox.setBounds(10, 58, 404, 20);
		panel.add(comboBox);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Escolha as cidades ");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewJgoodiesTitle.setBounds(105, 11, 215, 25);
		panel.add(lblNewJgoodiesTitle);
	}
}
