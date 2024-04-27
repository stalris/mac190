import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	//int width = 500;
	//int length = 500;

		MyFrame(){

		panel p;
		p = new panel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public class panel extends JPanel{
		panel(){
			this.setPreferredSize(new Dimension(500,500));
		}

		// public void paint(Graphics g){
		// 	Graphics2D graphics = (Graphics2D) g;

		// 	// Coordinates for the triangle.
		// 	int []xPoints = {150, 250, 350};
		// 	int []yPoints = {300, 150, 300};

		// 	graphics.setPaint(Color.green);
		// 	graphics.fillPolygon(xPoints, yPoints, 3);
		// }
	}


	public static void main(String[] args){
		new MyFrame();
	}
}
