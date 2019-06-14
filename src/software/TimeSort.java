package software;

import java.util.Comparator;

import java.util.*;

public class TimeSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		long timedif=o1.time.getTime() - o2.time.getTime();
		
		return (int) timedif;
	}  
} 
