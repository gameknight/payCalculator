import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

	private static final String HOURSNOOT_LABEL = "Sick Hours";
	private static final String HOURSYESOT_LABEL = "Reg. Hours";
	private static final String USEPREMAFTN_LABEL = "Aftn";
	private static final String USEPREMOVRN_LABEL = "Ovrn";
	private static final String USEPREMSUN_LABEL = "Sun";
	private static final String USEPREMLEADT_LABEL = "LeadT";
	private static final String USEHOLIDAY_LABEL = "Holiday";
	private static final String PAYYESOTSTR_LABEL = "Str. Pay";
	private static final String PAYYESOTOT_LABEL = "OT Pay";
	private static final String PAYNOOT_LABEL = "Sick Pay";
	private static final String PAYPREMOP_LABEL = "Oper Pr.";
	private static final String PAYPREMAFTN_LABEL = "Aftn Pr.";
	private static final String PAYPREMOVRN_LABEL = "Ovrn Pr.";
	private static final String PAYPREMSUN_LABEL = "Sun Pr.";
	private static final String PAYPREMLEADT_LABEL = "LdT Pr.";
	private static final String PAYHOLIDAY_LABEL = "Holiday";
	private static final long serialVersionUID = 1L;
	private static final String ID_PROPERTY = "ID NUMBER";
	private static final String TYPE_PROPERTY = "TYPE_OF_COMPONENT";
	private static final BigDecimal ZERO = new BigDecimal("0.00");
	private static final int OFFSET1 = 1;
	private static final int OFFSET2 = 3;
	protected static final int WIDTH = 1000;
	protected static final int HEIGHT = 600;
	private static final int WIDTH_TEXT = 3;
	private static final int WIDTH_TEXT_WIDE = 4;
	private static final int WIDTH_TEXT_WIDER = 5;
	protected static final int ROWS = 21;
	protected static final int COLS = 16;
	private static final int SPACER1 = 50;
	private static final int SPACER2 = 500;
	private static final int PREC0 = 0;
	private static final int PREC1 = 1;
	private static final int PREC2 = 2;
	private static final int PREC3 = 3;
	private JLabel windowTitle;
	private JLabel inputHourlyRateLabel;
	private JTextField inputHourlyRate;
	private JCheckBox usePremOpCheck;
	private ArrayList<JTextField> hoursYesOTList = new ArrayList<JTextField>();
	private ArrayList<JTextField> hoursNoOTList = new ArrayList<JTextField>();
	private ArrayList<JCheckBox> usePremAftnList = new ArrayList<JCheckBox>();
	private ArrayList<JCheckBox> usePremOvrnList = new ArrayList<JCheckBox>();
	private ArrayList<JCheckBox> usePremSunList = new ArrayList<JCheckBox>();
	private ArrayList<JCheckBox> usePremLeadTList = new ArrayList<JCheckBox>();
	private ArrayList<JCheckBox> useHolidayList = new ArrayList<JCheckBox>();
	private ArrayList<JTextField> payYesOTStrList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payYesOTOTList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payNoOTList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payPremOpList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payPremAftnList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payPremOvrnList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payPremSunList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payPremLeadTList = new ArrayList<JTextField>();
	private ArrayList<JTextField> payHolidayList = new ArrayList<JTextField>();

	public UserInterface() {
		super("Pay Calculator");

		// JLabel blankLabel = new JLabel(
		// "<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</html>");
		JLabel hoursYesOTLabel = new JLabel(HOURSYESOT_LABEL);
		JLabel hoursNoOTLabel = new JLabel(HOURSNOOT_LABEL);
		JLabel usePremAftnLabel = new JLabel(USEPREMAFTN_LABEL);
		JLabel usePremOvrnLabel = new JLabel(USEPREMOVRN_LABEL);
		JLabel usePremSunLabel = new JLabel(USEPREMSUN_LABEL);
		JLabel usePremLeadTLabel = new JLabel(USEPREMLEADT_LABEL);
		JLabel useHolidayLabel = new JLabel(USEHOLIDAY_LABEL);
		JLabel payYesOTStrLabel = new JLabel(PAYYESOTSTR_LABEL);
		JLabel payYesOTOTLabel = new JLabel(PAYYESOTOT_LABEL);
		JLabel payNoOTLabel = new JLabel(PAYNOOT_LABEL);
		JLabel payPremOpLabel = new JLabel(PAYPREMOP_LABEL);
		JLabel payPremAftnLabel = new JLabel(PAYPREMAFTN_LABEL);
		JLabel payPremOvrnLabel = new JLabel(PAYPREMOVRN_LABEL);
		JLabel payPremSunLabel = new JLabel(PAYPREMSUN_LABEL);
		JLabel payPremLeadTLabel = new JLabel(PAYPREMLEADT_LABEL);
		JLabel payHolidayLabel = new JLabel(PAYHOLIDAY_LABEL);
		// TODO use for loop to instantiate 15 objects of each of the above
		for (int i = 0; i <= 14; i++) {
			JTextField hoursYesOT = new JTextField(Main.punchList.get(i)
					.getHoursYesOT().toString(), WIDTH_TEXT);
			hoursYesOT.setFocusTraversalKeysEnabled(false);
			hoursYesOT.addActionListener(calculateAll);
			hoursYesOTList.add(hoursYesOT);
			JTextField hoursNoOT = new JTextField(Main.punchList.get(i)
					.getHoursNoOT().toString(), WIDTH_TEXT);
			hoursNoOT.setFocusTraversalKeysEnabled(false);
			hoursNoOT.addActionListener(calculateAll);
			hoursNoOTList.add(hoursNoOT);
			JCheckBox usePremAftn = new JCheckBox("Aft", Main.punchList.get(i)
					.getUsePremAftn());
			usePremAftn.addActionListener(calculateAll);
			usePremAftnList.add(usePremAftn);
			JCheckBox usePremOvrn = new JCheckBox("Ovr", Main.punchList.get(i)
					.getUsePremOvrn());
			usePremOvrn.addActionListener(calculateAll);
			usePremOvrnList.add(usePremOvrn);
			JCheckBox usePremSun = new JCheckBox("Sun", Main.punchList.get(i)
					.getUsePremSun());
			usePremSun.addActionListener(calculateAll);
			usePremSunList.add(usePremSun);
			JCheckBox usePremLeadT = new JCheckBox("LdT", Main.punchList.get(i)
					.getUsePremLeadT());
			usePremLeadT.addActionListener(calculateAll);
			usePremLeadTList.add(usePremLeadT);
			JCheckBox useHoliday = new JCheckBox("Hol", Main.punchList.get(i)
					.getUseHoliday());
			useHoliday.addActionListener(calculateAll);
			useHolidayList.add(useHoliday);
			JTextField payYesOTStr = new JTextField(Main.calcValueList.get(i)
					.getPayBaseYesOTStr()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDER);
			payYesOTStr.setEditable(false);
			payYesOTStrList.add(payYesOTStr);
			JTextField payYesOTOT = new JTextField(Main.calcValueList.get(i)
					.getPayBaseYesOTOT()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDER);
			payYesOTOT.setEditable(false);
			payYesOTOTList.add(payYesOTOT);
			JTextField payNoOT = new JTextField(Main.calcValueList.get(i)
					.getPayBaseNoOT()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDER);
			payNoOT.setEditable(false);
			payNoOTList.add(payNoOT);
			JTextField payPremOp = new JTextField(Main.calcValueList.get(i)
					.getPayPremOp()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDE);
			payPremOp.setEditable(false);
			payPremOpList.add(payPremOp);
			JTextField payPremAftn = new JTextField(Main.calcValueList.get(i)
					.getPayPremAftn()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDE);
			payPremAftn.setEditable(false);
			payPremAftnList.add(payPremAftn);
			JTextField payPremOvrn = new JTextField(Main.calcValueList.get(i)
					.getPayPremOvrn()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDE);
			payPremOvrn.setEditable(false);
			payPremOvrnList.add(payPremOvrn);
			JTextField payPremSun = new JTextField(Main.calcValueList.get(i)
					.getPayPremSun()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDE);
			payPremSun.setEditable(false);
			payPremSunList.add(payPremSun);
			JTextField payPremLeadT = new JTextField(Main.calcValueList.get(i)
					.getPayPremLeadT()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDE);
			payPremLeadT.setEditable(false);
			payPremLeadTList.add(payPremLeadT);
			JTextField payHoliday = new JTextField(Main.calcValueList.get(i)
					.getPayHoliday()
					.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
					WIDTH_TEXT_WIDE);
			payHoliday.setEditable(false);
			payHolidayList.add(payHoliday);
			// repeat for all other calc lists - still need to define J element
			// arraylists in class
		}

		// TODO create individual objects for summary info

		// TODO create "calculate" and "reset" buttons

		// TODO create title and add
		windowTitle = new JLabel(getTitle());
		add(windowTitle);

		// TODO create gridbaglayout panel
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new GridBagLayout());
		innerPanel.setSize(ROWS, COLS);
		GridBagConstraints cst = new GridBagConstraints();

		// TODO add all elements to JPanel innerPanels
		for (int y = 0; y < ROWS; y++) {
			cst.gridx = GridBagConstraints.RELATIVE;
			cst.gridy = y;
			cst.gridwidth = 1;
			cst.anchor = GridBagConstraints.CENTER;
			cst.ipadx = 0;
			cst.ipady = 0;
			cst.insets = new Insets(3, 5, 3, 5);
			switch (y) {
			case 0:
				cst.insets = new Insets(10, 0, 10, 0);
				;
				inputHourlyRateLabel = new JLabel(" Hourly Rate ");
				inputHourlyRate = new JTextField(GenParam.getRateHourly()
						.toString(), WIDTH_TEXT);
				inputHourlyRate.addActionListener(setHourlyRate);
				usePremOpCheck = new JCheckBox("Use Operator Premium? ",
						GenParam.getUsePremOp());
				usePremOpCheck.addActionListener(setUsePremOp);
				innerPanel.add(inputHourlyRate, cst);
				cst.gridwidth = 2;
				cst.anchor = GridBagConstraints.LINE_START;
				innerPanel.add(inputHourlyRateLabel, cst);
				cst.gridwidth = 5;
				innerPanel.add(usePremOpCheck, cst);
				break;
			case 1:
				innerPanel.add(hoursYesOTLabel, cst);
				innerPanel.add(hoursNoOTLabel, cst);
				innerPanel.add(usePremAftnLabel, cst); // afternoon checkbox
				innerPanel.add(usePremOvrnLabel, cst); // overnight checkbox
				innerPanel.add(usePremSunLabel, cst); // sunday checkbox
				innerPanel.add(usePremLeadTLabel, cst); // lead tech checkbox
				innerPanel.add(useHolidayLabel, cst); // holiday checkbox
				innerPanel.add(payYesOTStrLabel, cst); // straight pay
				innerPanel.add(payYesOTOTLabel, cst); // OT pay
				innerPanel.add(payNoOTLabel, cst); // sick pay
				innerPanel.add(payPremOpLabel, cst); // Operator Premium pay
				innerPanel.add(payPremAftnLabel, cst); // Afternoon Premium pay
				innerPanel.add(payPremOvrnLabel, cst); // Overnight Premium pay
				innerPanel.add(payPremSunLabel, cst); // Sunday Premium pay
				innerPanel.add(payPremLeadTLabel, cst); // Lead Tech pay
				innerPanel.add(payHolidayLabel, cst); // Holiday pay
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				innerPanel.add(hoursYesOTList.get(y - OFFSET1), cst);
				cst.gridx = 1;
				innerPanel.add(hoursNoOTList.get(y - OFFSET1), cst);
				cst.gridx = 2;
				innerPanel.add(usePremAftnList.get(y - OFFSET1), cst);
				cst.gridx = 3;
				innerPanel.add(usePremOvrnList.get(y - OFFSET1), cst);
				cst.gridx = 4;
				innerPanel.add(usePremSunList.get(y - OFFSET1), cst);
				cst.gridx = 5;
				innerPanel.add(usePremLeadTList.get(y - OFFSET1), cst);
				cst.gridx = 6;
				innerPanel.add(useHolidayList.get(y - OFFSET1), cst);
				cst.gridx = 7;
				innerPanel.add(payYesOTStrList.get(y - OFFSET1), cst);
				cst.gridx = 8;
				innerPanel.add(payYesOTOTList.get(y - OFFSET1), cst);
				cst.gridx = 9;
				innerPanel.add(payNoOTList.get(y - OFFSET1), cst);
				cst.gridx = 10;
				innerPanel.add(payPremOpList.get(y - OFFSET1), cst);
				cst.gridx = 11;
				innerPanel.add(payPremAftnList.get(y - OFFSET1), cst);
				cst.gridx = 12;
				innerPanel.add(payPremOvrnList.get(y - OFFSET1), cst);
				cst.gridx = 13;
				innerPanel.add(payPremSunList.get(y - OFFSET1), cst);
				cst.gridx = 14;
				innerPanel.add(payPremLeadTList.get(y - OFFSET1), cst);
				cst.gridx = 15;
				innerPanel.add(payHolidayList.get(y - OFFSET1), cst);
				break;
			case 9:
				// subtotal stuff here
				break;
			case 10:
				// blank row here
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
				innerPanel.add(hoursYesOTList.get(y - OFFSET2), cst);
				cst.gridx = 1;
				innerPanel.add(hoursNoOTList.get(y - OFFSET2), cst);
				cst.gridx = 2;
				innerPanel.add(usePremAftnList.get(y - OFFSET2), cst);
				cst.gridx = 3;
				innerPanel.add(usePremOvrnList.get(y - OFFSET2), cst);
				cst.gridx = 4;
				innerPanel.add(usePremSunList.get(y - OFFSET2), cst);
				cst.gridx = 5;
				innerPanel.add(usePremLeadTList.get(y - OFFSET2), cst);
				cst.gridx = 6;
				innerPanel.add(useHolidayList.get(y - OFFSET2), cst);
				cst.gridx = 7;
				innerPanel.add(payYesOTStrList.get(y - OFFSET2), cst);
				cst.gridx = 8;
				innerPanel.add(payYesOTOTList.get(y - OFFSET2), cst);
				cst.gridx = 9;
				innerPanel.add(payNoOTList.get(y - OFFSET2), cst);
				cst.gridx = 10;
				innerPanel.add(payPremOpList.get(y - OFFSET2), cst);
				cst.gridx = 11;
				innerPanel.add(payPremAftnList.get(y - OFFSET2), cst);
				cst.gridx = 12;
				innerPanel.add(payPremOvrnList.get(y - OFFSET2), cst);
				cst.gridx = 13;
				innerPanel.add(payPremSunList.get(y - OFFSET2), cst);
				cst.gridx = 14;
				innerPanel.add(payPremLeadTList.get(y - OFFSET2), cst);
				cst.gridx = 15;
				innerPanel.add(payHolidayList.get(y - OFFSET2), cst);
				break;
			case 18:
				// subtotal stuff here
				break;
			case 19:
				// blank row here
				break;
			case 20:
				// totals here
				break;
			default:
				break;
			}
		}

		// TODO add the innerPanel
		add(innerPanel);

		// TODO add the buttons for calculating and resettting

	}

	private final ActionListener setHourlyRate = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO set the hourly rate
			GenParam.setRateHourly(new BigDecimal(inputHourlyRate.getText()));
			System.out.println(GenParam.getRateHourly());
			calculate();
		}
	};
	
	private final ActionListener setUsePremOp = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO set the use of operator premium
			GenParam.setUsePremOp(usePremOpCheck.isSelected());
			calculate();
		}
	};

	private final ActionListener calculateAll = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// IMPORTANT!!!
			// set all parameters (GenParam and Punch) with values read from
			// JObjects
			// this is because entering in fields does NOT set them
			// !!!
			// TODO read all fields into punch item, run calc method, update pay values
			calculate();
		}
	};
	private final ActionListener clearListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			clearPayValues();
		}
	};
	
	private void calculate() {
		GenParam.setRateHourly(new BigDecimal(inputHourlyRate.getText()));
		GenParam.setUsePremOp(usePremOpCheck.isSelected());
		for (int i = 0; i <= 2; i++) {
			Main.weekValueList.get(i).zeroWeek();
		}
		clearPayValues();
		for (int i = 1; i <= 14; i++) {
			Main.punchList.get(i).setHoursYesOT(new BigDecimal(hoursYesOTList.get(i).getText()));
			Main.punchList.get(i).setHoursNoOT(new BigDecimal(hoursNoOTList.get(i).getText()));
			Main.punchList.get(i).setUsePremAftn(usePremAftnList.get(i).isSelected());
			Main.punchList.get(i).setUsePremOvrn(usePremOvrnList.get(i).isSelected());
			Main.punchList.get(i).setUsePremSun(usePremSunList.get(i).isSelected());
			Main.punchList.get(i).setUsePremLeadT(usePremLeadTList.get(i).isSelected());
			Main.punchList.get(i).setUseHoliday(useHolidayList.get(i).isSelected());
			Calculations.calc(Main.punchList.get(i), Main.calcValueList.get(i), Main.weekValueList.get(Main.calcValueList.get(i).getDateWeek()));
		}
		updatePayValues();
	}

	private void clearPayValues() {
		for (int i = 0; i <= 14; i++) {
			Main.calcValueList.get(i).zero();
		}
		updatePayValues();
	}
	
	private void updatePayValues() {
		for (int i = 0; i <= 14; i++) {
			payYesOTStrList.get(i).setText(
					Main.calcValueList.get(i).getPayBaseYesOTStr()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payYesOTOTList.get(i).setText(
					Main.calcValueList.get(i).getPayBaseYesOTOT()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payNoOTList.get(i).setText(
					Main.calcValueList.get(i).getPayBaseNoOT()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payPremOpList.get(i).setText(
					Main.calcValueList.get(i).getPayPremOp()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payPremAftnList.get(i).setText(
					Main.calcValueList.get(i).getPayPremAftn()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payPremOvrnList.get(i).setText(
					Main.calcValueList.get(i).getPayPremOvrn()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payPremSunList.get(i).setText(
					Main.calcValueList.get(i).getPayPremSun()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payPremLeadTList.get(i).setText(
					Main.calcValueList.get(i).getPayPremLeadT()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
			payHolidayList.get(i).setText(
					Main.calcValueList.get(i).getPayHoliday()
							.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
							.toString());
		}
	}

	/*
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
	*/
	
	/*
	 * @Override public void actionPerformed(ActionEvent e) { // TODO
	 * Auto-generated method stub if (e.getSource()==inputHourlyRate) { // TODO
	 * } }
	 */
}
