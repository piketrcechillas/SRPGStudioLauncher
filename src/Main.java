import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.setVisible(true);
					window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
