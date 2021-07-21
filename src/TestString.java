import java.util.Date;

public class TestString {

	public static void main(String[] args) {
		//str.length() 获取字符串长度 其中也包括字符串中的空格
		String str = "we are students";
		int size = str.length(); 
		System.out.println(size); //15
		
		//字符串查找 indexOf()
		String str1="we are students";
		int size1 = str.indexOf("a"); //输出结果是str1.length()-1
		System.out.println(size1); // 3
		
		//str.lastIndexOf() 用于返回指定字符串最后一次出现的索引位置
		String str2="we are students";
		int size2=str.lastIndexOf("e");
		System.out.println(size2); //11
		
		//例题:使用lastIndexOf()方法查看字符串str中 空字符串的位置
		//然后输出字符串长度 注意：lastIndexOf()方法中的参数是空字符串“” 中间没有空格
		//lastIndexOf()方法中的参数是空字符串“”  则返回结果与调用该字符串length()方法的结果相同
		String str3="we are students";
		int size3= str3.lastIndexOf("");
		System.out.println(size3);//15
		
		//charAt()获取指定索引位置的字符
		String str4="we are students";
		char mychar=str4.charAt(5);
		System.out.println("字符为:"+mychar);
		
		//获取字符串 substring(int beginIndex, int endIndex)
		String str5="hello word";
		String str6=str5.substring(0,3);
		System.out.println(str6);
		
		//去掉空格 trim() 只去掉字符串前面空格和尾部空格
		String str7 =" java class  ";
		System.out.println("原来的字符串："+str7);
		System.out.println("去掉空格之后的字符串："+str7.trim());
		
		//字符串的替换 str.replace(char oldChar,char newChar)
		//字符串的分割 str.split(string sign,int limit)
		String str8="192.168.0.1";
		String[] firstArry=str8.split("\\.");
		String[] secondArry=str8.split("\\.",2);
		System.out.println("全部分割输出结果：");
		for(String a:firstArry) {
			System.out.print("["+a+"]");
		}
		System.out.print("\n");
		System.out.println("两次分割输出结果：");
		for(String b:secondArry) {
			System.out.print("["+b+"]");
		}
		System.out.println("");
		Date date= new Date();
		String str9=String.format("%te",date);
		System.out.println(str9);
	}

}
