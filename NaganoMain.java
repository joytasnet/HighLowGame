import java.util.*;
public class NaganoMain{
	public static void main(String[] args){
		System.out.println("1から99の値を１つ生成したよ。");
		int n = new Random().nextInt(99)+1;
		int count=0;
		int temp = 0;
		do{
			System.out.print("いくつかな？>>");
			count++;
			temp = new Scanner(System.in).nextInt();
			if(temp > n){
				System.out.println("もっと下だよ");
			}else if(temp < n){
				System.out.println("もっと上だよ");
			}
		}while(temp != n);
		System.out.println("正解！");
		System.out.println(count + "回で正解したよ！");
	}
}
