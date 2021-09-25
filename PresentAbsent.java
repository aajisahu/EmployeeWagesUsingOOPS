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

	static  int WorkingDayParMonth = 20;
	static int WarkingHourDay = 100;

	public int Compute() {
		Scanner sc=new Scanner(System.in);

		Log.info("Enter Total Working Hrs: ");
		this.WorkingDayParMonth=sc.nextInt();

		Log.info("Enter Total Working Day: ");
		this.WarkingHourDay=sc.nextInt();


		//Generating random value from 0 to 2
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;

		System.out.println();

		switch (empCheck) //if random value is 1 then employee full time
		{
		case empPresent:

			int dailyWage = FullDay*WorkingDayParMonth*WarkingHourDay;
			Log.info("Employee is Full Time Present");

			return dailyWage;


		case empPartTime: //if random value is 0 then employee is part time
			int partTimeWage=empPartTimeHrs*WorkingDayParMonth*WarkingHourDay;
			Log.info("Employee is Part Time Present");
			
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
		int index=0;
		//Increase the value and storing the result in to array


		//it will generate employee wages for number of time user want to perform
		while(mul !=0) {
			countCompany=countCompany+1;
			System.out.println("");

			Log.info("Compony :"+countCompany);
			Employee object=new  Employee();
			
			arr.add(object.Compute());		//Storing the values in array
			
			Log.info("Employee Working Day:"+object.WorkingDayParMonth+" \nEmployee working Hrs:"+object.WarkingHourDay+": "+ "\nTotal is: " +arr );
			index++;//increasing array index value 
			mul--;
		}
	}  

}