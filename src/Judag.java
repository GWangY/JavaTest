
public class Judag {

	public static void main(String[] args) {
		// ����Ҫƥ���Email��ַ
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1="aaaa@";
		String str2="bbbb@hdhhd";
		String str3="wangyan@163.com";
		String str4="Wangyan@163.vip.com";
		if(str1.matches(regex)) {
			System.out.println(str1+" ��һ���ϸ������");
		}
		if(str2.matches(regex)) {
			System.out.println(str2+" ��һ���ϸ������");
		}
		if(str3.matches(regex)) {
			System.out.println(str3+" ��һ���ϸ������");
		}
		if(str4.matches(regex)) {
			System.out.println(str4+" ��һ���ϸ������");
		}

	}

}
