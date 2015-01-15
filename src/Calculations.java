import java.math.BigDecimal;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 */

public class Calculations {
	/**
	 * This is the number of hours for a single day that are eligible for the
	 * overtime premium.
	 */

	private static BigDecimal hoursOT;

	/**
	 * This is the total amount of hours to be paid for the single day. This
	 * value would include the addition of the "No 2nd Lunch" hours if
	 * applicable.
	 */

	private static BigDecimal hoursPaid;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final String INFO_FORMAT = "string";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Calculations() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getINFO_FORMAT() {
		return INFO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public static void calc(Punch punch, CalcValues day, WeekValues week) {
		// paid hours may have additional 0.5 hours added for days longer than
		// 10 hours due to 2nd lunch not being taken
		hoursPaid = calc2ndLunch(punch);
		System.out.println("Today's punched hours: " + punch.getHoursYesOT());
		System.out.println("Today's paid hours: " + hoursPaid);
		// hours of OT per day based on weekly accumulated hours
		hoursOT = calcHoursOT(week, hoursPaid);
		// set straight pay amount for the day - separates from OT hours of pay
		day.setPayBaseYesOTStr(calcBaseYesOTStr(week, hoursPaid.subtract(hoursOT)));
		System.out.println("Straight pay: $" + day.getPayBaseYesOTStr());
		// set OT pay for the day
		day.setPayBaseYesOTOT(calcBaseYesOTOT(week, hoursOT));
		System.out.println("OT pay: $" + day.getPayBaseYesOTOT());
		// set pay for non-OT eligible hours, i.e. sick pay
		day.setPayBaseNoOT(calcBaseNoOT(week, punch.getHoursNoOT()));
		System.out.println("Non-OT pay: $" + day.getPayBaseNoOT());
		// set pay for operator premium
		if (GenParam.getUsePremOp()) {
			day.setPayPremOp(calcPremOp(week, hoursPaid, hoursOT));
		}
		System.out.println("Operator Prem: $" + day.getPayPremOp());
		// set pay for afternoon premium
		if (punch.getUsePremAftn()) {
			day.setPayPremAftn(calcPremAftn(week, hoursPaid, hoursOT));
		}
		System.out.println("Afternoon Prem: $" + day.getPayPremAftn());
		// set pay for overnight premium
		if (punch.getUsePremOvrn()) {
			day.setPayPremOvrn(calcPremOvrn(week, hoursPaid, hoursOT));
		}
		System.out.println("Overnight Prem: $" + day.getPayPremOvrn());
		// set pay for Sunday premium
		if (punch.getUsePremSun()) {
			day.setPayPremSun(calcPremSun(week, hoursPaid, hoursOT));
		}
		System.out.println("Sunday Prem: $" + day.getPayPremSun());
		// set pay for lead technician premium
		if (punch.getUsePremLeadT()) {
			day.setPayPremLeadT(calcPremLeadT(week, hoursPaid, hoursOT));
		}
		System.out.println("Lead Tech Prem: $" + day.getPayPremLeadT());
		// set pay for holiday pay
		if (punch.getUseHoliday()) {
			day.setPayHoliday(calcHoliday(week, GenParam.getHolidayhours()));
		}
		System.out.println("Holiday pay: $" + day.getPayHoliday());
	}

	/**
	 * The "No 2nd Lunch" calculation is based on the fact that operators never
	 * get a lunch period. Due to this, the following contract clause applies:
	 * 
	 * "Any employee that is required to work more than ten (10) consecutive
	 * hours (excluding the regular lunch period) shall be permitted to take
	 * thirty (30) minutes off for a lunch period, without loss of pay.
	 * 
	 * The values for the required worked hours and amount of compensated hours
	 * are kept as variables in the GenParams class.
	 * 
	 * @param punch
	 *            This is an individual day's input values for the hours.
	 */

	private static BigDecimal calc2ndLunch(Punch punch) {
		BigDecimal hours = new BigDecimal(0);
		if (punch.getHoursYesOT().compareTo(GenParam.getLunchpaid()) == 1) {
			hours = punch.getHoursYesOT().add(GenParam.getLunchamount());
			System.out.println("No 2nd lunch applies.");
		} else {
			hours = punch.getHoursYesOT();
		}
		return hours;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param hours
	 */

	private static BigDecimal calcHoursOT(WeekValues week, BigDecimal hours) {
		BigDecimal totalOT = new BigDecimal(0);
		BigDecimal dayOT = new BigDecimal(0);
		week.addWeekAccumHrs(hours);
		System.out.println("Hours this week so far: " + week.getWeekAccumHrs());
		if (week.getWeekAccumHrs().compareTo(GenParam.getOvertime()) == 1) {
			totalOT = week.getWeekAccumHrs().subtract(GenParam.getOvertime());
		}
		if (totalOT.compareTo(hours) == 1) {
			dayOT = hours;
		} else {
			dayOT = totalOT;
		}
		System.out.println("Today's OT: " + dayOT);
		return dayOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcBaseYesOTStr(WeekValues week, BigDecimal hours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRateHourly()));
		week.addWeekAccumYesOTStr(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcBaseYesOTOT(WeekValues week, BigDecimal hours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRateHourly()));
		pay = pay.add(hours.multiply(GenParam.getRateot()).multiply(
				GenParam.getRateHourly()));
		week.addWeekAccumYesOTOT(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcBaseNoOT(WeekValues week, BigDecimal hours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRateHourly()));
		week.addWeekAccumSick(hours);
		week.addWeekAccumNoOT(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremOp(WeekValues week, BigDecimal hours, BigDecimal otHours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRatePremOp()));
		pay = pay.add(otHours.multiply(GenParam.getRatePremOp()).multiply(
				GenParam.getRateotprem()));
		week.addWeekAccumPremOp(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremAftn(WeekValues week, BigDecimal hours, BigDecimal otHours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRatePremAftn()));
		pay = pay.add(otHours.multiply(GenParam.getRatePremAftn()).multiply(
				GenParam.getRateotprem()));
		week.addWeekAccumPremAftn(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremOvrn(WeekValues week, BigDecimal hours, BigDecimal otHours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRatePremOvrn()));
		pay = pay.add(otHours.multiply(GenParam.getRatePremOvrn()).multiply(
				GenParam.getRateotprem()));
		week.addWeekAccumPremOvrn(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremSun(WeekValues week, BigDecimal hours, BigDecimal otHours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRatePremSun()));
		pay = pay.add(otHours.multiply(GenParam.getRatePremSun()).multiply(
				GenParam.getRateotprem()));
		week.addWeekAccumPremSun(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremLeadT(WeekValues week, BigDecimal hours, BigDecimal otHours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRatePremLeadT()));
		pay = pay.add(otHours.multiply(GenParam.getRatePremLeadT()).multiply(
				GenParam.getRateotprem()));
		week.addWeekAccumPremLeadT(pay);
		return pay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcHoliday(WeekValues week, BigDecimal hours) {
		BigDecimal pay = new BigDecimal(0);
		pay = pay.add(hours.multiply(GenParam.getRateHourly()));
		week.addWeekAccumHoliday(pay);
		return pay;
	}

}
