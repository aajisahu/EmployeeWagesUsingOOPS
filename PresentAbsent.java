package Day8_Programs;


import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface EmployeeBuilder{
	final int FullDay = 8;
	final int WageParHour = 20;
	final int empPresent = 1;
	final int empPartTime=0;
	final int empPartTimeHrs=4;


	public int Compute();
	
}


class Employee implements EmployeeBuilder  {

	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
	static int WorkingDayParMonth = 20;
	static int WarkingHourDay = 100;
	int storeDailyFullTime=8;
	int storeDailyPartTime=4;
	static int store;


	public int Compute() {
		Scanner sc=new Scanner(System.in);

		Log.info("Enter Total Working Hrs: ");
		Employee.WorkingDayParMonth=sc.nextInt();

		Log.info("Enter Total Working Day: ");
		Employee.WarkingHourDay=sc.nextInt();


		//Generating random value from 0 to 2
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;

		System.out.println();

		switch (empCheck) //if random value is 1 then employee full time
		{
		case empPresent:

			store=storeDailyFullTime*WageParHour;

			int dailyWage = FullDay*WorkingDayParMonth*WarkingHourDay;
			Log.info("Employee is Full Time Present");
			Log.info("Daily Wage Full Time: "+Employee.store);
			return dailyWage;


		case empPartTime: //if random value is 0 then employee is part time

			store=storeDailyPartTime*WageParHour;
			int partTimeWage=empPartTimeHrs*WorkingDayParMonth*WarkingHourDay;
			Log.info("Employee is Part Time Present");
			Log.info("Daily Wage Part Time: "+store );
			return partTimeWage;



		default://if random value is 2 then employee is absent
			Log.info("Employee is Absent");
			return 0;
		}

	}

	
}

public  class PresentAbsent{



	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);

	public static void main(String[] args) {

		Scanner multiple=new Scanner(System.in);
		Log.info("Compute Employee Wage for multiple companies \nSelect how many company: ");
		int mul=multiple.nextInt();
		//taking user input

		int countCompany=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();  
		ArrayList<Integer> dailyFullTime=new ArrayList<Integer>();
		ArrayList<Integer> dailyPartTime=new ArrayList<Integer>();

		//it will generate employee wages for number of time user want to perform
		while(mul !=0) {
			countCompany=countCompany+1;
			System.out.println("");

			Log.info("Compony :"+countCompany);
			Employee object=new  Employee();

			dailyFullTime.add(Employee.store);
			dailyPartTime.add(Employee.store);
			arr.add(object.Compute());		//Storing the values in array list
						mul--;	
		
		}
		
		// asking user to he wants to print the total or not
		Log.info("Do You Want to Print Total: Y/N");
		char getTot=multiple.next().charAt(0);
		if (getTot =='Y'||getTot =='y' ) {
			
			Log.info("Employee Working Day:"+Employee.WorkingDayParMonth+" \nEmployee working Hrs:"+Employee.WarkingHourDay+": "+ "\nTotal is: " +arr );
				
		}
		else {
			Log.info("You Made A Wrong Choice:");
		}
		
	
	}  

}