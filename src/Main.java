import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.*;

/**
 * 
 */

/**
 * @author Greg Fystro
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Set all general parameters to starting values
		GenParam.setRateHourly(new BigDecimal("30.00"));
		GenParam.setRatePremOp(new BigDecimal(".85"));
		GenParam.setRatePremAftn(new BigDecimal(".85"));
		GenParam.setRatePremOvrn(new BigDecimal(".90"));
		GenParam.setRatePremSun(new BigDecimal(".70"));
		GenParam.setRatePremLeadT(new BigDecimal(".95"));
//		GenParam.showInfo();
		
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserInterface calc = new UserInterface();
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                calc.setVisible(true);
            }
        });
		
		// TODO create an arrayList of strings with the day names
		// TODO create an arrayList for each row element inputs (8) and outputs (8)
		int day;
		int week;
		ArrayList<Punch> punchList = new ArrayList<Punch>();
		ArrayList<CalcValues> calcValueList = new ArrayList<CalcValues>();
		ArrayList<WeekValues> weekValueList = new ArrayList<WeekValues>();
		
		/**
		 * 
		 */
		for (int i = 0; i <= 14; i++) {
			Punch punch = new Punch();
			punch.setHoursYesOT(new BigDecimal(9));
//			punch.showInfo();
			punchList.add(punch);
			if (i<=7) {
				day = i;
				week = 1;
			}
			else {
				day = i-7;
				week = 2;
			}
			CalcValues calcValue = new CalcValues(day,week);
//			calcValue.showInfo();
			calcValueList.add(calcValue);
		}
		
		/**
		 * 
		 */
		for (int i = 0; i <= 2; i++) {
			WeekValues weekValue = new WeekValues();
//			weekValue.showInfo();
			weekValueList.add(weekValue);
		}
		
		/**
		 * 
		 */
		// TODO before calling calc method add the zero for each day and zero for each week
		for (int i = 1; i <= 14; i++) {
			System.out.println(" ");
			Calculations.calc(punchList.get(i), calcValueList.get(i), weekValueList.get(calcValueList.get(i).getDateWeek()));
		}
		
	}

}
