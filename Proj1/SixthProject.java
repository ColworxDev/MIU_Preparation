public class SixthProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        printMsg("result: " + hasTwoValues(new int[] {1, 2, 2, 1}));
        printMsg("result: " + hasTwoValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3}));
        printMsg("result: " + hasTwoValues(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1}));
        printMsg("result: " + hasTwoValues(new int[] {}));
    }

    public static int hasTwoValues(int[] a1) {
        if (a1.length < 2) {
            return 0;
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
