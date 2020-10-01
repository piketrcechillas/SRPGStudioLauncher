import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;


public class Launcher extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public Launcher() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException, URISyntaxException {
		setTitle("Elemental War Launcher");
		System.out.println("Console!");
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
		UIManager.setLookAndFeel(lookAndFeel);
		setBounds(100, 100, 416, 227);
		
		String path = new File("").getAbsolutePath();
		
		JButton btnNewButton_1 = new JButton("Launch.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String path = ".";
					path = new File("").getAbsolutePath();
				  File file = new File(path + "\\game.exe");
				  ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
				  processBuilder.directory(file.getParentFile());

				  try {
				        processBuilder.start();
				   } catch(IOException ex) {
				        ex.printStackTrace();
				        JFrame frame = new JFrame();
				        JOptionPane.showMessageDialog(frame, "Something is wrong");
				   }
				  
				  dispose();
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setText("Path to game. Censored");
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(119)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);


		
	

	
	

	}
}
