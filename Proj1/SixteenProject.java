public class SixteenProject {

    public static void main(String[] args) {
        printMsg("result: " + eval(1.0, new int[] {0, 1, 2, 3, 4}));
        printMsg("result: " + eval(3.0, new int[] {3, 2, 1}));
        printMsg("result: " + eval(2.0, new int[] {3, -2, -1}));
        printMsg("result: " + eval(-3.0, new int[] {3, 2, 1}));
        printMsg("result: " + eval(2.0, new int[] {3, 2}));
        printMsg("result: " + eval(2.0, new int[] {4, 0 , 9}));
        printMsg("result: " + eval(2.0, new int[] {10}));
        printMsg("result: " + eval(10.0, new int[] {0, 1}));
    }

    public static double eval(double x, int[ ] a) {
        int sum = 0;
        for(int n=a.length - 1; n>=0; n--) {
            sum += a[n] * Math.pow(x, n);
        }
        return sum;
    }

    public static void printMsg(String msg) {
        System.out.print("\n" + msg + " " );        
    }
    
}
