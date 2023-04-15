public class SeventhProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        printMsg("result: " + isSorted(new int[] {1, 2, 5, 6}));
        printMsg("result: " + isSorted(new int[] {12, 3, 2, 1}));
        printMsg("result: " + isSorted(new int[] {1, 2, 6, 3}));
        printMsg("result: " + isSorted(new int[] {}));
        printMsg("result: " + isSorted(new int[] {2}));
    }

    public static int isSorted(int[] a1) {
        if (a1.length < 2) {
            return 1;
        }
        
        for (int i =0; i< a1.length; i++) {
            if (countElement(a1, a1[i]) != 2) {
                return 0;
            }
        }
        return 1;
    }

    public static int countElement(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count ++;
            }
        }
        return count;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
