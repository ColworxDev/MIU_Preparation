public class FirstProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        //int[] arr = new int[] {1, 2, 3 };
        printMsg("result: " + isInfinite(new int[] {1, 2, -1, 5}));
        printMsg("result: " + isInfinite(new int[] {1, 2, 4, -1}));
        printMsg("result: " + isInfinite(new int[] {5, 3, 4, -1, 1, 2}));
        printMsg("result: " + isInfinite(new int[] {3}));
        printMsg("result: " + isInfinite(new int[] {3, 2, 3, 1}));
        printMsg("result: " + isInfinite(new int[] {0}));
        printMsg("result: " + isInfinite(new int[] {-1}));
    }

    public static int isInfinite(int[] array) {

        int maxN = array.length;
        int result = 0;

        for (int i=0; i< maxN; i++ ) {
            if (array[i] < 0) {
                return -1;
            }
            if (array[i] >= maxN) {
                return 1;
            }
        }

        return result;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
