import java.util.Scanner;

public class ThePhone {

	public static void main(String[] args) {
		//��֤�����ֻ���
		Scanner sc=new Scanner(System.in);//�Ӽ��̽�������
		String regex="(13[0-9]|15[12356789]|18[056789])\\d{8}";
		while(true) {
			//֪ʶ��:next()next()һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������룬��������Ч�ַ�֮ǰ�����Ŀո����Tab����Enter���Ƚ�������
			//next()�������Զ�����ȥ����ֻ����������Ч�ַ�֮��next()�����Ž��������Ŀո����Tab����Enter������Ϊ�ָ������������
			//���磬�ڿ���̨���롰  gjm  gjm ��ʱ��һ��next()��������Ľ�����"gjm"�������ܵõ����ո���ַ����ģ�
			//nextLine()�����Ľ�����ֻ��Enter������nextLine()�������ص���Enter��֮ǰ�������ַ�
			String phone=sc.nextLine();//��������
			if(phone.matches(regex)) {
				System.out.println("���������ֻ���");
			}else {
				System.out.println("�����벻���ֻ���");
			}
		}
	}

}
