package lab;
import java.util.Scanner;

public class datetime {


	

	    private int year;
	    private int month;
	    private int day;

	    public datetime(String dt) {
	        String[] values = dt.split("[-./]");
	        this.year = Integer.parseInt(values[0]);
	        this.month = Integer.parseInt(values[1]);
	        this.day = Integer.parseInt(values[2]);
	    }

	    private int getyearcode(int year) {
	        return (year % 100 + (year % 100) / 4) % 7;
	    }

	    private int getmonthcode(int month) {
	        switch (month) {
	            case 1: return 0;  
	            case 2: return 3; 
	            case 3: return 3;  
	            case 4: return 6;   
	            case 5: return 1;  
	            case 6: return 4;  
	            case 7: return 6;  
	            case 8: return 2;  
	            case 9: return 5;  
	            case 10: return 0; 
	            case 11: return 3;  
	            case 12: return 5;  
	            default: return 0;
	        }
	    }

	    private int getcenturycode(int century) {
	        switch (century) {
	            case 17: return 4;
	            case 18: return 2;
	            case 19: return 0;
	            case 20: return 6;
	            case 21: return 4;
	            case 22: return 2;
	            case 23: return 0;
	            default: return 0;
	        }
	    }

	    private int getleapyearcode(int year, int month) {
	        boolean isLeap = false;

	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            isLeap = true;
	        }

	        if (isLeap && (month == 1 || month == 2)) {
	            return 1;
	        }

	        return 0;
	    }

	    private int dayofweek() {
	        int yearCode = getyearcode(year);
	        int monthCode = getmonthcode(month);
	        int centuryCode = getcenturycode(year / 100);
	        int leapYearCode = getleapyearcode(year, month);

	        int result = (yearCode + monthCode + centuryCode + day - leapYearCode) % 7;

	        return result;
	    }

	    public void printdayofweek() {
	        int code = dayofweek();
	        String dayName = "";

	        switch (code) {
	            case 0: dayName = "Sunday"; break;
	            case 1: dayName = "Monday"; break;
	            case 2: dayName = "Tuesday"; break;
	            case 3: dayName = "Wednesday"; break;
	            case 4: dayName = "Thursday"; break;
	            case 5: dayName = "Friday"; break;
	            case 6: dayName = "Saturday"; break;
	        }

	        System.out.println(year + " onii " + month + "-r sariin " + day + " bol " + dayName);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ognoo oruulna uu: ");
	        String input = sc.nextLine();

	        datetime dt = new datetime(input);
	        dt.printdayofweek();
	    }
	}

