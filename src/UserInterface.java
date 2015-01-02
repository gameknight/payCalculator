import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.*;

/**
 * 
 */

/**
 * @author gfystro
 *
 */
public class UserInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String ID_PROPERTY = "ID NUMBER";
	private static final String TYPE_PROPERTY = "TYPE_OF_COMPONENT";
	private static final BigDecimal ZERO = new BigDecimal("0.00");
	
	
	public UserInterface() {
		super("Pay Calculator");
		// TODO create ArrayList for hoursYesOT JTextField
		// TODO create ArrayList for hoursNoOT JTextField
		// TODO create ArrayList for usePremAftn JCheckBox
		// TODO create ArrayList for usePremOvrn JCheckBox
		// TODO create ArrayList for usePremSun JCheckBox
		// TODO create ArrayList for usePremLeadT JCheckBox
		// TODO create ArrayList for useHoliday JCheckBox
		
		// TODO use for loop to instantiate 15 objects of each of the above
		
		// TODO create individual objects for rateHourly, usePremOp, and all summary info
		
		// TODO create "calculate" and "reset" buttons
	}
	
	private final ActionListener clearListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO clear all calcValue fields to 0 every time an input is changed
			
		}
	};
	
	private JPanel buildInnerPanel(int num) {
		// TODO create JPanel objects, 1 for each row
		JPanel innerPanel = new JPanel();
		return innerPanel;
	}
	
	private JTextField buildInputHours(int num, String desc) {
		// TODO text field for inputting hoursYesOT and hoursNoOT
		JTextField textfield = new JTextField(Integer.toString(num));
        textfield.putClientProperty(ID_PROPERTY, Integer.valueOf(num));
        textfield.putClientProperty(TYPE_PROPERTY, desc);
        textfield.addActionListener(clearListener);
        return textfield;
	}
	
	private JCheckBox buildCheckbox(int num, String desc) {
		// TODO every boolean option will require a check box
		JCheckBox checkbox = new JCheckBox(Integer.toString(num));
        checkbox.putClientProperty(ID_PROPERTY, Integer.valueOf(num));
        checkbox.putClientProperty(TYPE_PROPERTY, desc);
        checkbox.addActionListener(clearListener);
        return checkbox;
	}
	
	private JLabel buildOutputLabel(int num, String desc) {
		// TODO these labels will be for all daily calcValues
		JLabel label = new JLabel(Integer.toString(num));
        label.putClientProperty(ID_PROPERTY, Integer.valueOf(num));
        label.putClientProperty(TYPE_PROPERTY, desc);
        return label;
	}
}
