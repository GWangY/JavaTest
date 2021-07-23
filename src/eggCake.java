
public class eggCake {
int eggCount;
//eggCake类的构造方法
public eggCake(int eggCount) {
	this.eggCount=eggCount;
	System.out.println("这个饼里有"+eggCount+"个鸡蛋");
	}
public eggCake() {
	/*eggCount=1;
	System.out.println("这个饼里有"+eggCount+"个鸡蛋");
	*/
	// this关键字可以调用类中的构造方法
	this(1); //在没有告诉鸡蛋个数的时候 默认放入一个
	
}
public static void main(String[] args) {
	eggCake e=new eggCake();
	eggCake e1=new eggCake(5);
}
}
