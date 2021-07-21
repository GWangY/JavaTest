
public class Judag {

	public static void main(String[] args) {
		// 定义要匹配的Email地址
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1="aaaa@";
		String str2="bbbb@hdhhd";
		String str3="wangyan@163.com";
		String str4="Wangyan@163.vip.com";
		if(str1.matches(regex)) {
			System.out.println(str1+" 是一个合格的邮箱");
		}
		if(str2.matches(regex)) {
			System.out.println(str2+" 是一个合格的邮箱");
		}
		if(str3.matches(regex)) {
			System.out.println(str3+" 是一个合格的邮箱");
		}
		if(str4.matches(regex)) {
			System.out.println(str4+" 是一个合格的邮箱");
		}

	}

}
