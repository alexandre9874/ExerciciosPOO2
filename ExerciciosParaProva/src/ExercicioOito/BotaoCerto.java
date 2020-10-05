package ExercicioOito;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class BotaoCerto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Acerto() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotaoCerto frame = new BotaoCerto();
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
	public BotaoCerto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 216, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Acertou");
		lblNewJgoodiesTitle.setFont(new Font("Tekton Pro", Font.PLAIN, 21));
		lblNewJgoodiesTitle.setBounds(58, 50, 88, 26);
		contentPane.add(lblNewJgoodiesTitle);
	}
}
