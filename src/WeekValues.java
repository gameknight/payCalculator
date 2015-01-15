import java.math.BigDecimal;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 */

public class WeekValues {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal weekAccumHrs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumSick;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumYesOTStr;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumYesOTOT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumNoOT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumPremOp;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumPremAftn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumPremOvrn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumPremSun;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumPremLeadT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private BigDecimal weekAccumHoliday;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final String INFO_FORMAT = "string";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public WeekValues() {
		zeroWeek();
	}

	public void zeroWeek() {
		setWeekAccumHrs(new BigDecimal(0));
		setWeekAccumYesOTStr(new BigDecimal(0));
		setWeekAccumYesOTOT(new BigDecimal(0));
		setWeekAccumNoOT(new BigDecimal(0));
		setWeekAccumPremOp(new BigDecimal(0));
		setWeekAccumPremAftn(new BigDecimal(0));
		setWeekAccumPremOvrn(new BigDecimal(0));
		setWeekAccumPremSun(new BigDecimal(0));
		setWeekAccumPremLeadT(new BigDecimal(0));
		setWeekAccumHoliday(new BigDecimal(0));
		setWeekAccumSick(new BigDecimal(0));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public BigDecimal getWeekAccumHrs() {
		return weekAccumHrs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void setWeekAccumHrs(BigDecimal week1AccumHrs) {
		this.weekAccumHrs = week1AccumHrs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumHrs(BigDecimal amount) {
		weekAccumHrs = weekAccumHrs.add(amount);
	}

	/**
	 * @return the weekAccumSick
	 */
	public BigDecimal getWeekAccumSick() {
		return weekAccumSick;
	}

	/**
	 * @param weekAccumSick the weekAccumSick to set
	 */
	public void setWeekAccumSick(BigDecimal weekAccumSick) {
		this.weekAccumSick = weekAccumSick;
	}

	/**
	 * @param weekAccumSickHrs the weekAccumSick to set
	 */
	public void addWeekAccumSick(BigDecimal amount) {
		weekAccumSick = weekAccumSick.add(amount);
	}

	/**
	 * @return the weekAccumYesOTStr
	 */
	public BigDecimal getWeekAccumYesOTStr() {
		return weekAccumYesOTStr;
	}

	/**
	 * @param weekAccumYesOTOT the weekAccumYesOTOT to set
	 */
	public void setWeekAccumYesOTStr(BigDecimal weekAccumYesOTStr) {
		this.weekAccumYesOTStr = weekAccumYesOTStr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumYesOTStr(BigDecimal amount) {
		weekAccumYesOTStr = weekAccumYesOTStr.add(amount);
	}

	/**
	 * @return the weekAccumYesOTOT
	 */
	public BigDecimal getWeekAccumYesOTOT() {
		return weekAccumYesOTOT;
	}

	/**
	 * @param weekAccumYesOTOT the weekAccumYesOTOT to set
	 */
	public void setWeekAccumYesOTOT(BigDecimal weekAccumYesOTOT) {
		this.weekAccumYesOTOT = weekAccumYesOTOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumYesOTOT(BigDecimal amount) {
		weekAccumYesOTOT = weekAccumYesOTOT.add(amount);
	}

	/**
	 * @return the weekAccumNoOT
	 */
	public BigDecimal getWeekAccumNoOT() {
		return weekAccumNoOT;
	}

	/**
	 * @param weekAccumNoOT the weekAccumNoOT to set
	 */
	public void setWeekAccumNoOT(BigDecimal weekAccumNoOT) {
		this.weekAccumNoOT = weekAccumNoOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumNoOT(BigDecimal amount) {
		weekAccumNoOT = weekAccumNoOT.add(amount);
	}

	/**
	 * @return the weekAccumPremOp
	 */
	public BigDecimal getWeekAccumPremOp() {
		return weekAccumPremOp;
	}

	/**
	 * @param weekAccumPremOp the weekAccumPremOp to set
	 */
	public void setWeekAccumPremOp(BigDecimal weekAccumPremOp) {
		this.weekAccumPremOp = weekAccumPremOp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumPremOp(BigDecimal amount) {
		weekAccumPremOp = weekAccumPremOp.add(amount);
	}

	/**
	 * @return the weekAccumPremAftn
	 */
	public BigDecimal getWeekAccumPremAftn() {
		return weekAccumPremAftn;
	}

	/**
	 * @param weekAccumPremAftn the weekAccumPremAftn to set
	 */
	public void setWeekAccumPremAftn(BigDecimal weekAccumPremAftn) {
		this.weekAccumPremAftn = weekAccumPremAftn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumPremAftn(BigDecimal amount) {
		weekAccumPremAftn = weekAccumPremAftn.add(amount);
	}

	/**
	 * @return the weekAccumPremOvrn
	 */
	public BigDecimal getWeekAccumPremOvrn() {
		return weekAccumPremOvrn;
	}

	/**
	 * @param weekAccumPremOvrn the weekAccumPremOvrn to set
	 */
	public void setWeekAccumPremOvrn(BigDecimal weekAccumPremOvrn) {
		this.weekAccumPremOvrn = weekAccumPremOvrn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumPremOvrn(BigDecimal amount) {
		weekAccumPremOvrn = weekAccumPremOvrn.add(amount);
	}

	/**
	 * @return the weekAccumPremSun
	 */
	public BigDecimal getWeekAccumPremSun() {
		return weekAccumPremSun;
	}

	/**
	 * @param weekAccumPremSun the weekAccumPremSun to set
	 */
	public void setWeekAccumPremSun(BigDecimal weekAccumPremSun) {
		this.weekAccumPremSun = weekAccumPremSun;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumPremSun(BigDecimal amount) {
		weekAccumPremSun = weekAccumPremSun.add(amount);
	}

	/**
	 * @return the weekAccumPremLeadT
	 */
	public BigDecimal getWeekAccumPremLeadT() {
		return weekAccumPremLeadT;
	}

	/**
	 * @param weekAccumPremLeadT the weekAccumPremLeadT to set
	 */
	public void setWeekAccumPremLeadT(BigDecimal weekAccumPremLeadT) {
		this.weekAccumPremLeadT = weekAccumPremLeadT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumPremLeadT(BigDecimal amount) {
		weekAccumPremLeadT = weekAccumPremLeadT.add(amount);
	}

	/**
	 * @return the weekAccumHoliday
	 */
	public BigDecimal getWeekAccumHoliday() {
		return weekAccumHoliday;
	}

	/**
	 * @param weekAccumHoliday the weekAccumHoliday to set
	 */
	public void setWeekAccumHoliday(BigDecimal weekAccumHoliday) {
		this.weekAccumHoliday = weekAccumHoliday;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void addWeekAccumHoliday(BigDecimal amount) {
		weekAccumHoliday = weekAccumHoliday.add(amount);
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
	
}
