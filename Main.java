public class Main {
	public static void main(String[] args) {
		CustomTime currTime = new CustomTime();  // object that stores the current time
		int hr;         // current hour obtained from currTime
		int min;        // current minute obtained from currTime
		int sec;        // current second obtained from currTime
		
		int[] temp;		// for using getTime()

     // setTime (int newHour, int newMinute, int newSecond) 
		currTime.setTime(20, 15, 43);
    
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		
		System.out.println(
				"The current time is set to: "
						+ hr + ":" + min + ":" + sec
				);

		
		currTime.incrementTime();
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		
		System.out.println(
				"After incrementing the time, the current time is: "
						+ hr + ":" + min + ":" + sec
				);
	}
}
