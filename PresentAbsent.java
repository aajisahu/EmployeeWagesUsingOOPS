package Day8_Programs;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Employee {

	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);

	final int FullDay = 8;
	final int WageParHour = 20;
	final int empPresent = 1;
	final int empPartTime=0;
	final int empPartTimeHrs=4;
	final int WorkingDayParMonth = 20;
	final int WarkingHourDay = 100;



	public void Compute() {

		//Generating random value from 0 to 2
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;

		Log.info("**** Using Class and Method ****");
		System.out.println();

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
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
	public static void main(String[] args) {
		Scanner multiple=new Scanner(System.in);
		int countCompany=0;
		
		Log.info("Compute Employee Wage for multiple companies \n Select how many company");
		int mul=multiple.nextInt();
		multiple.close();
		
		
		//it will generate employee wages for number of time user want ro perform
		while(mul !=0) {
		countCompany=countCompany+1;
		
		Log.info("");
		Log.info("Compony :"+countCompany);
		Employee object=new  Employee();
		object.Compute();
		mul--;
		}
	}  

}