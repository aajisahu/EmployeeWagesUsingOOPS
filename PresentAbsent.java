package Day8_Programs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Employee {

	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
	private static final  int IS_PRESENT=1;

	public Employee() {
	 // created constructor

		Log.info("Welcome to Employee Wage Computation Using OOPS concept");

		int empCheck = (int)Math.floor(Math.random() * 10) % 2; //generating random number
		
		if (empCheck == IS_PRESENT) {

			Log.info("Employee is Present");
		}
		else {
			Log.info("Employee is Absent");
		}
	}
}


public  class PresentAbsent{
	public static void main(String[] args) {
				new Employee();
		
	}
}