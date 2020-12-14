package enshu5;

public class ForShape2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//①
	/*System.out.println("***");
	System.out.println("**");
	System.out.println("*");*/


	//②
	/*for(int i = 0; i<3-i; i++) {
		System.out.print("*");


	}
	System.out.println("");
	*/

	//③
		for(int i = 3; i>0; i--) {
			for(int j = 0; j<4-i; j++) {
				System.out.print("*");
				}
			    System.out.println("");
			}


		}
}


