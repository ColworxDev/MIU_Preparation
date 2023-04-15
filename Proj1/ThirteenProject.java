public class ThirteenProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        //int[] a = new int[] {1, 2, 0, 3};
        printMsg("result: " + f(new int[] {1}));
        printMsg("result: " + f(new int[] {1, 2}));
        printMsg("result: " + f(new int[] {1, 2, 3}));
        printMsg("result: " + f(new int[] {1, 2, 3, 4}));
        printMsg("result: " + f(new int[] {3, 3, 4, 4}));
        printMsg("result: " + f(new int[] {3, 2, 3, 4}));
        printMsg("result: " + f(new int[] {4, 1, 2, 3}));
        printMsg("result: " + f(new int[] {1, 1}));
        printMsg("result: " + f(new int[] {}));
        
    }

    public static int f(int[] a) {
        if (a.length < 0) {
            return -1;
        } 
        
        int sumEven = 0;
        int sumOdd = 0;
        for (int x: a) {
            if (x%2 == 0) {
                sumEven += x;
            } else {
                sumOdd += x;
            }
        }

        return sumOdd - sumEven;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
