import java.util.Date;

public class TestString {

	public static void main(String[] args) {
		//str.length() ��ȡ�ַ������� ����Ҳ�����ַ����еĿո�
		String str = "we are students";
		int size = str.length(); 
		System.out.println(size); //15
		
		//�ַ������� indexOf()
		String str1="we are students";
		int size1 = str.indexOf("a"); //��������str1.length()-1
		System.out.println(size1); // 3
		
		//str.lastIndexOf() ���ڷ���ָ���ַ������һ�γ��ֵ�����λ��
		String str2="we are students";
		int size2=str.lastIndexOf("e");
		System.out.println(size2); //11
		
		//����:ʹ��lastIndexOf()�����鿴�ַ���str�� ���ַ�����λ��
		//Ȼ������ַ������� ע�⣺lastIndexOf()�����еĲ����ǿ��ַ������� �м�û�пո�
		//lastIndexOf()�����еĲ����ǿ��ַ�������  �򷵻ؽ������ø��ַ���length()�����Ľ����ͬ
		String str3="we are students";
		int size3= str3.lastIndexOf("");
		System.out.println(size3);//15
		
		//charAt()��ȡָ������λ�õ��ַ�
		String str4="we are students";
		char mychar=str4.charAt(5);
		System.out.println("�ַ�Ϊ:"+mychar);
		
		//��ȡ�ַ��� substring(int beginIndex, int endIndex)
		String str5="hello word";
		String str6=str5.substring(0,3);
		System.out.println(str6);
		
		//ȥ���ո� trim() ֻȥ���ַ���ǰ��ո��β���ո�
		String str7 =" java class  ";
		System.out.println("ԭ�����ַ�����"+str7);
		System.out.println("ȥ���ո�֮����ַ�����"+str7.trim());
		
		//�ַ������滻 str.replace(char oldChar,char newChar)
		//�ַ����ķָ� str.split(string sign,int limit)
		String str8="192.168.0.1";
		String[] firstArry=str8.split("\\.");
		String[] secondArry=str8.split("\\.",2);
		System.out.println("ȫ���ָ���������");
		for(String a:firstArry) {
			System.out.print("["+a+"]");
		}
		System.out.print("\n");
		System.out.println("���ηָ���������");
		for(String b:secondArry) {
			System.out.print("["+b+"]");
		}
		System.out.println("");
		Date date= new Date();
		String str9=String.format("%te",date);
		System.out.println(str9);
	}

}
