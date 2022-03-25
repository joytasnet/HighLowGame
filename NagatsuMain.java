import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		int n = new Random().nextInt(99)+1;
		System.out.println("1から99の値を１つ生成したよ。");
		int count = 0;
		while(true){
			count++;
			System.out.print("いくつかな？>>");
			int you = new Scanner(System.in).nextInt();
			if(you == n){
				System.out.println("正解！");
				System.out.println(count + "回で正解したよ。");
				break;
			}else if(you < n){
				System.out.println("もっと上だよ");
			}else{
				System.out.println("もっと下だよ");
			}
		}
	}
}
