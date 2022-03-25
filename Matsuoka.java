import java.util.*; public class Matsuoka{
	public static void main(String[] args){
		int randomnum,count=0,usernum;
		System.out.println("1~99の乱数を生成したよ");
		randomnum=new Random().nextInt(99)+1;
		do{
			System.out.print("いくつかな？>>");
			usernum=new Scanner(System.in).nextInt();
			count++;
			if(usernum==randomnum){
				System.out.println(count+"回で正解");
			}
			if(usernum>randomnum){
				System.out.println("もっとしただよ～");
			}else{
				System.out.println("もっとうえだよ～");
			}
		}while(randomnum!=usernum);
	}
}
