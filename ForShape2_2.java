package enshu5;
import java.util.Scanner;
public class ForShape2_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int imput = 0;
		System.out.print("段数を入力してください：");
		Scanner scanner = new Scanner(System.in);
		imput = scanner.nextInt();

		for(int i = 0; i<imput; i++) {
			for(int j = 0; j<(imput-i); j++) {
				System.out.print("*");
				}
			    System.out.println();
			}

	}

}
