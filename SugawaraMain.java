import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		int count=0;
		int rnd = new Random().nextInt(98)+1;
		int ans;
		System.out.println("1~99までの数字を１つ生成したよ");
		do{
			count++;
			System.out.println("いくつかな？>>");
			ans = new Scanner(System.in).nextInt();
			if(rnd > ans){
				System.out.println("もっと上だよ");
			}else if(rnd < ans){
				System.out.println("もっと下だよ");
			}
		}while(rnd != ans);
			System.out.println(count+"回目で正解したよ！");
	}
}
