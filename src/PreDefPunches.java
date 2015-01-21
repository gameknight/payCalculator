import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author gfystro
 *
 */
public class PreDefPunches {
	private final static String HRS0 = new String("0");
	private final static String HRS8B = new String("8");
	private final static String HRS8 = new String("8.2");
	private final static String HRS11 = new String("11.2");
	private final static String TR = "true";
	private final static String FA = "false";
	private static List<String> noWork = Arrays.asList(HRS0, FA, FA, FA);
	private static List<String> wdBackUp = Arrays.asList(HRS8B, FA, FA, FA);
	private static List<String> wdDay = Arrays.asList(HRS8, FA, FA, FA);
	private static List<String> wdAftn = Arrays.asList(HRS8, TR, FA, FA);
	private static List<String> wdOvrn = Arrays.asList(HRS8, FA, TR, FA);
	private static List<String> weAftn = Arrays.asList(HRS11, FA, FA, FA);
	private static List<String> weAftnSun = Arrays.asList(HRS11, FA, FA, TR);
	private static List<String> weOvrn = Arrays.asList(HRS11, FA, TR, FA);
	private static List<String> weOvrnSun = Arrays.asList(HRS11, FA, TR, TR);
	protected static List<List<String>> buDay = Arrays.asList(wdBackUp, wdBackUp, wdBackUp, wdBackUp, wdBackUp, noWork, noWork, wdDay, wdDay, wdDay, wdDay, wdDay, noWork, noWork);
	protected static List<List<String>> dayAftn = Arrays.asList(wdDay, wdDay, wdDay, wdDay, wdDay, noWork, noWork, noWork, noWork, wdBackUp, wdAftn, wdAftn, weAftn, weAftnSun);
	protected static List<List<String>> aftnAftn = Arrays.asList(noWork, noWork, wdBackUp, wdAftn, wdAftn, weAftn, weAftnSun, wdAftn, wdAftn, wdAftn, noWork, noWork, weOvrn, weOvrnSun);
	protected static List<List<String>> AftnOvrn = Arrays.asList(wdAftn, wdAftn, wdAftn, noWork, noWork, weOvrn, weOvrnSun, wdOvrn, wdOvrn, wdOvrn, wdOvrn, wdOvrn, noWork, noWork);
	protected static List<List<String>> OvrnBu = Arrays.asList(wdOvrn, wdOvrn, wdOvrn, wdOvrn, wdOvrn, noWork, noWork, wdBackUp, wdBackUp, wdBackUp, wdBackUp, wdBackUp, noWork, noWork);
}
