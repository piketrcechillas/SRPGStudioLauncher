import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Keybinding extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField leftField1;
	private JTextField leftField2;
	private JTextField rightField1;
	private JTextField rightField2;
	private JTextField upField1;
	private JTextField upField2;
	private JTextField downField1;
	private JTextField downField2;
	private JTextField select1;
	private JTextField select2;
	private JTextField cancelField1;
	private JTextField cancelField2;
	private JTextField optionField1;
	private JTextField optionField2;
	private JTextField l_switchField1;
	private JTextField l_switchField2;
	private JLabel r_switch;
	private JTextField r_switchField1;
	private JTextField r_switchField2;
	private JLabel system;
	private JTextField systemField1;
	private JTextField systemField2;
	private JLabel skip;
	private JTextField skipField1;
	private JTextField skipField2;
	private JLabel fullScren;
	private JTextField fullScreenField1;
	private JTextField fullScreenField2;
	private JLabel reset;
	private JTextField resetField1;
	private JTextField resetField2;
	private JLabel exit;
	private JTextField exitField1;
	private JTextField exitField2;
	private String[] keyboard;
	private String[] keyboard2;
	private JTextField option2Field1;
	private JTextField option2Field2;
	

	public Keybinding() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		setTitle("Keybindings");
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
		UIManager.setLookAndFeel(lookAndFeel);
		setBounds(100, 100, 300, 450);
		
		keyboard = Launcher.getKeyboardArray();
		keyboard2 = Launcher.getKeyboard2Array();
		
		JLabel leftLb = new JLabel("Left");
		
		leftField1 = new JTextField();
		leftField1.setEditable(false);
		leftField1.setColumns(10);
		leftField1.setText(keyboard[0]);
		
		leftField1.addKeyListener(new CustomKeyListener(leftField1));
		leftField1.addMouseListener(new CustomMouseListener(leftField1));
		
		leftField2 = new JTextField();
		leftField2.setEditable(false);
		leftField2.setColumns(10);
		leftField2.setText(keyboard2[0]);
		
		leftField2.addKeyListener(new CustomKeyListener(leftField2));
		leftField2.addMouseListener(new CustomMouseListener(leftField2));
		

		
		JLabel up = new JLabel("Up");
		
		upField1 = new JTextField();
		upField1.setEditable(false);
		upField1.setColumns(10);
		upField1.setText(keyboard[1]);
		
		upField1.addKeyListener(new CustomKeyListener(upField1));
		upField1.addMouseListener(new CustomMouseListener(upField1));
		
		upField2 = new JTextField();
		upField2.setEditable(false);
		upField2.setColumns(10);
		upField2.setText(keyboard2[1]);
		
		upField2.addKeyListener(new CustomKeyListener(upField2));
		upField2.addMouseListener(new CustomMouseListener(upField2));
		
		
		JLabel right = new JLabel("Right");
		
		rightField1 = new JTextField();
		rightField1.setEditable(false);
		rightField1.setColumns(10);
		rightField1.setText(keyboard[2]);
		
		rightField1.addKeyListener(new CustomKeyListener(rightField1));
		rightField1.addMouseListener(new CustomMouseListener(rightField1));
		
		rightField2 = new JTextField();
		rightField2.setEditable(false);
		rightField2.setColumns(10);
		rightField2.setText(keyboard2[2]);
		
		rightField2.addKeyListener(new CustomKeyListener(rightField2));
		rightField2.addMouseListener(new CustomMouseListener(rightField2));
		
		JLabel down = new JLabel("Down");
		
		downField1 = new JTextField();
		downField1.setEditable(false);
		downField1.setColumns(10);
		downField1.setText(keyboard[3]);
		
		downField1.addKeyListener(new CustomKeyListener(downField1));
		downField1.addMouseListener(new CustomMouseListener(downField1));
		
		downField2 = new JTextField();
		downField2.setEditable(false);
		downField2.setColumns(10);
		downField2.setText(keyboard2[3]);
		
		downField2.addKeyListener(new CustomKeyListener(downField2));
		downField2.addMouseListener(new CustomMouseListener(downField2));
		
		JLabel select = new JLabel("Select");
		
		select1 = new JTextField();
		select1.setEditable(false);
		select1.setColumns(10);
		select1.setText(keyboard[4]);
		
		select1.addKeyListener(new CustomKeyListener(select1));
		select1.addMouseListener(new CustomMouseListener(select1));
		
		select2 = new JTextField();
		select2.setEditable(false);
		select2.setColumns(10);
		select2.setText(keyboard2[4]);
		
		select2.addKeyListener(new CustomKeyListener(select2));
		select2.addMouseListener(new CustomMouseListener(select2));
		
		JLabel cancel = new JLabel("Cancel");
		
		cancelField1 = new JTextField();
		cancelField1.setEditable(false);
		cancelField1.setColumns(10);
		cancelField1.setText(keyboard[5]);
		
		cancelField1.addKeyListener(new CustomKeyListener(cancelField1));
		cancelField1.addMouseListener(new CustomMouseListener(cancelField1));
		
		cancelField2 = new JTextField();
		cancelField2.setEditable(false);
		cancelField2.setColumns(10);
		cancelField2.setText(keyboard2[5]);
		
		cancelField2.addKeyListener(new CustomKeyListener(cancelField2));
		cancelField2.addMouseListener(new CustomMouseListener(cancelField2));
		
		JLabel option = new JLabel("Option");
		
		optionField1 = new JTextField();
		optionField1.setEditable(false);
		optionField1.setColumns(10);
		optionField1.setText(keyboard[6]);
		
		optionField1.addKeyListener(new CustomKeyListener(optionField1));
		optionField1.addMouseListener(new CustomMouseListener(optionField1));
		
		optionField2 = new JTextField();
		optionField2.setEditable(false);
		optionField2.setColumns(10);
		optionField2.setText(keyboard2[6]);
		
		optionField2.addKeyListener(new CustomKeyListener(optionField2));
		optionField2.addMouseListener(new CustomMouseListener(optionField2));
		
		JLabel option_1 = new JLabel("Option 2");
		
		option2Field1 = new JTextField();
		option2Field1.setEditable(false);
		option2Field1.setColumns(10);
		option2Field1.setText(keyboard[7]);
		
		option2Field1.addKeyListener(new CustomKeyListener(option2Field1));
		option2Field1.addMouseListener(new CustomMouseListener(option2Field1));
		
		option2Field2 = new JTextField();
		option2Field2.setEditable(false);
		option2Field2.setColumns(10);
		option2Field2.setText(keyboard2[7]);
		
		option2Field2.addKeyListener(new CustomKeyListener(option2Field2));
		option2Field2.addMouseListener(new CustomMouseListener(option2Field2));
		
		JLabel l_switch = new JLabel("L Switch");
		
		l_switchField1 = new JTextField();
		l_switchField1.setEditable(false);
		l_switchField1.setColumns(10);
		l_switchField1.setText(keyboard[8]);
		
		l_switchField1.addKeyListener(new CustomKeyListener(l_switchField1));
		l_switchField1.addMouseListener(new CustomMouseListener(l_switchField1));
		
		l_switchField2 = new JTextField();
		l_switchField2.setEditable(false);
		l_switchField2.setColumns(10);
		l_switchField2.setText(keyboard2[8]);
		
		l_switchField2.addKeyListener(new CustomKeyListener(l_switchField2));
		l_switchField2.addMouseListener(new CustomMouseListener(l_switchField2));
		
		r_switch = new JLabel("R Switch");
		
		r_switchField1 = new JTextField();
		r_switchField1.setEditable(false);
		r_switchField1.setColumns(10);
		r_switchField1.setText(keyboard[9]);
		
		r_switchField1.addKeyListener(new CustomKeyListener(r_switchField1));
		r_switchField1.addMouseListener(new CustomMouseListener(r_switchField1));
		
		r_switchField2 = new JTextField();
		r_switchField2.setEditable(false);
		r_switchField2.setColumns(10);
		r_switchField2.setText(keyboard2[9]);
		
		r_switchField2.addKeyListener(new CustomKeyListener(r_switchField2));
		r_switchField2.addMouseListener(new CustomMouseListener(r_switchField2));
		
		system = new JLabel("System");
		
		systemField1 = new JTextField();
		systemField1.setEditable(false);
		systemField1.setColumns(10);
		systemField1.setText(keyboard[10]);
		
		systemField1.addKeyListener(new CustomKeyListener(systemField1));
		systemField1.addMouseListener(new CustomMouseListener(systemField1));
		
		systemField2 = new JTextField();
		systemField2.setEditable(false);
		systemField2.setColumns(10);
		systemField2.setText(keyboard2[10]);
		
		systemField2.addKeyListener(new CustomKeyListener(systemField2));
		systemField2.addMouseListener(new CustomMouseListener(systemField2));
		
		skip = new JLabel("Skip");
		
		skipField1 = new JTextField();
		skipField1.setEditable(false);
		skipField1.setColumns(10);
		skipField1.setText(keyboard[11]);
		
		skipField1.addKeyListener(new CustomKeyListener(skipField1));
		skipField1.addMouseListener(new CustomMouseListener(skipField1));
		
		skipField2 = new JTextField();
		skipField2.setEditable(false);
		skipField2.setColumns(10);
		skipField2.setText(keyboard2[11]);
		
		skipField2.addKeyListener(new CustomKeyListener(skipField2));
		skipField2.addMouseListener(new CustomMouseListener(skipField2));
		
		fullScren = new JLabel("Full Screen");
		
		fullScreenField1 = new JTextField();
		fullScreenField1.setEditable(false);
		fullScreenField1.setColumns(10);
		fullScreenField1.setText(keyboard[12]);
		
		fullScreenField1.addKeyListener(new CustomKeyListener(fullScreenField1));
		fullScreenField1.addMouseListener(new CustomMouseListener(fullScreenField1));
		
		fullScreenField2 = new JTextField();
		fullScreenField2.setEditable(false);
		fullScreenField2.setColumns(10);
		fullScreenField2.setText(keyboard2[12]);
		
		fullScreenField2.addKeyListener(new CustomKeyListener(fullScreenField2));
		fullScreenField2.addMouseListener(new CustomMouseListener(fullScreenField2));
		
		reset = new JLabel("Reset");
		
		resetField1 = new JTextField();
		resetField1.setEditable(false);
		resetField1.setColumns(10);
		resetField1.setText(keyboard[13]);
		
		resetField1.addKeyListener(new CustomKeyListener(resetField1));
		resetField1.addMouseListener(new CustomMouseListener(resetField1));
		
		resetField2 = new JTextField();
		resetField2.setEditable(false);
		resetField2.setColumns(10);
		resetField2.setText(keyboard2[13]);
		
		resetField2.addKeyListener(new CustomKeyListener(resetField2));
		resetField2.addMouseListener(new CustomMouseListener(resetField2));
		
		exit = new JLabel("Exit");
		
		exitField1 = new JTextField();
		exitField1.setEditable(false);
		exitField1.setColumns(10);
		exitField1.setText(keyboard[14]);
		
		exitField1.addKeyListener(new CustomKeyListener(exitField1));
		exitField1.addMouseListener(new CustomMouseListener(exitField1));
		
		exitField2 = new JTextField();
		exitField2.setEditable(false);
		exitField2.setColumns(10);
		exitField2.setText(keyboard2[14]);
		
		exitField2.addKeyListener(new CustomKeyListener(exitField2));
		exitField2.addMouseListener(new CustomMouseListener(exitField2));
		
		JButton save = new JButton("Save");
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveKeyboard();
				Launcher.setKeyboardArray(keyboard);
				Launcher.setKeyboard2Array(keyboard2);
				JOptionPane.showMessageDialog(null, "Parameters saved successfully. You need to Save Settings or Launch to save keybindings.", "Message", JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
		});
		
		
		JButton btnClose = new JButton("Close");
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Primary");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSecondary = new JLabel("Secondary");
		lblSecondary.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(down, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(downField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(downField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(select, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(select1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(select2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(cancel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(cancelField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(cancelField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(option, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(optionField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(optionField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(leftLb)
									.addGap(84)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(leftField1, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblSecondary, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(leftField2, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addComponent(save, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(up, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(upField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(upField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(right, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rightField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rightField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(option_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(option2Field1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(option2Field2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(l_switch, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(l_switchField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(l_switchField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(r_switch, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(r_switchField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(r_switchField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(system, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(systemField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(systemField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(skip, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(skipField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(skipField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(fullScren, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(fullScreenField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(fullScreenField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(reset, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(resetField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(resetField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(exit, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(exitField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(exitField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSecondary)
						.addComponent(lblNewLabel))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(leftLb)
						.addComponent(leftField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(leftField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(up))
						.addComponent(upField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(upField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rightField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(rightField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(right)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(down))
						.addComponent(downField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(downField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(select))
						.addComponent(select1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(select2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(cancel))
						.addComponent(cancelField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(cancelField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(option))
						.addComponent(optionField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(optionField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(option_1))
						.addComponent(option2Field1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(option2Field2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(l_switch))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(l_switchField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
							.addComponent(l_switchField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(r_switch))
						.addComponent(r_switchField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(r_switchField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(system))
						.addComponent(systemField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(systemField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(skip))
						.addComponent(skipField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(skipField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(fullScren))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(fullScreenField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
							.addComponent(fullScreenField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(reset))
						.addComponent(resetField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(resetField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(exit))
						.addComponent(exitField1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(exitField2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(save)
						.addComponent(btnClose))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	
	}
	
	private void saveKeyboard() {
		keyboard[0] = leftField1.getText();
		keyboard[1] = upField1.getText();
		keyboard[2] = rightField1.getText();
		keyboard[3] = downField1.getText();
		keyboard[4] = select1.getText();
		keyboard[5] = cancelField1.getText();
		keyboard[6] = optionField1.getText();
		keyboard[7] = option2Field1.getText();
		keyboard[8] = l_switchField1.getText();
		keyboard[9] = r_switchField1.getText();
		keyboard[10] = systemField1.getText();
		keyboard[11] = skipField1.getText();
		keyboard[12] = fullScreenField1.getText();
		keyboard[13] = resetField1.getText();
		keyboard[14] = exitField1.getText();
		
		keyboard2[0] = leftField2.getText();
		keyboard2[1] = upField2.getText();
		keyboard2[2] = rightField2.getText();
		keyboard2[3] = downField2.getText();
		keyboard2[4] = select2.getText();
		keyboard2[5] = cancelField2.getText();
		keyboard2[6] = optionField2.getText();
		keyboard2[7] = option2Field2.getText();
		keyboard2[8] = l_switchField2.getText();
		keyboard2[9] = r_switchField2.getText();
		keyboard2[10] = systemField2.getText();
		keyboard2[11] = skipField2.getText();
		keyboard2[12] = fullScreenField2.getText();
		keyboard2[13] = resetField2.getText();
		keyboard2[14] = exitField2.getText();
		
	}
}
