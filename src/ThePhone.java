import java.util.Scanner;

public class ThePhone {

	public static void main(String[] args) {
		//验证输入手机号
		Scanner sc=new Scanner(System.in);//从键盘接收数据
		String regex="(13[0-9]|15[12356789]|18[056789])\\d{8}";
		while(true) {
			//知识点:next()next()一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，
			//next()方法会自动将其去掉，只有在输入有效字符之后，next()方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。
			//比如，在控制台输入“  gjm  gjm ”时，一次next()读入进来的仅仅是"gjm"。它不能得到带空格的字符串的！
			//nextLine()方法的结束符只是Enter键，即nextLine()方法返回的是Enter键之前的所有字符
			String phone=sc.nextLine();//接收数据
			if(phone.matches(regex)) {
				System.out.println("您输入是手机号");
			}else {
				System.out.println("您输入不是手机号");
			}
		}
	}

}
