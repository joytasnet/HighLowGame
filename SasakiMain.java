import java.util.*;
public class SasakiMain{
	public static void main(String[] args){
		int correct = new Random().nextInt(99)+1;
		int ans = 0;
		int count = 0;
		System.out.println("1から99の値を1つ生成したよ。");
		do{
			count++;
			System.out.print("いくつかな？>>");
			ans = new Scanner(System.in).nextInt();
			if(ans < correct){
				System.out.println("もっと上だよ");
			}else{
				System.out.println("もっと下だよ");
			}
		}while(ans != correct);
		System.out.println("正解！");
		System.out.println(count + "回で正解したよ");
	}
}
