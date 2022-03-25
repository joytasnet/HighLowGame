import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		int pcn = new Random().nextInt(99)+1;
		int count = 0;
		System.out.println("1から99までの値を1つ生成したよ。");
		while(true){
			count++;
			System.out.print("いくつかな？>>");
			int pln = new Scanner(System.in).nextInt();
			if(pcn > pln){
				System.out.println("もっと上だよ");
			}else if(pcn < pln){
				System.out.println("もっと下だよ");
			}else{
				System.out.println("正解！");
				break;
			}
		}
		System.out.println(count+"回で正解したよ。");
	}
}
