package Day8_Programs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Employee {

	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
	
	private static final int FullDay = 8;
	private static final int WageParHour = 20;
	private static final int empPresent = 1;

	public Employee() {
		// created constructor

		int empCheck = (int)Math.floor(Math.random() * 10) % 2;
				
		if (empCheck == empPresent)
		{
			int dailyWage = FullDay*WageParHour;
			Log.info("Employee is Present");
			Log.info("Employee Daily Wage Is : "+ dailyWage);
		}
		else {
			Log.info("Employee is Absent");
		}
	}
}

public  class PresentAbsent{
	public static void main(String[] args) {
		new Employee(); 
		//CREATING OBJECT OF THE CLASS SO CONSTRUCTOR AUTOMATICALLY CALLED

	}
}