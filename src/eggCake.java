
public class eggCake {
int eggCount;
//eggCake��Ĺ��췽��
public eggCake(int eggCount) {
	this.eggCount=eggCount;
	System.out.println("���������"+eggCount+"������");
	}
public eggCake() {
	/*eggCount=1;
	System.out.println("���������"+eggCount+"������");
	*/
	// this�ؼ��ֿ��Ե������еĹ��췽��
	this(1); //��û�и��߼���������ʱ�� Ĭ�Ϸ���һ��
	
}
public static void main(String[] args) {
	eggCake e=new eggCake();
	eggCake e1=new eggCake(5);
}
}
