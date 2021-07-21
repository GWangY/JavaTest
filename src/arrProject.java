import java.util.Arrays;

public class arrProject {

	public static void main(String[] args) {
		//第六章的第一题
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]=	Arrays.copyOfRange(arr1, 0,3);
		for(int x:arr2) {
		System.out.print(x+" ");
		}
		System.out.println("");
		//第二题 输出数组中最小的值
		int arr3[]= {2,4,1,3};
		int index=0;
		for(int i=0;i<arr3.length;i++){
			if(arr3[index]>arr3[i]) {index=i;}
		}
        System.out.println(arr3[index]);
        //第三题 替换数组元素
        String myString[]= {"aa","22","cc","dd","ss"};
        Arrays.fill(myString,2,3,"bb");
        System.out.println("替换后的数组:");
        for(int x=0;x<myString.length;x++) {
        	System.out.print(myString[x]+" ");
        }
        System.out.println("");
        //第四题 排序
        int a1[][]= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("原数组输出：");
        for(int i=0;i<a1.length;i++) {
        	for(int j=0;j<a1.length;j++) {
        		System.out.print(a1[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("行列调换后输出：");
        for(int i=0;i<a1.length;i++) {
        	for(int j=0;j<a1.length;j++) {
        		System.out.print(a1[j][i]+" ");
        	}
        	System.out.println();
        }
	}

}
