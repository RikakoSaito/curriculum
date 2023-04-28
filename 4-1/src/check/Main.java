package check;
import constants.Constants;

public class Main {
	//	課題①
	private static String firstName = "Saito";
	private static String lastName = "Rikako";

	public static void main(String[] args) {
		Main.printName(firstName, lastName);

		//課題③
		Pet p = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		p.introduce();
		RobotPet rPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rPet.introduce();
	}
	
	//課題②
	private static final void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド　→　" + firstName + lastName);
	}
}
 