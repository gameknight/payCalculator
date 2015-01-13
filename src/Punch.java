import java.math.BigDecimal;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 */

public class Punch {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal hoursYesOT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private BigDecimal hoursNoOT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private Boolean usePremAftn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private Boolean usePremOvrn;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private Boolean usePremSun;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private Boolean usePremLeadT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	private Boolean useHoliday;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */

	private final String INFO_FORMAT = "Punch Info:%n" 
		+ "Hours (OT):       %4.1f%n"
		+ "Hours (Non-OT):   %4.1f%n"
		+ "Operator Premium:  %s%n"
		+ "Evening Premium:   %s%n"
		+ "Overnight Premium: %s%n"
		+ "Sunday Premium:    %s%n"
		+ "Lead Tech Premium: %s%n"
		+ "Holiday:           %s%n";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Punch() {
		super();
		hoursYesOT = new BigDecimal("0.00");
		hoursNoOT = new BigDecimal("0.00");
		usePremAftn = new Boolean(false);
		usePremOvrn = new Boolean(false);
		usePremSun = new Boolean(false);
		usePremLeadT = new Boolean(false);
		useHoliday = new Boolean(false);
	}

	public BigDecimal getHoursYesOT() {
		return hoursYesOT;
	}

	public void setHoursYesOT(BigDecimal hoursYesOT) {
		this.hoursYesOT = hoursYesOT;
	}

	public BigDecimal getHoursNoOT() {
		return hoursNoOT;
	}

	public void setHoursNoOT(BigDecimal hoursNoOT) {
		this.hoursNoOT = hoursNoOT;
	}

	public Boolean getUsePremAftn() {
		return usePremAftn;
	}

	public void setUsePremAftn(Boolean usePremAftn) {
		this.usePremAftn = usePremAftn;
	}

	public Boolean getUsePremOvrn() {
		return usePremOvrn;
	}

	public void setUsePremOvrn(Boolean usePremOvrn) {
		this.usePremOvrn = usePremOvrn;
	}

	public Boolean getUsePremSun() {
		return usePremSun;
	}

	public void setUsePremSun(Boolean usePremSun) {
		this.usePremSun = usePremSun;
	}

	public Boolean getUsePremLeadT() {
		return usePremLeadT;
	}

	public void setUsePremLeadT(Boolean usePremLeadT) {
		this.usePremLeadT = usePremLeadT;
	}

	public Boolean getUseHoliday() {
		return useHoliday;
	}

	public void setUseHoliday(Boolean useHoliday) {
		this.useHoliday = useHoliday;
	}

	public String getINFO_FORMAT() {
		return INFO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */

	public void reset() {
		// TODO
	}

	public String showInfo() {
		// TODO implement me
		System.out.printf(INFO_FORMAT,hoursYesOT.doubleValue(),
		hoursNoOT.doubleValue(),getHoursNoOT().toString(),
		usePremAftn.toString(),usePremOvrn.toString(),
		usePremSun.toString(),usePremLeadT.toString(),
		useHoliday.toString());
		return "";
	}

}
