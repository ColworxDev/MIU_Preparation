public class SecondProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        //int[] arr = new int[] {1, 2, 3 };
        printMsg("result: " + isCumulative(new int[] {1}));
        printMsg("result: " + isCumulative(new int[] {0,0,0,0,0,0}));
        printMsg("result: " + isCumulative(new int[] {1, 1, 1, 1, 1, 1}));
        printMsg("result: " + isCumulative(new int[] {3, 3, 6, 12, 24}));
        printMsg("result: " + isCumulative(new int[] {-3, -3, -6, -12, -24}));
        printMsg("result: " + isCumulative(new int[] {-3, -3, 6, 12, 24}));
    }

    public static int isCumulative(int[] array) {

        int maxN = array.length;
        
        if (maxN <= 1) {
            return 0;
        }

        int result1 = array[0];
        int result2 = array[1];
        if (result1 == result2) {
            for (int i=2; i< maxN; i++ ) {
                int sum = result1 + result2;
                if (sum == array[i]) {
                    result1 = array[i];
                    result2 = array[i];
                } else {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
