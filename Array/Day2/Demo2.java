class Demo2 {
    public int[] shuffle(int[] num, int n) {
        int x[] = new int[n * 2];

        for (int i = 0, k = 0; i < n; i++, k = k + 2) {
            x[k] = num[i];
            x[k + 1] = num[n + i];
        }

        return x;
    }
    public static void main(String[] args) {
        int[] arr = new Demo2().shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3);
        for (int i : arr) {
            System.out.print(" "+i);
        }
    }
}
