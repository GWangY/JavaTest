
public class ForEachArry {

	public static void main(String[] args) {
		int arr[][]= {{4,3},{1,2}};
		System.out.println("数组中的元素是：");
		int i=0;
		for(int x[]:arr) {
			i++;
			int j=0;
			for(int e:x) {
				j++;
				if(i==arr.length&&j==x.length) {
					System.out.println(e);
				}else {System.out.print(e+"、");}
			}
		}
	}

}
