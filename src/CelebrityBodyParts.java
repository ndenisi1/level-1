
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CelebrityBodyParts {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/level-1/src/foster.jpg";
	String secondImage = "/Users/league/Desktop/level-1/src/marisol.jpg";
	String thirdImage = "/Users/league/Desktop/level-1/src/wassabi.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(500,500);
		// Make an int variable to hold the score.
int managescore= 0;
		// Ask the user who this person is and store their answer
String foster= JOptionPane.showInputDialog("Who is this?????");
		// If they got the answer right:
if (foster.equalsIgnoreCase("Meredith Foster")) {
	JOptionPane.showMessageDialog(null, "YOUR RIGHT!!!!");
	managescore++;
}
		// -- Tell them they are correct.
		// -- Increase the score by 1
else {
	JOptionPane.showMessageDialog(null, "your wrong......:(");
}
		// Otherwise:
		// -- Tell them they are wrong
showNextImage();
String marisol= JOptionPane.showInputDialog("Who is this?????");
if (marisol.equalsIgnoreCase("Eva Marisol")) {
	JOptionPane.showMessageDialog(null, "YOUR RIGHT!!!!!!");
	managescore++;
}
else {
	JOptionPane.showMessageDialog(null, "your wrong.....:(");
}
showNextImage();
String wassabi= JOptionPane.showInputDialog("Who is this??????");
if (wassabi.equalsIgnoreCase("LaurDiy")) {
	JOptionPane.showMessageDialog(null, "YOUR RIGHT!!!!!");
	managescore++;
}
JOptionPane.showMessageDialog(null, managescore);
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		CelebrityBodyParts quiz = new CelebrityBodyParts();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

