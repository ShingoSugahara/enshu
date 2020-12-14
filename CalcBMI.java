package enshu5;
import java.util.Scanner;
public class CalcBMI {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int tall =0;
		double weight = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("身長をCMで入力してください：");
		tall =scanner.nextInt();
		
		System.out.print("体重をKgで入力してください：");
		weight = scanner.nextDouble();
		
		
		//標準体重の計算式は
		//標準体重　=　２２ Ｘ 身長(m) Ｘ 身長(m)
		double standard =0;
		double tall2= (double)tall/100;
		double bmi =0;
		bmi = weight/(tall2*tall2);
		
		standard = 22 * tall2 * tall2;
		System.out.printf("あなたの身長%dcmの標準体重%.2fです。%n",tall,standard);
		System.out.printf("あなたの体重%.1fKgのBMIは%.2fです。%n",weight,bmi);
	}

}
