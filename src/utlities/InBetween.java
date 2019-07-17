package utlities;

public class InBetween {
	
	private static boolean inBetween(int num, int min, int max){
		return min<=num && num<max;
	}

	public static void main(String[] args) {
		System.out.println(inBetween(12, -1, 13));
	}
}
