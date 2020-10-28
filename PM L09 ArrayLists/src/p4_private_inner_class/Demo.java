package p4_private_inner_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Cathy", 4.0, 80);
		Student s2 = new Student("Billy", 2.5, 50);
		Student s3 = new Student("Frankie", 3.5, 60);
		Student s4 = new Student("Sammy", 1.5, 20);
		
		ArrayList<Student> myList = new ArrayList<>();
		myList.add(s1);
		myList.add(s2);
		myList.add(s3);
		myList.add(s4);
		
		System.out.println(myList);
		Collections.sort(myList, (new Demo()).new StudentComparator());
		System.out.println(myList);
		
		
		System.out.println();
		
		
		Student[] students = {s1, s2, s3, s4};
		System.out.println(Arrays.toString(students));
		Arrays.sort(students, (new Demo().new StudentComparator()));
		System.out.println(Arrays.toString(students));
	}
	
	private class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return Double.compare(o1.getGpa(), o2.getGpa());
		}
		
	}

}
