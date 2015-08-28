package io.lambda.main;

import java.util.Calendar;
import java.util.Date;

public class TestMain {

	public static void main(String[] args) {

		String end = "18:10";
		String start = "10:00";
		String [] endList = end.split(":");
		String [] startList = start.split(":");

		Date endDate = getDaySet(2015, 8, Integer.parseInt(endList[0]), Integer.parseInt(endList[1]), 0);
		System.out.println(" endDate >>> " + endDate);
		Date startDate = getDaySet(2015, 8, Integer.parseInt(startList[0]), Integer.parseInt(startList[1]), 0);
		System.out.println(" startDate >>> " + startDate);

		long lngEndTime = endDate.getTime();
		long lngStartDate = startDate.getTime();
		long lngStayTime = lngEndTime - lngStartDate;

		System.out.println(" >>> " + convertTimeToString(lngStayTime));

	}

	public static String convertTimeToString(long diffTime) {

		long longHour = diffTime / (60 * 60 * 1000) % 24;
        long longMinutes = diffTime / (60 * 1000) % 60;

		return String.format("%02d:%02d", longHour,longMinutes);
	}

	public static Date getDaySet(int year, int month, int day, int hour, int minute) {

		Calendar calDay = Calendar.getInstance();
		calDay.set(year, month-1, day);
		calDay.set(Calendar.HOUR_OF_DAY, hour);
		calDay.set(Calendar.MINUTE, minute);
		calDay.set(Calendar.SECOND, 0);

		return calDay.getTime();
	}

}