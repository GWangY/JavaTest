
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
	}

}
