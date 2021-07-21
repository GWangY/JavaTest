
public class Demo {
	public static void main(String[] args) {
		//int arr[]=new int[]{64,4,24,1,3,15};
		int arr[]= {64,4,24,1,3,15};
		//冒泡排序
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
				
		}
			System.out.println("冒泡排序的结果：");
			for(int x:arr) {
				System.out.print(x+" ");
			}
		//直接选择排序
		int arr1[]= {64,4,24,1,3,15};	
		int index;   // 一直指向数值最大的
		for(int i=1;i<arr1.length;i++) {
			index=0;
			for(int j=1;j<=arr1.length-i;j++) {
				if(arr1[index]<arr1[j]) {
					index=j;
				}
			}
			int temp1=arr1[index];
			arr1[index]=arr1[arr1.length-i];
			arr1[arr1.length-i]=temp1;
		}
		System.out.println("直接排序结果：");
		for(int b:arr1) {
			System.out.print(b+" ");
		}
		
	}

}
