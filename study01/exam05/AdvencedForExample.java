package exam05;

public class AdvencedForExample {
	public static void main(String[] argc) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		for(int score: scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합: "+ sum);
	}
}
