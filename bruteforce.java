
public class bruteforce {
    public static void main(String[] args) {
        int a[] = {1,-2,2,3};
        
        System.out.println(maxSubSum1(a));
    }

    public static int maxSubSum1(int[] A) {
    int maxSum = 0;
    for (int ii = 0; ii < A.length; ii++) {
        for (int jj = ii; jj < A.length; jj++) {
            int thisSum = 0;
            for (int kk = ii; kk <= jj; kk++) {
                thisSum += A[kk];
            }
            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
        }
    }
    return maxSum;
}

}
