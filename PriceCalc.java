package shoping;

public class PriceCalc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 300 + 1000;
		//int j = 1000;
		double TAX = 1.1;
		//double k = (i * TAX) + (j * TAX) + 300; 
		double k = i * TAX + 300;
		int ik = (int)k;
		
		System.out.println("「お会計は" + ik + "円です。」" );
		
	}

}
