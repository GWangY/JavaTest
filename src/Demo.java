
public class Demo {
	public static void main(String[] args) {
		//int arr[]=new int[]{64,4,24,1,3,15};
		int arr[]= {64,4,24,1,3,15};
		//ð������
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
				
		}
			System.out.println("ð������Ľ����");
			for(int x:arr) {
				System.out.print(x+" ");
			}
		//ֱ��ѡ������
		int arr1[]= {64,4,24,1,3,15};	
		int index;   // һֱָ����ֵ����
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
		System.out.println("ֱ����������");
		for(int b:arr1) {
			System.out.print(b+" ");
		}
		
	}

}
