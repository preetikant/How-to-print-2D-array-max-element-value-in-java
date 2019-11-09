public class MaxValue2DArray{
	final static int N  =4;
	final  static int M = 4;
	public static void main(String[] args) {
		int  arr1[][] = {
							{1,4,5,12},
							{4,8,9,23},
							{33,4,12,115},
							{23,9,77,67}
						};
		System.out.println(maxValue(arr1));
	}
	public static int maxValue(int  arr[][]){
		int maxValue = Integer.MIN_VALUE;
		for (int i=0;i<N ;i++ ) {
			for (int j=0;j<M ;j++ ) {
				if (arr[i][j]>maxValue) {
					maxValue = arr[i][j];
				}
			}
		}
		return maxValue;
	}
}