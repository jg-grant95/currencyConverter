package currencyConverter;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class currencyConverterGUI extends JFrame implements ActionListener{
	public static JFrame conv_window = new JFrame("Currency Converter");
	
	private static JButton  add_100 = new JButton("100");
	private static JButton add_50  = new JButton("50");
	private static JButton add_20  = new JButton("20");
	private static JButton add_10  = new JButton("10");
	private static JButton add_5   = new JButton("5");
	private static JButton add_1   = new JButton("1");
	
	private static JTextField for_100 = new JTextField("");
	private static JTextField for_50 = new JTextField("");
	private static JTextField for_20 = new JTextField("");
	private static JTextField for_10 = new JTextField("");
	private static JTextField for_5 = new JTextField("");
	private static JTextField for_1 = new JTextField("");
	
	public void addButtons(JButton button){
		this.add(button);
	}
	
	public void addPanels(JPanel panel){
		this.add(panel);
	}
	
	private static void currencyConverterGUI(){
		/* for the button panel */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
		conv_window.setSize(700, 500);
		conv_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		buttonPanel.add(add_100);
		buttonPanel.add(add_50);
		buttonPanel.add(add_20);
		buttonPanel.add(add_10);
		buttonPanel.add(add_5);
		buttonPanel.add(add_1);
		conv_window.add(buttonPanel);
		conv_window.setVisible(true);
		
		/* for the text panels */
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
		
		textPanel.add(for_100);
		textPanel.add(for_50);
		textPanel.add(for_20);
		textPanel.add(for_10);
		textPanel.add(for_5);
		textPanel.add(for_1);
		
		conv_window.add(textPanel);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currencyConverterGUI();
	}

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
