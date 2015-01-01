import java.math.BigDecimal;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 */

public class CalcValues {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payBaseYesOTStr;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payBaseYesOTOT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payBaseNoOT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payPremOp;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payPremAftn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payPremOvrn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payPremSun;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payPremLeadT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal pay2ndLunch;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal payHoliday;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private int dateDay;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private int dateWeek;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final String INFO_FORMAT = "string";

	
	public CalcValues() {
		
	}
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param week 
	 * @param day 
	 */
	public CalcValues(int day, int week) {
		super();
		
		dateDay = day;
		dateWeek = week;
		zero();
	}

	public BigDecimal getPayBaseYesOTStr() {
		return payBaseYesOTStr;
	}

	public void setPayBaseYesOTStr(BigDecimal payBaseYesOTStr) {
		this.payBaseYesOTStr = payBaseYesOTStr;
	}
	
	public BigDecimal getPayBaseYesOTOT() {
		return payBaseYesOTOT;
	}

	public void setPayBaseYesOTOT(BigDecimal payBaseYesOTOT) {
		this.payBaseYesOTOT = payBaseYesOTOT;
	}
	
	public BigDecimal getPayBaseNoOT() {
		return payBaseNoOT;
	}

	public void setPayBaseNoOT(BigDecimal payBaseNoOT) {
		this.payBaseNoOT = payBaseNoOT;
	}

	public BigDecimal getPayPremOp() {
		return payPremOp;
	}

	public void setPayPremOp(BigDecimal payPremOp) {
		this.payPremOp = payPremOp;
	}

	public BigDecimal getPayPremAftn() {
		return payPremAftn;
	}

	public void setPayPremAftn(BigDecimal payPremAftn) {
		this.payPremAftn = payPremAftn;
	}

	public BigDecimal getPayPremOvrn() {
		return payPremOvrn;
	}

	public void setPayPremOvrn(BigDecimal payPremOvrn) {
		this.payPremOvrn = payPremOvrn;
	}

	public BigDecimal getPayPremSun() {
		return payPremSun;
	}

	public void setPayPremSun(BigDecimal payPremSun) {
		this.payPremSun = payPremSun;
	}

	public BigDecimal getPayPremLeadT() {
		return payPremLeadT;
	}

	public void setPayPremLeadT(BigDecimal payPremLeadT) {
		this.payPremLeadT = payPremLeadT;
	}

	public BigDecimal getPay2ndLunch() {
		return pay2ndLunch;
	}

	public void setPay2ndLunch(BigDecimal pay2ndLunch) {
		this.pay2ndLunch = pay2ndLunch;
	}

	public BigDecimal getPayHoliday() {
		return payHoliday;
	}

	public void setPayHoliday(BigDecimal payHoliday) {
		this.payHoliday = payHoliday;
	}

	public int getDateDay() {
		return dateDay;
	}

	public void setDateDay(int dateDay) {
		this.dateDay = dateDay;
	}

	public int getDateWeek() {
		return dateWeek;
	}

	public void setDateWeek(int dateWeek) {
		this.dateWeek = dateWeek;
	}

	public String getINFO_FORMAT() {
		return INFO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public String showInfo() {
		// TODO implement me
		return "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void zero() {
		payBaseYesOTStr = new BigDecimal("0.00");
		payBaseNoOT = new BigDecimal("0.00");
		payPremOp = new BigDecimal("0.00");
		payPremAftn = new BigDecimal("0.00");
		payPremOvrn = new BigDecimal("0.00");
		payPremSun = new BigDecimal("0.00");
		payPremLeadT = new BigDecimal("0.00");
		pay2ndLunch = new BigDecimal("0.00");
		payHoliday = new BigDecimal("0.00");
	}

}
