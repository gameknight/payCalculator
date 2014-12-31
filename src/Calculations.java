import java.math.BigDecimal;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 */

public class Calculations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal hoursOT;

	/**
	 * This is the number of hours for a single day that are eligible for the
	 * overtime premium.
	 */

	private static BigDecimal hoursPaid;

	/**
	 * This is the total amount of hours to be paid for the single day. This
	 * value would include the addition of the "No 2nd Lunch" hours if
	 * applicable.
	 */

	private final BigDecimal HOLIDAY_HRS = new BigDecimal("8.0");

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private final BigDecimal OT_RATE = new BigDecimal("0.5");

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private final BigDecimal OT_RATE_PREM = new BigDecimal("0.5");

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

	public BigDecimal getHOLIDAY_HRS() {
		return HOLIDAY_HRS;
	}

	public BigDecimal getOT_RATE() {
		return OT_RATE;
	}

	public BigDecimal getOT_RATE_PREM() {
		return OT_RATE_PREM;
	}

	public String getINFO_FORMAT() {
		return INFO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public static void calc(Punch punch, CalcValues day, WeekValues week) {
		hoursPaid = calc2ndLunch(punch);
		hoursOT = calcHoursOT(week, hoursPaid);
		System.out.println("todays OT: " + hoursOT);
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

		/**
		 * 
		 */
		BigDecimal totalOT = new BigDecimal(0);
		BigDecimal dayOT = new BigDecimal(0);
		week.add(hours);
		System.out.println(week.getWeekAccumHrs());
		if (week.getWeekAccumHrs().compareTo(GenParam.getOvertime()) == 1) {
			totalOT = week.getWeekAccumHrs().subtract(GenParam.getOvertime());
		}
		if (totalOT.compareTo(hours) == 1) {
			dayOT = hours;
		} else {
			dayOT = totalOT;
		}
		return dayOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcBaseYesOT(BigDecimal hours) {
		// TODO implement me
		return new BigDecimal("0");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcBaseNoOT(BigDecimal hours) {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremOp(BigDecimal hours) {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremAftn(BigDecimal hours) {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremOvrn(BigDecimal hours) {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremSun(BigDecimal hours) {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcPremLeadT(BigDecimal hours) {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private static BigDecimal calcHoliday(BigDecimal hours) {
		// TODO implement me
		return null;
	}

}
