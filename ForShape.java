package enshu5;

public class ForShape {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//③
		/*	for(int i = 1; i <= 3; i++) {
				for(int j = 1; j<=3; j++) {
					System.out.print("*");

				}
				System.out.println();
			}
			*/
		//①
		/*System.out.println("***");
		System.out.println("***");
		System.out.println("***");*/
		//②
		for(int i = 1; i <=3; i++) {
			System.out.println("***");
	//別解
	/*for(int i =0; i<9; i++) {
		if(i%3==2){
			System.out.println("*");
		}else {
			System.out.print("*");
		}
	}*/
		}
	}

}
