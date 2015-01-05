import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

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
	protected static final int WIDTH = 1200;
	protected static final int HEIGHT = 800;
	private static final int WIDTH_TEXT = 4;
	protected static final int ROWS = 25;
	protected static final int COLS = 1;
	private JLabel windowTitle;
	private JLabel inputHourlyRateLabel;
	private JTextField inputHourlyRate;
	private JLabel usePremOpCheckLabel;
	private JCheckBox usePremOpCheck;
	private ArrayList<JTextField> hoursYesOTList;
	private ArrayList<JTextField> hoursNoOTList;
	private ArrayList<JCheckBox> usePremAftnList;
	private ArrayList<JCheckBox> usePremOvrnList;
	private ArrayList<JCheckBox> usePremSunList;
	private ArrayList<JCheckBox> usePremLeadTList;
	private ArrayList<JCheckBox> useHolidayList;

	public UserInterface() {
		super("Pay Calculator");

		JLabel blankLabel = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</html>");
		// TODO use for loop to instantiate 15 objects of each of the above

		// TODO create individual objects for rateHourly, usePremOp, and all
		// summary info

		// TODO create "calculate" and "reset" buttons

		// TODO create title, parameter, subtotals and total lines
		windowTitle = new JLabel(getTitle());
		inputHourlyRateLabel = new JLabel(" Hourly Rate ");
		inputHourlyRate = new JTextField(GenParam.getRateHourly().toString(),
				WIDTH_TEXT);
		inputHourlyRate.addActionListener(setHourlyRate);
		usePremOpCheckLabel = new JLabel("Use Operator Premium? ");
		usePremOpCheck = new JCheckBox("Use Operator Premium? ", true);

		// TODO create 25 JPanel innerPanels
		ArrayList<JPanel> innerPanelList = new ArrayList<JPanel>();
		for (int i = 0; i < ROWS; i++) {
			innerPanelList.add(buildInnerPanel(i));
		}
		// TODO add all elements to JPanel innerPanels
		for (int i = 0; i < ROWS; i++) {
			switch (i) {
			case 0:
				innerPanelList.get(i).add(windowTitle);
				break;
			case 1:
				innerPanelList.get(i).add(inputHourlyRate);
				innerPanelList.get(i).add(inputHourlyRateLabel);
				innerPanelList.get(i).add(blankLabel);
				innerPanelList.get(i).add(usePremOpCheck);
				break;
			default:
				break;
			}
		}

		// TODO add all innerPanels to main JPanel
		for (int i = 0; i < 2; i++) {
			add(innerPanelList.get(i));
		}

	}

	private final ActionListener setHourlyRate = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO set the hourly rate
			BigDecimal rate = new BigDecimal(inputHourlyRate.getText());
			GenParam.setRateHourly(rate);
			System.out.println(GenParam.getRateHourly());
		}
	};

	private final ActionListener clearListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO clear all calcValue fields to 0 every time an input is
			// changed

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
	/*
	 * @Override public void actionPerformed(ActionEvent e) { // TODO
	 * Auto-generated method stub if (e.getSource()==inputHourlyRate) { // TODO
	 * } }
	 */
}
