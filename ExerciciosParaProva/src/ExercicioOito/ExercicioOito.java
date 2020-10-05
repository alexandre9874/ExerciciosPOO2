package ExercicioOito;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import ExercicioNove.Aba;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExercicioOito extends JFrame {

	private JPanel contentPane;
	private JRadioButton botao0;
	private JRadioButton botao1;
	private JRadioButton botao2;
	private JRadioButton botao3;
	private JRadioButton botao4;
	private JRadioButton botao5;
	private JRadioButton botao6;
	private JRadioButton botao7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioOito frame = new ExercicioOito();
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
	public ExercicioOito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botao0 = new JRadioButton("\u00C9 o do lado");
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (botao0.isSelected()) {
					
					botao1.setSelected(false);
					botao2.setSelected(false);
					botao3.setSelected(false);
					botao4.setSelected(false);
					botao5.setSelected(false);
					botao6.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
	
		botao0.setBounds(19, 86, 147, 23);
		contentPane.add(botao0);
		
		botao1 = new JRadioButton("Talvez eu");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (botao1.isSelected()) {
					
					botao0.setSelected(false);
					botao2.setSelected(false);
					botao3.setSelected(false);
					botao4.setSelected(false);
					botao5.setSelected(false);
					botao6.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
		botao1.setBounds(19, 112, 147, 23);
		contentPane.add(botao1);
		
		botao2 = new JRadioButton("Est\u00E1 frio");
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (botao2.isSelected()) {
					
					botao0.setSelected(false);
					botao1.setSelected(false);
					botao3.setSelected(false);
					botao4.setSelected(false);
					botao5.setSelected(false);
					botao6.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
		botao2.setBounds(19, 138, 147, 23);
		contentPane.add(botao2);
		
		botao3 = new JRadioButton("\u00C9 o da direita");
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (botao3.isSelected()) {
					
					botao0.setSelected(false);
					botao2.setSelected(false);
					botao1.setSelected(false);
					botao4.setSelected(false);
					botao5.setSelected(false);
					botao6.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
		botao3.setBounds(19, 164, 147, 23);
		contentPane.add(botao3);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Qual \u00E9 o bot\u00E3o certo ?");
		lblNewJgoodiesTitle.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 25));
		lblNewJgoodiesTitle.setBounds(19, 25, 344, 32);
		contentPane.add(lblNewJgoodiesTitle);
		
		botao4 = new JRadioButton("\u00C9 o de baixo");
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botao4.isSelected()) {
					
					botao0.setSelected(false);
					botao2.setSelected(false);
					botao3.setSelected(false);
					botao1.setSelected(false);
					botao5.setSelected(false);
					botao6.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
		botao4.setBounds(168, 86, 147, 23);
		contentPane.add(botao4);
		
		botao5 = new JRadioButton("Est\u00E1 quente");
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botao5.isSelected()) {
					
					botao0.setSelected(false);
					botao2.setSelected(false);
					botao3.setSelected(false);
					botao4.setSelected(false);
					botao1.setSelected(false);
					botao6.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
		botao5.setBounds(168, 112, 147, 23);
		contentPane.add(botao5);
		
		botao6 = new JRadioButton("\u00C9 o de cima");
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botao6.isSelected()) {
					
					botao0.setSelected(false);
					botao2.setSelected(false);
					botao3.setSelected(false);
					botao4.setSelected(false);
					botao5.setSelected(false);
					botao1.setSelected(false);
					botao7.setSelected(false);
					
				}
			}
		});
		botao6.setBounds(168, 138, 147, 23);
		contentPane.add(botao6);
		
		botao7 = new JRadioButton("\u00C9 o da esquerda");
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botao7.isSelected()) {
					
					botao0.setSelected(false);
					botao2.setSelected(false);
					botao3.setSelected(false);
					botao4.setSelected(false);
					botao5.setSelected(false);
					botao6.setSelected(false);
					botao1.setSelected(false);
					
				}
			}
		});
		botao7.setBounds(168, 164, 147, 23);
		contentPane.add(botao7);
		
		JButton btnNewButton = new JButton("Confirmar Resposta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BotaoCerto ac = new BotaoCerto ();
				CaixaErrado er = new CaixaErrado();
				
				if (botao5.isSelected()) {
					ac.Acerto();
				} else {
					er.erro();
				}
			}
		});
		btnNewButton.setBounds(19, 211, 177, 23);
		contentPane.add(btnNewButton);
	}
}
