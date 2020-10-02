import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class CustomMouseListener implements MouseListener {
	
	JTextField textField;
	
	public CustomMouseListener(JTextField field) {
		this.textField = field;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == MouseEvent.BUTTON1){
			System.out.println("CHECK");
			textField.setText("lclick");
        } else if (e.getButton() == MouseEvent.BUTTON2){
        	textField.setText("mclick");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
        	textField.setText("rclick");
        } 
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
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
