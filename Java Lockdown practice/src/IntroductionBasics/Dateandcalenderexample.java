package IntroductionBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateandcalenderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		System.out.println(sdf.format(d));
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DECEMBER));


		
		}

}
