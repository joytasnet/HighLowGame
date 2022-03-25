import java.util.*;
public class MorozumiMain{
	public static void main(String [] args){
		int r = new Random().nextInt(99)+1;
		System.out.println("1から99の値を一つ生成したよ。いくつかな?>>");
		int imput;
		int count = 0;
		do{
			count++;
			imput = new Scanner(System.in).nextInt();
			if(r > imput){
				System.out.println("もっと上だよ。いくつかな?");
			}else if(r < imput){
				System.out.println("もっと下だよ。いくつかな?");
			}
		}while(r != imput);
		System.out.println( "正解！");
		System.out.println(count + "回で正解だよ。");
	}
}
