
public class CallMethodExample {

	
	public static void countdown(int start) {
		System.out.println("メソッドが受け取った値："+start);
		System.out.println("カウントダウンをします");
		for(int i = start; i>= 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		countdown(3);
		countdown(10);
	}

}
