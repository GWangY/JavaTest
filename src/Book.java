
public class Book {
	//私有构造方法 无法在本类外部使用，导致本类无法用new实例化 
	private Book() {
	
}
static public Book libraryBorrow(){
	return new Book();
}
}
