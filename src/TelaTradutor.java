import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class TelaTradutor {

	private JFrame frame;
	private JComboBox comboBox;
	private JTextField textField;
	private JButton button;
	private JLabel label;
	private JButton button_1;
	private JButton button_2;
	private JLabel label_1;
	private JLabel label_2;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JLabel label_3;
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTradutor window = new TelaTradutor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaTradutor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Tradutor tradutor = new Tradutor();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBackground(new Color(255, 255, 255));
		frame.setForeground(new Color(0, 0, 0));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaTradutor.class.getResource("/imagem/faustoFofo.jpg")));
		frame.setFont(new Font("Xilosa", Font.PLAIN, 12));
		frame.setTitle("Tradutor");
		frame.setBounds(100, 100, 575, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Para Português", "Para Inglês"}));
		comboBox.setFont(new Font("Xilosa", Font.PLAIN, 15));
		comboBox.setBounds(260, 55, 143, 28);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(260, 120, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button = new JButton("Traduzir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionado = comboBox.getSelectedItem().toString();
				if (selecionado.contains("portugu")) {
					// TAMO AQUI ooooooooooooooooooooooooooooooooooooooooooooooooo
				} else {
					
				}	
			}
		});
		button.setFont(new Font("Xilosa", Font.PLAIN, 15));
		button.setBounds(260, 145, 89, 23);
		frame.getContentPane().add(button);
		
		label = new JLabel("O que deseja traduzir:");
		label.setFont(new Font("Xilosa", Font.PLAIN, 14));
		label.setBounds(259, 101, 144, 14);
		frame.getContentPane().add(label);
		
		button_1 = new JButton("Palavras português/inglês");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				for (String item : tradutor.getPortugues()) {
					textArea.append(item + "\n"); 
				}
			}
		});
		button_1.setBounds(26, 11, 168, 23);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("Palavras inglês/português");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				for (String item : tradutor.getIngles()) {
					textArea.append(item + "\n"); 
				}
			}
		});
		button_2.setBounds(26, 42, 168, 23);
		frame.getContentPane().add(button_2);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaTradutor.class.getResource("/imagem/bandeiraBrasil.png")));
		label_1.setBounds(260, 11, 62, 40);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TelaTradutor.class.getResource("/imagem/bandeiraUSA.png")));
		label_2.setBounds(341, 11, 62, 40);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TelaTradutor.class.getResource("/imagem/bandeiraUSAbw.png")));
		label_3.setBounds(341, 11, 62, 40);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(TelaTradutor.class.getResource("/imagem/bandeiraBrasilbw.png")));
		label_4.setBounds(260, 11, 62, 40);
		frame.getContentPane().add(label_4);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionado = comboBox.getSelectedItem().toString();
				if (selecionado.contains("Portugu")) {
					label_1.setVisible(true);
					label_4.setVisible(false);
					label_2.setVisible(false);
					label_3.setVisible(true);
				} else {
					label_1.setVisible(false);
					label_4.setVisible(true);
					label_2.setVisible(true);
					label_3.setVisible(false);
				}
			}
		});
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(26, 76, 168, 268);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
	}
}
