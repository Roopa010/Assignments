package programs;

public class Operators {

	public static void main(String[] args) {
		String[] names = {"Suresh","Mahesh","Naresh"};
		int[] marks = {75, 80, 82};
		float avg = 0;
		int sum = 0;
		
		System.out.println("Updated Marks:");
		
		for(int i = 0; i< 3; i++) {
			marks[i] += 10;
			//System.out.println("" + marks[i]);
		}
		
		for(int mark : marks) {
			System.out.println(mark);
		}

	}
}

