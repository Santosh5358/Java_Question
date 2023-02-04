package Array;

public class LeftRotation {
    static void RightRotate(int a[],int n, int k)
    {
	    int temp[] = new int[n];
        int c = 0;
        for (int i = k; i < n; i++) {
            temp[c++] = a[i];
        }
        for (int i = 0; i < k; i++) {
            temp[c++] = a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }

    public static void main(String args[])
    {
	    int Array[] = {1, 2, 3, 4, 5, 6, 7};
	    int N = Array.length;

	    int K = 2;
	    RightRotate(Array, N, K);

    }
}
