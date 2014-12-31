import java.math.BigDecimal;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 */

public class GenParam {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private static BigDecimal rateHourly;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private static BigDecimal ratePremOp;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private static BigDecimal ratePremAftn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private static BigDecimal ratePremOvrn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private static BigDecimal ratePremSun;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private static BigDecimal ratePremLeadT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final static BigDecimal OVERTIME = new BigDecimal("40.0");

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final static BigDecimal LUNCHPAID = new BigDecimal("10.0");
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final static BigDecimal LUNCHAMOUNT = new BigDecimal("0.5");

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final static String INFO_FORMAT = "General Parameters:%n" 
		+ "Base Hourly Rate:  $%5.2f%n"
		+ "Operator Premium:  $%5.2f%n"
		+ "Evening Premium:   $%5.2f%n"
		+ "Overnight Premium: $%5.2f%n"
		+ "Sunday Premium:    $%5.2f%n"
		+ "Lead Tech Premium: $%5.2f%n"
		+ "Overtime After %s Hours%n"
		+ "2nd Lunch After %s Hours%n";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	public GenParam() {
		super();
	}

	public static BigDecimal getRateHourly() {
		return rateHourly;
	}

	public static void setRateHourly(BigDecimal rateHourly) {
		GenParam.rateHourly = rateHourly;
	}

	public static BigDecimal getRatePremOp() {
		return ratePremOp;
	}

	public static void setRatePremOp(BigDecimal ratePremOp) {
		GenParam.ratePremOp = ratePremOp;
	}

	public static BigDecimal getRatePremAftn() {
		return ratePremAftn;
	}

	public static void setRatePremAftn(BigDecimal ratePremAftn) {
		GenParam.ratePremAftn = ratePremAftn;
	}

	public static BigDecimal getRatePremOvrn() {
		return ratePremOvrn;
	}

	public static void setRatePremOvrn(BigDecimal ratePremOvrn) {
		GenParam.ratePremOvrn = ratePremOvrn;
	}

	public static BigDecimal getRatePremSun() {
		return ratePremSun;
	}

	public static void setRatePremSun(BigDecimal ratePremSun) {
		GenParam.ratePremSun = ratePremSun;
	}

	public static BigDecimal getRatePremLeadT() {
		return ratePremLeadT;
	}

	public static void setRatePremLeadT(BigDecimal ratePremLeadT) {
		GenParam.ratePremLeadT = ratePremLeadT;
	}

	public static BigDecimal getOvertime() {
		return OVERTIME;
	}

	public static BigDecimal getLunchpaid() {
		return LUNCHPAID;
	}
	
	public static BigDecimal getLunchamount() {
		return LUNCHAMOUNT;
	}

	public static String getINFO_FORMAT() {
		return INFO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	public static String showInfo() {
		System.out.printf(INFO_FORMAT,rateHourly.doubleValue(),
				ratePremOp.doubleValue(),ratePremAftn.doubleValue(),
				ratePremOvrn.doubleValue(),ratePremSun.doubleValue(),
				ratePremLeadT.doubleValue(),OVERTIME,LUNCHPAID);
		return "GenParam info done.";
	}

}
