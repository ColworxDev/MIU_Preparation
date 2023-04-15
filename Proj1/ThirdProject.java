public class ThirdProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        printMsg("result: " + loopSum(new int[] {1, 2, 3}, 2));
        printMsg("result: " + loopSum(new int[] {-1, 2, -1}, 7));
        printMsg("result: " + loopSum(new int[] {1, 4, 5, 6}, 4));
    }

    public static int loopSum(int[] a, int n) {
        int sum = 0;
        int index = 0;
        for (int i = 0; i < n && a.length > 0 && n > 0; i ++ ) {
            if (index >= a.length) {
                index = 0;
            }
            sum += a[index];
            index += 1;
        }
        return sum;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
