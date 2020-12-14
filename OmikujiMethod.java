import java.util.Random;
public class OmikujiMethod {

	public static int random(){
		Random rand = new Random();
		return  rand.nextInt(101);
	}
	public static String setResult(int luck) {
		  String fortune;
		if (0<=luck  && luck<=10) {
			 fortune = "大吉";
			
		}else if(11<=luck && luck<=60) {
			 fortune ="中吉";
			
		}else if(61<=luck && luck<=90) {
			 fortune ="末吉";
			
		}else if(91<=luck && luck<=100){
			 fortune ="凶";
			}
		else {
			 fortune ="無効な数値です";
		}
			return  fortune;
	
		
	}

	public static void showResult(int luck,String fortune) {
		System.out.println("あなたの運勢は"+luck+fortune+"です。");
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int luck = 0;
		String fortune = "";
		
		luck = random();//乱数を作るメソッドの呼び出し
		fortune = setResult(luck);//乱数から運勢の決定
		showResult(luck,fortune);//結果の表示
		
		
	}

}
