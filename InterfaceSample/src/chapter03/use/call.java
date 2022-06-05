package chapter03.use;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;

public class call {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calculator calculator = new AddCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("the answer is" + result +".");
	}

}
