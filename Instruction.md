## Disclaimer:- Fork this repl into your account.

## Instructions

### Part-I
---

- `CustomTime` Class Definition
```java
  public class CustomTime {
      int hour;
      int minute;
      int second;
      public CustomTime()
        { /* constructor implementation */ }
      void setTime(int newHour, int newMinute, int newSecond)
          { /* mutator implementation */ }
      int[] getTime()
          { /* accessor implementation */ }
      void incrementTime()
          { /* mutator implementation */ }
  };
```
1. Compile and run the program.
2. Look at the output. Does it make sense? Why or why not?

### Part-II
--- 

1. Add the following lines to `Main.java` just before the end of the `main` method:

```java
  currTime.hour = 31;
  currTime.minute = -10;
  currTime.second = 450;
  temp = currTime.getTime();
  hr = temp[0];
  min = temp[1];
  sec = temp[2];
  System.out.println(
  "After direct assignment, the current military time is: "
  + hr + ":" + min + ":" + sec
  );
```
2. Compile and run the program.
3. Look at the new output. Does it make sense? Why or why not?
4. We need to fix the problem caused by declaring the data in the CustomTime class as public.
5. Change CustomTime.java to make the 3 data declarations private. Compile the program. What happens? Why?
6. Remove the lines that were added to Main.java in step 1 above.
7. Compile and run the program.

### Part-III
--- 
1. Change the call `currTime.setTime(20, 15, 43);`  in Main.java to the following:
```java
  currTime.setTime(-55, 99, 1025);
```
2. Compile and run the program.
3. Look at the new output. Does it make sense? Why or why not?

### Part-IV
--- 
1. Let’s fix the setTime() method. 
```java
  void setTime(int newHour, int newMinute, int newSecond) {
          if (newHour >= 0 &&  newHour <= MAX_HOURS) {
              hour = newHour;
          }
          else {
              System.out.println("Error: hour must be between 0 and 23 inclusive");
              hour = 0;
          }
          if (newMinute >= 0  && newMinute <= MAX_MIN_SECS) {
              minute = newMinute;
          }
          else {
              System.out.println("Error: minute must be between 0 and 59 inclusive");
              minute = 0;
          }
          if (newSecond >= 0 && newSecond <= MAX_MIN_SECS) {
              second = newSecond;
          }
          else {
              System.out.println("Error: second must be between 0 and 59 inclusive");
              second = 0;
          }
  }
```
2.  Compile and run the program.

3.  Why is this version of the setTime() method more secure than the previous version?

4.  Look at the new output. Does it make sense? Why or why not?

5.  Change the call to `currTime.setTime(20, 15, 43);` in Main.java to the following:
```java 
  currTime.setTime(-23, 59, 59);
```
Compile and run the program.
6.  Look at the new output. Does it make sense? Why or why not?

### Part- V
---
1. Add an appropriate constructor to the Time class. 
2. What values should be used to initialize hour, minute, and second in the constructor? Why are these times appropriate?
3. Compile and run the program.
### Part - VI
---
1. Change the call to `currTime.setTime(-23, 59, 59);`  in Main.java to the following:
```java 
   currTime.setTime(20, 15, 43);
```
2. Let's fix the `incrementTime()` method
```java
void incrementTime () {
        second = ++second % (MAX_MIN_SECS + 1);
        if(second == 0) {
            minute = ++minute % (MAX_MIN_SECS + 1);
        }
        if(second == 0 && minute == 0) {
            hour = ++hour % (MAX_HOURS + 1);
        }
}

```
3.    Compile and run the program.

4.    Look at the new output. Does it make sense? Why or why not?

5.   Why is this version of the incrementTime() method more secure than the original version?







