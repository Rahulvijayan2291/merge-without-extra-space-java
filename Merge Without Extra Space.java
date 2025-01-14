class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length, m = b.length;
        int[] merged = new int[n + m];
        System.arraycopy(a, 0, merged, 0, n);
        System.arraycopy(b, 0, merged, n, m);
        
        Arrays.sort(merged);
        
        System.arraycopy(merged, 0, a, 0, n);
        System.arraycopy(merged, n, b, 0, m);
        
    }
}
