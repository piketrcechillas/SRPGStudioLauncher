import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
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
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;


public class Launcher extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	private static String[] fps = {"60Hz", "30Hz"};
	private static String[] displayMode = {"Windowed", "Fullscreen"};
	private static String[] hardware = {"Hardware", "Software"};
	private static String[] fullscreen = {"Hardware", "Software"};
	private static String[] backgroundMusic = {"Yes", "No"};
	private static String[] gamepadInput = {"DirectInput", "XInput"};
	private static String[] keyboard = {"left", "up", "right", "down", "z", "x", "c", "shift", "a", "s", "x", "space", "f4", "f11", "esc"};
	private static String[] keyboard2 = {"", "", "", "", "enter", "ctrl", "", "", "", "", "ctrl", "rclick", "", "", ""};
	
	private static JComboBox<String> fpsCb;
	private static JComboBox<String> displayModeCb;
	private static JComboBox<String> hardwareCb;
	private static JComboBox<String> fullScreenCb;
	private static JComboBox<String> backgroundMusicCb;
	private static JComboBox<String> gamepadInputCb;
	
	public static String[] keys = {"LEFT", "UP", "RIGHT", "DOWN", "SELECT", "CANCEL", "OPTION", "OPTION2", "L_SWITCH", "R_SWITCH",
									"SYSTEM", "SKIP", "FULLSCREEN", "RESET", "EXIT"};
	
	
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Launcher() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException, URISyntaxException {
		setTitle("SRPG Studio's Game Launcher");
		System.out.println("Console!");
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
		UIManager.setLookAndFeel(lookAndFeel);
		setBounds(100, 100, 416, 400);
		
		String path = new File("").getAbsolutePath();
		
		JButton btnNewButton_1 = new JButton("Launch");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					writeToFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		
		
		
	
		fpsCb = new JComboBox(fps);
		
		displayModeCb = new JComboBox(displayMode);
		
		JLabel displayModeLb = new JLabel("Display Mode");
		
		JLabel fpsLb = new JLabel("FPS");
		
		hardwareCb = new JComboBox(hardware);
		
		JLabel hardwareLb = new JLabel("Hardware Acceleration");
		
		fullScreenCb = new JComboBox(fullscreen);
		
		JLabel fullScreenLb = new JLabel("Full Screen Renderer");
		
		backgroundMusicCb = new JComboBox(backgroundMusic);
		
		JLabel backgroundMusicLb = new JLabel("Background Music");
		
		gamepadInputCb = new JComboBox(gamepadInput);
		
		JLabel gameInputLb = new JLabel("Gamepad Input Mode");
		
		JButton btnNewButton = new JButton("Edit Keybindings");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Keybinding kb;
				try {
					kb = new Keybinding();
					kb.setVisible(true);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Save Settings");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					writeToFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		
		 
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(hardwareLb, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(fpsCb, Alignment.LEADING, 0, 115, Short.MAX_VALUE)
							.addComponent(fpsLb, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(hardwareCb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(backgroundMusicCb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(backgroundMusicLb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(gameInputLb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(gamepadInputCb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(fullScreenCb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(displayModeLb)
						.addComponent(displayModeCb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(fullScreenLb, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(125)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(130, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(fpsLb)
						.addComponent(displayModeLb))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(fpsCb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(displayModeCb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hardwareLb)
						.addComponent(fullScreenLb))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hardwareCb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fullScreenCb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(backgroundMusicLb)
						.addComponent(gameInputLb))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(backgroundMusicCb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gamepadInputCb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}
	
	public static String[] getKeyboardArray() {
		return keyboard;
	}
	
	public static String[] getKeyboard2Array() {
		return keyboard2;
	}
	
	public static void setKeyboardArray(String[] keyboard) {
		Launcher.keyboard = keyboard;
	}
	
	public static void setKeyboard2Array(String[] keyboard2) {
		Launcher.keyboard2 = keyboard2;
	}
	
	public void writeToFile() throws IOException {
		FileWriter game = new FileWriter("game.ini", false);
		game.write("[game]");
		game.write(System.lineSeparator());
		game.write("; Set 0 to run at 60 FPS. Set 1 to run at 30 FPS.");
		game.write(System.lineSeparator());
		if(fpsCb.getSelectedItem() == fps[0]) {
			game.write("HighPerf=0");
		}
		else {
			game.write("HighPerf=1");
		}
		game.write(System.lineSeparator());
		game.write("; Set 0 to display as a window or set 1 to display in fullscreen when loading the game.");
		game.write(System.lineSeparator());
		if(displayModeCb.getSelectedItem() == displayMode[0]) {
			game.write("WindowMode=0");
		}
		else {
			game.write("WindowMode=1");
		}
		game.write(System.lineSeparator());
		game.write("; Set 0 for Hardware rendering. Set 1 for Software rendering.");
		game.write(System.lineSeparator());
		if(hardwareCb.getSelectedItem() == hardware[0]) {
			game.write("HardwareAcceleration=0");
		}
		else {
			game.write("HardwareAcceleration=1");
		}
		game.write(System.lineSeparator());
		game.write("; Set 0 to process fullscreen with hardware. Set 1 to process it with software.");
		game.write(System.lineSeparator());
		if(fullScreenCb.getSelectedItem() == fullscreen[0]) {
			game.write("HardwareFullScreen=0");
		}
		else {
			game.write("HardwareFullScreen=1");
		}
		game.write(System.lineSeparator());
		game.write("; Set 0 to process the Gamepad with DirectInput. Set 1 to process it with Xinput.");
		game.write(System.lineSeparator());
		if(gamepadInputCb.getSelectedItem() == gamepadInput[0]) {
			game.write("GamePadDInput=0");
		}
		else {
			game.write("GamePadDInput=1");
		}
		game.write(System.lineSeparator());
		game.write("; Set 0 to play background music or set 1 to stop it when the window is inactive.");
		game.write(System.lineSeparator());
		if(backgroundMusicCb.getSelectedItem() == backgroundMusic[0]) {
			game.write("NonActiveMusicPlay=0");
		}
		else {
			game.write("NonActiveMusicPlay=1");
		}
		game.write(System.lineSeparator());
		game.write("; Set 0 to show error or set 1 to continue processing when resource is not found. ");
		game.write(System.lineSeparator());
		game.write("ResourceErrorNotify=0");
		game.write(System.lineSeparator());
		game.write("; Set 0 to terminate the game upon script error. Set 1 to automatically restart the game upon script error.");
		game.write(System.lineSeparator());
		game.write("ScriptErrorTerminate=0");
		game.write(System.lineSeparator());
		game.write("[keyboard]");
		game.write(System.lineSeparator());
		
		for(int i = 0; i < keys.length; i++) {
			if(keyboard2[i] == "") {
				game.write(keys[i] + "=" + keyboard[i]);
			}
			else {
				game.write(keys[i] + "=" + keyboard[i] + "," + keyboard2[i]);
			}
			game.write(System.lineSeparator());
		}
		
		game.write("[gamepad]");
		game.write(System.lineSeparator());
		for(int i = 0; i < keys.length; i++) {
			game.write(keys[i] + "=" + i);
			game.write(System.lineSeparator());
		}
		
		game.close();
	}
}
