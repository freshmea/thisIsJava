package exam06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar1 = new Car("노란색", 3000);
		Car Cars[] = {myCar, myCar1};
		for(Car car:Cars) {
			System.out.println("제작회사 : "+car.company);
			System.out.println("모델명 : "+car.model);
			System.out.println("색깔 : "+car.color);
			System.out.println("cc : "+car.cc);
			
			myCar.speed = 60;
			System.out.println("수정된 속도: "+car.speed);
		}
		
	}
}
