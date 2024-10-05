# Basic-java-Projects

# java_calender_project_1

# My Calendar Project

This is a simple calendar application written in Java that displays the calendar for a specific month and year.

## Features
- Displays the calendar for any month of any year.
- Shows the days of the week starting from Sunday.
- Neatly formats the days in rows corresponding to weeks.

## How It Works
- The program uses Java's `GregorianCalendar` class to determine the number of days in the month and the day of the week the month starts on.
- The program first asks for user input of the year and month.
- It then generates and prints the calendar for the specified month.

## Code Example

Here’s a brief look at how the main part of the program works:

```java
GregorianCalendar calendar = new GregorianCalendar(year, month-1, 1);
int daysInMonth = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
int startDay = calendar.get(calendar.DAY_OF_WEEK);
```

**Calendar header**
```java
System.out.println(" " + calendar.getDisplayName(calendar.MONTH, calendar.LONG, java.util.Locale.ENGLISH) + " " + year);
System.out.println(" su mo tu we th fr sa");
```
This code sets up a GregorianCalendar object with the specified year and month. It then calculates the number of days in the month and the day of the week the month starts. Based on this, it prints the formatted calendar.


**Example OutPut:**

```
 enter year:2024
 enter month(1-12):10
 October 2024
 su mo tu we th fr sa
       1  2  3  4  5 
 6  7  8  9 10 11 12 
13 14 15 16 17 18 19 
20 21 22 23 24 25 26 
27 28 29 30 31
```
