import java.util.Arrays;

public class binaryArry {

	public static void main(String[] args) {
		int a[]=new int[]{4,25,10};
		Arrays.sort(a);
		int index=Arrays.binarySearch(a,0,2,26);
		System.out.println(index);
		String str[]=new String[]{"ab","cd","de","yz"};
		Arrays.sort(str);
		int index1=Arrays.binarySearch(str,0,2,"cd");
		System.out.println(index1);
	}

}
