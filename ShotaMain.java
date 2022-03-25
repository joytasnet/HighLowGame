import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		System.out.println("1~99の値を1つ生成したよ");
		int n=0;
		int number=new Random().nextInt(99)+1;
		int count=0;

		do{
			count++;
			System.out.print("いくつかな？>>");
			n  = new Scanner(System.in).nextInt();
			if(n>number){
				System.out.println("もっと下だよ");
			}
			else if(n<number){
				System.out.println("もっと上だよ");
			}
		}while(n!=number);
		System.out.println("正解！");
		System.out.println(count+"回で正解したよ。");

	}
}

