import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class lucky_numbers implements ActionListener {
public static void main(String[] args) {
	
	lucky_numbers l= new lucky_numbers();
	l.stuff();
	
	
	
	
}

private void stuff() {
	JFrame lottery =new JFrame();
	JPanel numbers =new JPanel();
	JButton lucky =new JButton();
	lottery.add(numbers);
	numbers.add(lucky);
lottery.setVisible(true);
lucky.setText("Click To Get Your Lucky Number!!!!");
	lottery.pack();
	lucky.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int sand= new Random().nextInt(49);
	JOptionPane.showMessageDialog(null, "Your lucky number is "+ sand);
	
}
}
