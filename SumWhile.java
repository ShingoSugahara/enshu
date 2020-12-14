package enshu5;

public class SumWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum =0;
		int i = 1;
		while(i<=100) {
			 sum += i;
			 System.out.println(i +"を加えました");
			 i++;
		}
		System.out.println("合計は"+sum+"です" );
	}

}
