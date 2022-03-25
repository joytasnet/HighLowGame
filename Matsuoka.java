import java.util.*; public class Matsuoka{
	public static void main(String[] args){
		int randomnum,count=0,usernum;
		System.out.println("1~99の乱数を生成したよ");
		randomnum=new Random().nextInt(99)+1;
		System.out.print("いくつかな？>>");
		usernum=new Scanner(System.in).nextInt();
		do{
			if(usernum>randomnum){
				System.out.println("もっとしただよ～");
				System.out.print("いくつかな？>>");
				usernum=new Scanner(System.in).nextInt();
			}else if(usernum<randomnum){
				System.out.println("もっとうえだよ～");
				System.out.print("いくつかな？>>");
				usernum=new Scanner(System.in).nextInt();
			}
		}while(randomnum!=usernum);
		System.out.println("正解");
	}
}
