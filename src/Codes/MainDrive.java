package Codes;

public class MainDrive {

	public static void main(String[] args) {

//		System.out.println(Math.random());

		System.out.println(Math.PI);

//		Math.random 예시 - 확률

//		10% 1등, 25% 2등, 65% (그외) 낙첨

		double random = Math.random();

		if (random < 0.1) {
			System.out.println("1등");
		} else if (random < 0.35) {
			System.out.println("2등");
		} else {
			System.out.println("낙첨");
		}

//		sqrt 예시 

		double sqrtTest = Math.sqrt(38.125);
		System.out.println(sqrtTest);

//		pow 예시

		double powTest = Math.pow(2.5, 3.7);
		System.out.println(powTest);

	}

}
