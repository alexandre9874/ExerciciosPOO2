package ExercicioOito;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class CaixaErrado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void erro() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaixaErrado frame = new CaixaErrado();
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
	public CaixaErrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Errou");
		lblNewJgoodiesTitle.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 23));
		lblNewJgoodiesTitle.setBounds(100, 49, 64, 28);
		contentPane.add(lblNewJgoodiesTitle);
	}
}
