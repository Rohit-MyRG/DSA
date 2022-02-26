class Q2 {
    static int[] concat(int[] a) {
        int[] arr = new int[a.length * 2];

        for (int i = 0; i < a.length; i++ ){
            arr[a.length + i] = arr[i] = a[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =  { 1, 2, 1, 3 };

        for (int i : concat(arr)) {
            System.out.print(i + "  ");
        }
    }
}
