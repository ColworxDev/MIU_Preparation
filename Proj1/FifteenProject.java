public class FifteenProject {

    public static void main(String[] args) {

        //printMsg("Hello world");
        //int[] a = new int[] {1, 2, 0, 3};
        printMsg("result: " + isBalanced(new int[] {2, 3, 6, 7}));
        printMsg("result: " + isBalanced(new int[] {6, 3, 2, 7}));
        printMsg("result: " + isBalanced(new int[] {6, 7, 2, 3, 12}));
        printMsg("result: " + isBalanced(new int[] {6, 7, 2, 3, 14, 95}));
        printMsg("result: " + isBalanced(new int[] {7, 15, 2, 3}));
        printMsg("result: " + isBalanced(new int[] {16, 6, 2, 3}));
        printMsg("result: " + isBalanced(new int[] {2}));
        printMsg("result: " + isBalanced(new int[] {3}));
        printMsg("result: " + isBalanced(new int[] {}));
    }

    public static int isBalanced(int[] a) {
        for(int i=0; i< a.length; i ++) {
            if (i%2 == 0) {
                if (a[i]%2 != 0) {
                    return 0;
                }
            } else {
                if (a[i]%2 == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void printMsg(String msg) {
        System.out.print("\n" + msg + " " );        
    }
    
}
