import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.*;

/**
 * 
 */

/**
 * @author gfystro
 *
 */
public class UserInterface extends JFrame {

	private final String HOURSNOOT_LABEL = "Sick Hours";
	private final String HOURSYESOT_LABEL = "Reg. Hours";
	private final String USEPREMAFTN_LABEL = "Aftn";
	private final String USEPREMOVRN_LABEL = "Ovrn";
	private final String USEPREMSUN_LABEL = "Sun";
	private final String USEPREMLEADT_LABEL = "LeadT";
	private final String USEHOLIDAY_LABEL = "Holiday";
	private final String PAYYESOTSTR_LABEL = "Str. Pay";
	private final String PAYYESOTOT_LABEL = "OT Pay";
	private final String PAYNOOT_LABEL = "Sick Pay";
	private final String PAYPREMOP_LABEL = "Oper Pr.";
	private final String PAYPREMAFTN_LABEL = "Aftn Pr.";
	private final String PAYPREMOVRN_LABEL = "Ovrn Pr.";
	private final String PAYPREMSUN_LABEL = "Sun Pr.";
	private final String PAYPREMLEADT_LABEL = "LdT Pr.";
	private final String PAYHOLIDAY_LABEL = "Holiday";
	private final String WEEK1TOTAL_LABEL = "===== Week 1 Totals =====";
	private final String WEEK2TOTAL_LABEL = "===== Week 2 Totals =====";
	// private final String OVERALL_YESOTSTR = "Reg.";
	// private final String OVERALL_YESOTOT = "OT";
	// private final String OVERALL_NOOT = "Sick";
	// private final String OVERALL_HOLIDAY = "Holiday";
	// private final String OVERALL_HRS = "Hrs";
	// private final String OVERALL_PREM = "Prem";
	private final String OVERALL_TOTAL = "Total Pay";
	private final String TOTALLABEL = "==== Pay Period Totals ====";
	private static final long serialVersionUID = 1L;
	// private static final String ID_PROPERTY = "ID NUMBER";
	// private static final String TYPE_PROPERTY = "TYPE_OF_COMPONENT";
	// private static final BigDecimal ZERO = new BigDecimal("0.00");
	private static final int OFFSET1 = 1;
	private static final int OFFSET2 = 3;
	protected static final int WIDTH = 1080;
	protected static final int HEIGHT = 780;
	private static final int WIDTH_TEXT = 3;
	private static final int WIDTH_TEXT_WIDE = 4;
	private static final int WIDTH_TEXT_WIDER = 5;
	protected static final int ROWS = 22;
	protected static final int COLS = 16;
	// private static final int SPACER1 = 50;
	// private static final int SPACER2 = 500;
	// private static final int PREC0 = 0;
	// private static final int PREC1 = 1;
	private static final int PREC2 = 2;
	// private static final int PREC3 = 3;
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
	private JLabel summaryLabel1;
	private JLabel summaryLabel2;
	private JTextField summaryWeek1Hrs;
	private JTextField summaryWeek1SickHrs;
	private JTextField summaryWeek1YesOTStr;
	private JTextField summaryWeek1YesOTOT;
	private JTextField summaryWeek1NoOT;
	private JTextField summaryWeek1PremOp;
	private JTextField summaryWeek1PremAftn;
	private JTextField summaryWeek1PremOvrn;
	private JTextField summaryWeek1PremSun;
	private JTextField summaryWeek1PremLeadT;
	private JTextField summaryWeek1Holiday;
	private JTextField summaryWeek2Hrs;
	private JTextField summaryWeek2SickHrs;
	private JTextField summaryWeek2YesOTStr;
	private JTextField summaryWeek2YesOTOT;
	private JTextField summaryWeek2NoOT;
	private JTextField summaryWeek2PremOp;
	private JTextField summaryWeek2PremAftn;
	private JTextField summaryWeek2PremOvrn;
	private JTextField summaryWeek2PremSun;
	private JTextField summaryWeek2PremLeadT;
	private JTextField summaryWeek2Holiday;
	private JLabel totalLabel;
	private JTextField totalHrs;
	private JTextField totalSick;
	private JTextField totalYesOTStr;
	private JTextField totalYesOTOT;
	private JTextField totalNoOT;
	private JTextField totalPremOp;
	private JTextField totalPremAftn;
	private JTextField totalPremOvrn;
	private JTextField totalPremSun;
	private JTextField totalPremLeadT;
	private JTextField totalHoliday;
	private JLabel blankRow1 = new JLabel(" ");
	private JLabel blankRow2 = new JLabel(" ");
	private JLabel blankRow3 = new JLabel(" ");
	private JButton preDefBuDay;
	private JButton preDefDayAftn;
	private JButton preDefAftnAftn;
	private JButton preDefAftnOvrn;
	private JButton preDefOvrnBu;
	private JButton bCalc;
	private JButton bReset;
	private JPanel buttonPanel;
	/*
	 * private JTextField overallYesOTStr; private JLabel overallYesOTStrLabel;
	 * private JTextField overallYesOTStrHrs; private JLabel
	 * overallYesOTStrHrsLabel; private JTextField overallYesOTOT; private
	 * JLabel overallYesOTOTLabel; private JTextField overallYesOTOTHrs; private
	 * JLabel overallYesOTOTHrsLabel; private JTextField overallNoOT; private
	 * JLabel overallNoOTLabel; private JTextField overallNoOTHrs; private
	 * JLabel overallNoOTHrsLabel; private JTextField overallHoliday; private
	 * JLabel overallHolidayLabel; private JTextField overallHolidayHrs; private
	 * JLabel overallHolidayHrsLabel;
	 */
	private JTextField overallPrem;
	// private JLabel overallPremLabel;
	private JTextField overallTotal;
	private JLabel overallTotalLabel;
	// private JPanel overallPanel;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss-");
	private String myDateString;

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
		// use for loop to instantiate 15 objects of each of the above
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
					.getPayPremOp().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
					.toString(), WIDTH_TEXT_WIDE);
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

		// week 1 summary fields
		summaryLabel1 = new JLabel(WEEK1TOTAL_LABEL);
		summaryWeek1Hrs = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumHrs().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString(), WIDTH_TEXT);
		summaryWeek1Hrs.setEditable(false);
		summaryWeek1SickHrs = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumSick().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString(), WIDTH_TEXT);
		summaryWeek1SickHrs.setEditable(false);
		summaryWeek1YesOTStr = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumYesOTStr()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		summaryWeek1YesOTStr.setEditable(false);
		summaryWeek1YesOTOT = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumYesOTOT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		summaryWeek1YesOTOT.setEditable(false);
		summaryWeek1NoOT = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumNoOT().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString(), WIDTH_TEXT_WIDER);
		summaryWeek1NoOT.setEditable(false);
		summaryWeek1PremOp = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremOp()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek1PremOp.setEditable(false);
		summaryWeek1PremAftn = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremAftn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek1PremAftn.setEditable(false);
		summaryWeek1PremOvrn = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremOvrn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek1PremOvrn.setEditable(false);
		summaryWeek1PremSun = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremSun()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek1PremSun.setEditable(false);
		summaryWeek1PremLeadT = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremLeadT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek1PremLeadT.setEditable(false);
		summaryWeek1Holiday = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumHoliday()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek1Holiday.setEditable(false);

		// week 2 summary fields
		summaryLabel2 = new JLabel(WEEK2TOTAL_LABEL);
		summaryWeek2Hrs = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumHrs().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString(), WIDTH_TEXT);
		summaryWeek2Hrs.setEditable(false);
		summaryWeek2SickHrs = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumSick().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString(), WIDTH_TEXT);
		summaryWeek2SickHrs.setEditable(false);
		summaryWeek2YesOTStr = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumYesOTStr()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		summaryWeek2YesOTStr.setEditable(false);
		summaryWeek2YesOTOT = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumYesOTOT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		summaryWeek2YesOTOT.setEditable(false);
		summaryWeek2NoOT = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumNoOT().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString(), WIDTH_TEXT_WIDER);
		summaryWeek2NoOT.setEditable(false);
		summaryWeek2PremOp = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumPremOp()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek2PremOp.setEditable(false);
		summaryWeek2PremAftn = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumPremAftn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek2PremAftn.setEditable(false);
		summaryWeek2PremOvrn = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumPremOvrn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek2PremOvrn.setEditable(false);
		summaryWeek2PremSun = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumPremSun()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek2PremSun.setEditable(false);
		summaryWeek2PremLeadT = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumPremLeadT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek2PremLeadT.setEditable(false);
		summaryWeek2Holiday = new JTextField(Main.weekValueList.get(2)
				.getWeekAccumHoliday()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		summaryWeek2Holiday.setEditable(false);

		// totals elements
		totalLabel = new JLabel(TOTALLABEL);
		totalHrs = new JTextField(Main.weekValueList.get(1).getWeekAccumHrs()
				.add(Main.weekValueList.get(2).getWeekAccumHrs())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT);
		totalHrs.setEditable(false);
		totalSick = new JTextField(Main.weekValueList.get(1).getWeekAccumSick()
				.add(Main.weekValueList.get(2).getWeekAccumSick())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT);
		totalSick.setEditable(false);
		totalYesOTStr = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumYesOTStr()
				.add(Main.weekValueList.get(2).getWeekAccumYesOTStr())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		totalYesOTStr.setEditable(false);
		totalYesOTOT = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumYesOTOT()
				.add(Main.weekValueList.get(2).getWeekAccumYesOTOT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		totalYesOTOT.setEditable(false);
		totalNoOT = new JTextField(Main.weekValueList.get(1).getWeekAccumNoOT()
				.add(Main.weekValueList.get(2).getWeekAccumNoOT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDER);
		totalNoOT.setEditable(false);
		totalPremOp = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremOp()
				.add(Main.weekValueList.get(2).getWeekAccumPremOp())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		totalPremOp.setEditable(false);
		totalPremAftn = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremAftn()
				.add(Main.weekValueList.get(2).getWeekAccumPremAftn())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		totalPremAftn.setEditable(false);
		totalPremOvrn = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremOvrn()
				.add(Main.weekValueList.get(2).getWeekAccumPremOvrn())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		totalPremOvrn.setEditable(false);
		totalPremSun = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremSun()
				.add(Main.weekValueList.get(2).getWeekAccumPremSun())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		totalPremSun.setEditable(false);
		totalPremLeadT = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumPremLeadT()
				.add(Main.weekValueList.get(2).getWeekAccumPremLeadT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		totalPremLeadT.setEditable(false);
		totalHoliday = new JTextField(Main.weekValueList.get(1)
				.getWeekAccumHoliday()
				.add(Main.weekValueList.get(2).getWeekAccumHoliday())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString(),
				WIDTH_TEXT_WIDE);
		totalHoliday.setEditable(false);

		// create overall fields and labels
		/*
		 * overallYesOTStr = new JTextField("0", WIDTH_TEXT_WIDER);
		 * overallYesOTStr.setEditable(false); overallYesOTStrLabel = new
		 * JLabel(OVERALL_YESOTSTR); overallYesOTStrHrs = new JTextField("0",
		 * WIDTH_TEXT); overallYesOTStrHrs.setEditable(false);
		 * overallYesOTStrHrsLabel = new JLabel(OVERALL_HRS); overallYesOTOT =
		 * new JTextField("0", WIDTH_TEXT_WIDER);
		 * overallYesOTOT.setEditable(false); overallYesOTOTLabel = new
		 * JLabel(OVERALL_YESOTOT); overallYesOTOTHrs = new JTextField("0",
		 * WIDTH_TEXT); overallYesOTOTHrs.setEditable(false);
		 * overallYesOTOTHrsLabel = new JLabel(OVERALL_HRS); overallNoOT = new
		 * JTextField("0", WIDTH_TEXT_WIDER); overallNoOT.setEditable(false);
		 * overallNoOTLabel = new JLabel(OVERALL_NOOT); overallNoOTHrs = new
		 * JTextField("0", WIDTH_TEXT); overallNoOTHrs.setEditable(false);
		 * overallNoOTHrsLabel = new JLabel(OVERALL_HRS); overallHoliday = new
		 * JTextField("0", WIDTH_TEXT_WIDER); overallHoliday.setEditable(false);
		 * overallHolidayLabel = new JLabel(OVERALL_HOLIDAY); overallHolidayHrs
		 * = new JTextField("0", WIDTH_TEXT);
		 * overallHolidayHrs.setEditable(false); overallHolidayHrsLabel = new
		 * JLabel(OVERALL_HRS);
		 */
		overallPrem = new JTextField("0", WIDTH_TEXT_WIDE);
		overallPrem.setEditable(false);
		// overallPremLabel = new JLabel(OVERALL_PREM);
		overallTotal = new JTextField("0", WIDTH_TEXT_WIDER);
		overallTotal.setEditable(false);
		overallTotalLabel = new JLabel(OVERALL_TOTAL);

		// create "calculate" and "reset" buttons
		bCalc = new JButton("Calculate");
		bCalc.addActionListener(calculateAll);
		bReset = new JButton("Reset");
		bReset.addActionListener(clearListener);

		// create predefined field buttons
		preDefBuDay = new JButton("B/D");
		preDefBuDay.addActionListener(populateBuDay);
		preDefDayAftn = new JButton("D/A");
		preDefDayAftn.addActionListener(populateDayAftn);
		preDefAftnAftn = new JButton("A/A");
		preDefAftnAftn.addActionListener(populateAftnAftn);
		preDefAftnOvrn = new JButton("A/O");
		preDefAftnOvrn.addActionListener(populateAftnOvrn);
		preDefOvrnBu = new JButton("O/B");
		preDefOvrnBu.addActionListener(populateOvrnBu);

		// create title and add
		windowTitle = new JLabel(getTitle());
		windowTitle.setFont(new Font("San-Serif", Font.BOLD, 24));
		add(Box.createHorizontalStrut(360));
		add(windowTitle);
		add(Box.createHorizontalStrut(360));

		// create gridbaglayout panel
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new GridBagLayout());
		innerPanel.setSize(ROWS, COLS);
		GridBagConstraints cst = new GridBagConstraints();

		// add all elements to JPanel innerPanels
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
				innerPanel.add(summaryWeek1Hrs, cst);
				cst.gridx = 1;
				innerPanel.add(summaryWeek1SickHrs, cst);
				cst.gridwidth = 5;
				cst.gridx = 2;
				innerPanel.add(summaryLabel1, cst);
				cst.gridwidth = 1;
				cst.gridx = 7;
				innerPanel.add(summaryWeek1YesOTStr, cst);
				cst.gridx = 8;
				innerPanel.add(summaryWeek1YesOTOT, cst);
				cst.gridx = 9;
				innerPanel.add(summaryWeek1NoOT, cst);
				cst.gridx = 10;
				innerPanel.add(summaryWeek1PremOp, cst);
				cst.gridx = 11;
				innerPanel.add(summaryWeek1PremAftn, cst);
				cst.gridx = 12;
				innerPanel.add(summaryWeek1PremOvrn, cst);
				cst.gridx = 13;
				innerPanel.add(summaryWeek1PremSun, cst);
				cst.gridx = 14;
				innerPanel.add(summaryWeek1PremLeadT, cst);
				cst.gridx = 15;
				innerPanel.add(summaryWeek1Holiday, cst);
				break;
			case 10:
				cst.gridwidth = 16;
				innerPanel.add(blankRow1, cst);
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
				innerPanel.add(summaryWeek2Hrs, cst);
				cst.gridx = 1;
				innerPanel.add(summaryWeek2SickHrs, cst);
				cst.gridwidth = 5;
				cst.gridx = 2;
				innerPanel.add(summaryLabel2, cst);
				cst.gridwidth = 1;
				cst.gridx = 7;
				innerPanel.add(summaryWeek2YesOTStr, cst);
				cst.gridx = 8;
				innerPanel.add(summaryWeek2YesOTOT, cst);
				cst.gridx = 9;
				innerPanel.add(summaryWeek2NoOT, cst);
				cst.gridx = 10;
				innerPanel.add(summaryWeek2PremOp, cst);
				cst.gridx = 11;
				innerPanel.add(summaryWeek2PremAftn, cst);
				cst.gridx = 12;
				innerPanel.add(summaryWeek2PremOvrn, cst);
				cst.gridx = 13;
				innerPanel.add(summaryWeek2PremSun, cst);
				cst.gridx = 14;
				innerPanel.add(summaryWeek2PremLeadT, cst);
				cst.gridx = 15;
				innerPanel.add(summaryWeek2Holiday, cst);
				break;
			case 19:
				cst.gridwidth = 16;
				innerPanel.add(blankRow2, cst);
				break;
			case 20:
				innerPanel.add(totalHrs, cst);
				cst.gridx = 1;
				innerPanel.add(totalSick, cst);
				cst.gridwidth = 5;
				cst.gridx = 2;
				innerPanel.add(totalLabel, cst);
				cst.gridwidth = 1;
				cst.gridx = 7;
				innerPanel.add(totalYesOTStr, cst);
				cst.gridx = 8;
				innerPanel.add(totalYesOTOT, cst);
				cst.gridx = 9;
				innerPanel.add(totalNoOT, cst);
				cst.gridx = 10;
				innerPanel.add(totalPremOp, cst);
				cst.gridx = 11;
				innerPanel.add(totalPremAftn, cst);
				cst.gridx = 12;
				innerPanel.add(totalPremOvrn, cst);
				cst.gridx = 13;
				innerPanel.add(totalPremSun, cst);
				cst.gridx = 14;
				innerPanel.add(totalPremLeadT, cst);
				cst.gridx = 15;
				innerPanel.add(totalHoliday, cst);
				break;
			case 21:
				cst.gridwidth = 16;
				innerPanel.add(blankRow3, cst);
				break;
			default:
				break;
			}
		}

		// add the innerPanel
		add(innerPanel);

		// add the overall totals
		// overallPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 24, 5));

		// add the buttons for calculating and resettting
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 20, 5));
		buttonPanel.add(bCalc);
		buttonPanel.add(bReset);
		buttonPanel.add(preDefBuDay);
		buttonPanel.add(preDefDayAftn);
		buttonPanel.add(preDefAftnAftn);
		buttonPanel.add(preDefAftnOvrn);
		buttonPanel.add(preDefOvrnBu);
		buttonPanel.add(Box.createHorizontalStrut(240));
		buttonPanel.add(overallTotalLabel);
		buttonPanel.add(overallTotal);
		add(buttonPanel);
	}

	private final ActionListener setHourlyRate = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// set the hourly rate
			GenParam.setRateHourly(new BigDecimal(inputHourlyRate.getText()));
			System.out.println(GenParam.getRateHourly());
			calculate();
		}
	};

	private final ActionListener setUsePremOp = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// set the use of operator premium
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
			// read all fields into punch item, run calc method, update pay
			// values
			calculate();
		}
	};
	private final ActionListener clearListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<List<String>> list = PreDefPunches.Zero;
			populatePreDefined(list);
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
			Main.punchList.get(i).setHoursYesOT(
					new BigDecimal(hoursYesOTList.get(i).getText()));
			Main.punchList.get(i).setHoursNoOT(
					new BigDecimal(hoursNoOTList.get(i).getText()));
			Main.punchList.get(i).setUsePremAftn(
					usePremAftnList.get(i).isSelected());
			Main.punchList.get(i).setUsePremOvrn(
					usePremOvrnList.get(i).isSelected());
			Main.punchList.get(i).setUsePremSun(
					usePremSunList.get(i).isSelected());
			Main.punchList.get(i).setUsePremLeadT(
					usePremLeadTList.get(i).isSelected());
			Main.punchList.get(i).setUseHoliday(
					useHolidayList.get(i).isSelected());
			Calculations.calc(Main.punchList.get(i), Main.calcValueList.get(i),
					Main.weekValueList.get(Main.calcValueList.get(i)
							.getDateWeek()));
		}
		updatePayValues();
	}

	private void clearPayValues() {
		for (int i = 0; i <= 14; i++) {
			Main.calcValueList.get(i).zero();
		}
		for (int i = 0; i <= 2; i++) {
			Main.weekValueList.get(i).zeroWeek();
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
		summaryWeek1Hrs.setText(Main.weekValueList.get(1).getWeekAccumHrs()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1SickHrs.setText(Main.weekValueList.get(1)
				.getWeekAccumSick().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString());
		summaryWeek1YesOTStr.setText(Main.weekValueList.get(1)
				.getWeekAccumYesOTStr()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1YesOTOT.setText(Main.weekValueList.get(1)
				.getWeekAccumYesOTOT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1NoOT.setText(Main.weekValueList.get(1).getWeekAccumNoOT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1PremOp.setText(Main.weekValueList.get(1)
				.getWeekAccumPremOp()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1PremAftn.setText(Main.weekValueList.get(1)
				.getWeekAccumPremAftn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1PremOvrn.setText(Main.weekValueList.get(1)
				.getWeekAccumPremOvrn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1PremSun.setText(Main.weekValueList.get(1)
				.getWeekAccumPremSun()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1PremLeadT.setText(Main.weekValueList.get(1)
				.getWeekAccumPremLeadT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek1Holiday.setText(Main.weekValueList.get(1)
				.getWeekAccumHoliday()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());

		summaryWeek2Hrs.setText(Main.weekValueList.get(2).getWeekAccumHrs()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2SickHrs.setText(Main.weekValueList.get(2)
				.getWeekAccumSick().setScale(PREC2, BigDecimal.ROUND_HALF_EVEN)
				.toString());
		summaryWeek2YesOTStr.setText(Main.weekValueList.get(2)
				.getWeekAccumYesOTStr()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2YesOTOT.setText(Main.weekValueList.get(2)
				.getWeekAccumYesOTOT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2NoOT.setText(Main.weekValueList.get(2).getWeekAccumNoOT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2PremOp.setText(Main.weekValueList.get(2)
				.getWeekAccumPremOp()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2PremAftn.setText(Main.weekValueList.get(2)
				.getWeekAccumPremAftn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2PremOvrn.setText(Main.weekValueList.get(2)
				.getWeekAccumPremOvrn()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2PremSun.setText(Main.weekValueList.get(2)
				.getWeekAccumPremSun()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2PremLeadT.setText(Main.weekValueList.get(2)
				.getWeekAccumPremLeadT()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		summaryWeek2Holiday.setText(Main.weekValueList.get(2)
				.getWeekAccumHoliday()
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalHrs.setText(Main.weekValueList.get(1).getWeekAccumHrs()
				.add(Main.weekValueList.get(2).getWeekAccumHrs())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalSick.setText(Main.weekValueList.get(1).getWeekAccumSick()
				.add(Main.weekValueList.get(2).getWeekAccumSick())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalYesOTStr.setText(Main.weekValueList.get(1).getWeekAccumYesOTStr()
				.add(Main.weekValueList.get(2).getWeekAccumYesOTStr())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalYesOTOT.setText(Main.weekValueList.get(1).getWeekAccumYesOTOT()
				.add(Main.weekValueList.get(2).getWeekAccumYesOTOT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalNoOT.setText(Main.weekValueList.get(1).getWeekAccumNoOT()
				.add(Main.weekValueList.get(2).getWeekAccumNoOT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalPremOp.setText(Main.weekValueList.get(1).getWeekAccumPremOp()
				.add(Main.weekValueList.get(2).getWeekAccumPremOp())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalPremAftn.setText(Main.weekValueList.get(1).getWeekAccumPremAftn()
				.add(Main.weekValueList.get(2).getWeekAccumPremAftn())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalPremOvrn.setText(Main.weekValueList.get(1).getWeekAccumPremOvrn()
				.add(Main.weekValueList.get(2).getWeekAccumPremOvrn())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalPremSun.setText(Main.weekValueList.get(1).getWeekAccumPremSun()
				.add(Main.weekValueList.get(2).getWeekAccumPremSun())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalPremLeadT.setText(Main.weekValueList.get(1)
				.getWeekAccumPremLeadT()
				.add(Main.weekValueList.get(2).getWeekAccumPremLeadT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		totalHoliday.setText(Main.weekValueList.get(1).getWeekAccumHoliday()
				.add(Main.weekValueList.get(2).getWeekAccumHoliday())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());

		/*
		 * overallYesOTStr.setText(Main.weekValueList.get(1).getWeekAccumYesOTStr
		 * () .add(Main.weekValueList.get(2).getWeekAccumYesOTStr())
		 * .setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		 * overallYesOTOT
		 * .setText(Main.weekValueList.get(1).getWeekAccumYesOTOT()
		 * .add(Main.weekValueList.get(2).getWeekAccumYesOTOT())
		 * .setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		 * overallNoOT.setText(Main.weekValueList.get(1).getWeekAccumNoOT()
		 * .add(Main.weekValueList.get(2).getWeekAccumNoOT()) .setScale(PREC2,
		 * BigDecimal.ROUND_HALF_EVEN).toString());
		 * overallHoliday.setText(Main.weekValueList
		 * .get(1).getWeekAccumHoliday()
		 * .add(Main.weekValueList.get(2).getWeekAccumHoliday())
		 * .setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		 */
		overallPrem.setText(Main.weekValueList.get(1).getWeekAccumPremOp()
				.add(Main.weekValueList.get(2).getWeekAccumPremOp())
				.add(Main.weekValueList.get(1).getWeekAccumPremAftn())
				.add(Main.weekValueList.get(2).getWeekAccumPremAftn())
				.add(Main.weekValueList.get(1).getWeekAccumPremOvrn())
				.add(Main.weekValueList.get(2).getWeekAccumPremOvrn())
				.add(Main.weekValueList.get(1).getWeekAccumPremSun())
				.add(Main.weekValueList.get(2).getWeekAccumPremSun())
				.add(Main.weekValueList.get(1).getWeekAccumPremLeadT())
				.add(Main.weekValueList.get(2).getWeekAccumPremLeadT())
				.setScale(PREC2, BigDecimal.ROUND_HALF_EVEN).toString());
		overallTotal.setText(new BigDecimal(totalYesOTStr.getText())
				.add(new BigDecimal(totalYesOTOT.getText()))
				.add(new BigDecimal(totalNoOT.getText()))
				.add(new BigDecimal(totalHoliday.getText()))
				.add(new BigDecimal(overallPrem.getText())).toString());
		// outputString(); // output text file with info for use to send to HR -
		// still need to finish
	}

	private final ActionListener populateBuDay = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<List<String>> list = PreDefPunches.buDay;
			populatePreDefined(list);
		}
	};

	private final ActionListener populateDayAftn = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<List<String>> list = PreDefPunches.dayAftn;
			populatePreDefined(list);
		}
	};

	private final ActionListener populateAftnAftn = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<List<String>> list = PreDefPunches.aftnAftn;
			populatePreDefined(list);
		}
	};

	private final ActionListener populateAftnOvrn = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<List<String>> list = PreDefPunches.AftnOvrn;
			populatePreDefined(list);
		}
	};

	private final ActionListener populateOvrnBu = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<List<String>> list = PreDefPunches.OvrnBu;
			populatePreDefined(list);
		}
	};

	private void populatePreDefined(List<List<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			int day = i + 1;
			hoursYesOTList.get(day).setText(list.get(i).get(0));
			usePremAftnList.get(day).setSelected(
					new Boolean(list.get(i).get(1)));
			usePremOvrnList.get(day).setSelected(
					new Boolean(list.get(i).get(2)));
			usePremSunList.get(day)
					.setSelected(new Boolean(list.get(i).get(3)));
		}
	}

	// use this method to output pay period information to text file for use
	// when communicating with HR
	private void outputString() {
		myDateString = sdf.format(new Date());
		BufferedWriter out = null;
		/*
		 * try { FileWriter fstream = new FileWriter("out.txt", true); //true
		 * tells to append data. out = new BufferedWriter(fstream);
		 * out.write(myDateString + inputHourlyRate.getText()); } catch
		 * (IOException e) { System.err.println("Error: " + e.getMessage()); }
		 * finally { if(out != null) { out.close(); } }
		 */
		FileWriter fstream = null;
		try {
			fstream = new FileWriter("out.txt", true);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error has occurred on opening file");
		}
		out = new BufferedWriter(fstream);
		try {
			out.write(myDateString + inputHourlyRate.getText()
					+ usePremOpCheck.isSelected() + "\r\n");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error occurred on writing to file");
		}
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error occurred on closing file");
		}
	}

	/*
	 * private JTextField buildInputHours(int num, String desc) { // text field
	 * for inputting hoursYesOT and hoursNoOT JTextField textfield = new
	 * JTextField(Integer.toString(num));
	 * textfield.putClientProperty(ID_PROPERTY, Integer.valueOf(num));
	 * textfield.putClientProperty(TYPE_PROPERTY, desc);
	 * textfield.addActionListener(clearListener); return textfield; }
	 * 
	 * private JCheckBox buildCheckbox(int num, String desc) { // every boolean
	 * option will require a check box JCheckBox checkbox = new
	 * JCheckBox(Integer.toString(num)); checkbox.putClientProperty(ID_PROPERTY,
	 * Integer.valueOf(num)); checkbox.putClientProperty(TYPE_PROPERTY, desc);
	 * checkbox.addActionListener(clearListener); return checkbox; }
	 * 
	 * private JLabel buildOutputLabel(int num, String desc) { // these labels
	 * will be for all daily calcValues JLabel label = new
	 * JLabel(Integer.toString(num)); label.putClientProperty(ID_PROPERTY,
	 * Integer.valueOf(num)); label.putClientProperty(TYPE_PROPERTY, desc);
	 * return label; }
	 */

}
