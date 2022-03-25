import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		int correct = new Random().nextInt(99)+1;
		System.out.println("1から99の値を1つ生成したよ。");
		int input;
		int count = 0;

		do{
			count++;
			System.out.print("いくつかな？>>");
			input = new Scanner(System.in).nextInt();
			if(input > correct ){
				System.out.println("もっと下だよ");
			}else if(input < correct){
				System.out.println("もっと上だよ");
			}else{
				System.out.println("正解！");
			}
		}while(input != correct);
		System.out.println(count + "回で正解したよ。");
	}
}
