package Day8_Programs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Employee {

	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);

	//Constrants declaration
	private static final int FullDay = 8;
	private static final int WageParHour = 20;
	private static final int empPresent = 1;
	private static final int empPartTime=0;
	private static final int empPartTimeHrs=4;
	private static final int WorkingDayParMonth = 20;
	private static final int WarkingHourDay = 100;
	// CREATED CONSTRUCTOR
	public Employee() {

		//Generating random value from 0 to 2
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;

		Log.info("**** Using Switch Statements ****");
		Log.info("");
		
		switch (empCheck) //if random value is 1 then employee full time
		{
		case empPresent:
			
			int dailyWage = FullDay*WorkingDayParMonth*WarkingHourDay;
			Log.info("Employee is Full Time Present");
			Log.info("Employee Daily 20 Day and 100 Hrs Wage Is : "+ dailyWage);
			
			break;

		case empPartTime: //if random value is 0 then employee is part time
			int partTimeWage=empPartTimeHrs*WorkingDayParMonth*WarkingHourDay;
			Log.info("Employee is Part Time Present");
			Log.info("Employee Part Time 20 Day and 100 Hrs Wage Is : "+ partTimeWage);
			break;


		default://if random value is 2 then employee is absent
			Log.info("Employee is Absent");
		
		}

	}
}

public  class PresentAbsent{
	public static void main(String[] args) {
		new  Employee();//CREATING OBJECT OF THE CLASS SO CONSTRUCTOR AUTOMATICALLY CALLED
	}  
	
}