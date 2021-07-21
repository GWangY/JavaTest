
public class StringJerque {

	public static void main(String[] args) {
	StringBuffer sbf=new StringBuffer("古诗春晓");
	sbf=sbf.delete(0,2);
	sbf=sbf.insert(1,"眠不觉");
 	sbf=sbf.append("，处处闻啼鸟。");
	System.out.println(sbf.toString());
	//获取子字符串
	String str="ABCDEFGHY";
	String str1=str.substring(2,5);
	String str2=str.substring(3,7);
	boolean bl=str1.equals(str2);
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(bl);
	
	}

}
