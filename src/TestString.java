
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
	}

}
