import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class CustomKeyListener implements KeyListener {
	
	JTextField textField;
	
	public CustomKeyListener(JTextField field) {
		this.textField = field;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() != 127) {
			textField.setText(KeyEvent.getKeyText(e.getKeyCode()).toLowerCase());
		}
		else {
			textField.setText("");
		}
	}



}
