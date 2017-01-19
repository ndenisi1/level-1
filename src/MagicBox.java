
	import java.awt.Dimension;
	import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	import javax.swing.SwingUtilities;

	public class MagicBox extends JPanel implements Runnable, MouseListener {

		/*
		 * Work together as a TEAM of 2 or 3 to make this project. We are going to hide secrets within the magic box. 
		 * When the user clicks on a secret place, stuff will happen.
		 * 
		 * 1. Make the frame respond to mouse clicks.
		 * 
		 * 2. When the mouse is clicked, use the Media Palace (bit.ly/media-palace) to play sounds, show images or speak.
		 * 
		 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
		 */
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		BufferedImage backgroundImage;

		public static void main(String[] args) throws Exception {
			SwingUtilities.invokeLater(new MagicBox());
		}

		@Override
		public void run() {
			try {
				loadBackgroundImage();
				createUI();
			} catch (Exception w) {
				System.err.println(w.getMessage());
			}
		}

		private void createUI() {
			
			frame.add(this);
			setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		frame.addMouseListener(this);
		}

		private void loadBackgroundImage() throws Exception {
			String imageFile = "/Users/league/Google Drive/league-images/magic-box.jpg";
			try {
				backgroundImage = ImageIO.read(new File(imageFile));
			} catch (IOException e) {
				throw new Exception("Could not load image: " + imageFile);
			}
		}

		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, null);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		int c =	backgroundImage.getRGB(e.getX(), e.getY());
		System.out.println(c);
		JFrame f = new JFrame();
			f.setVisible(true);
			if(c == -3884407){
			MediaPalace MP = new MediaPalace();
			
				try {
					JLabel pedro = MP.loadImageFromTheInternet("http://kids.nationalgeographic.com/content/dam/kids/photos/animals/Reptiles/A-G/green-sea-turtle-closeup-underwater.jpg.adapt.945.1.jpg");
					f.add(pedro); 
					f.pack();
				
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}



