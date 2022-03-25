import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		int count=0;
		int rnd = new Random().nextInt(99)+1;
		System.out.println("1から99の値を１つ生成したよ。");
		while(true){
			count++;
			System.out.println("いくつかな？>>");
			int n = new Scanner(System.in).nextInt();
			if(n == rnd){
				break;
			}else if(n < rnd){
				System.out.println("もっと上だよ");
			}else{
				System.out.println("もっと下だよ");
			}
		}
		System.out.println(count + "回で正解したよ。");
	}
}
