package enshu6;

public class TestScoreArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//5教科のテストの合計と平均を求める。テストの点数は教P93を参考
		//②　5教科の最大を求める。

	//①
	int scores[] = {50,55,70,80,65};
	int sum = 0;
	double ave = 0;
	int Max = 0 ;
	/*for(int i =0; i <scores.length; i++) {
		sum += scores[i]  ;

	}
	ave = (double)sum/scores.length;
	System.out.printf("d%教科の合計の値は%dです。\n",scores.length,sum);
	System.out.printf("d%教科の平均の値は%.1fです。\n",ave);
		*/
	     Max = scores[0];
		for(int i =0; i <scores.length; i++) {

			if(Max<scores[i]) {
			Max = scores[i];
			}
		}
			System.out.printf("最大の値は%dです。\n",Max);



	}

}
