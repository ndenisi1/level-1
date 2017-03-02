import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame a= new JFrame();
JPanel b= new JPanel();
JTextField c= new JTextField();
JTextField d= new JTextField();
JButton k=new JButton();
JLabel f=new JLabel();
public static void main(String[] args) {
	Calculator g= new Calculator();
	g.setup();
}
void setup(){
	a.add(b);
	b.add(c); 
	b.add(d);
	b.add(k);
	b.add(f);
	a.setVisible(true);
	c.setColumns(5);
	d.setColumns(5);
    k.addActionListener(this);
   a.pack();
}
int add(int n,int m){
return	n+m;
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	String hi= d.getText();
int kid= Integer.parseInt(hi);
String blah=c.getText();
int me= Integer.parseInt(blah);
	// TODO Auto-generated method stub
	if (e.getSource()==k) {
	int cool= add(kid,me );
	f.setText(cool+"");
	}
}
}
