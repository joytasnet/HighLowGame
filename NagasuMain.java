import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		int atari = new Random().nextInt(99) +1;
		System.out.print("1から99の値を1つ生成したよ。いくつかな?>> ");
		int count = 0;
		while(true){
			count++;
			int suji = new Scanner(System.in).nextInt();
				if( atari == suji){
					System.out.println(suji + " 正解！ " + count + "回で正解したよ。");
					break;
				}else if( atari >= suji){
					System.out.print("もっと上だよ いくつかな?>> ");
				}else{
					System.out.print("もっと下だよ いくつかな?>> ");
				}
		}
	}
}
