import javax.swing.JButton;
import javax.swing.JFrame;

public class Client {

	static int width = 900;
	static int height = 800;
	static JFrame window = new JFrame("FRC PowerUp Simulation");

	public static void main(String args[]) {

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(width, height);}
}
