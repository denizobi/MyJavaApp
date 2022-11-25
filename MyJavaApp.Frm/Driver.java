import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver {
	
	public static void main(String[] args) {
		JFrame frame = new	JFrame();
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpanel = new JPanel();
		JTextField jTextField = new JTextField(20);
		jpanel.add(jTextField);
		JButton jbutton = new JButton();
		jbutton.setText("Print Text");
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jTextField.getText());
			}
		});
		jpanel.add(jbutton);
		frame.add(jpanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}