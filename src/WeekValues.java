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

	private final String INFO_FORMAT = "string";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public WeekValues() {
		zeroWeek();
	}

	public void zeroWeek() {
		weekAccumHrs = new BigDecimal(0);
	}

	public BigDecimal getWeekAccumHrs() {
		return weekAccumHrs;
	}

	public void setWeekAccumHrs(BigDecimal week1AccumHrs) {
		this.weekAccumHrs = week1AccumHrs;
	}

	public String getINFO_FORMAT() {
		return INFO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void add(BigDecimal amount) {
		weekAccumHrs = weekAccumHrs.add(amount);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public String showInfo() {
		// TODO implement me
		return "";
	}

}
