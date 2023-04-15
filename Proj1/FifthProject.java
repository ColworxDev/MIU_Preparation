public class FifthProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        printMsg("result: " + equivalentArrays(new int[] {0, 1, 2}, new int[] {2, 0, 1}));
        printMsg("result: " + equivalentArrays(new int[] {1, 1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1, 2}));
        printMsg("result: " + equivalentArrays(new int[] {}, new int[] {3, 1, 1, 1, 1, 2}));
    }

    public static int equivalentArrays(int[ ] a1, int[ ] a2) {
        if (a1.length != a2.length) {
            return 0;
        }
        for (int i = 0; i < a1.length; i++) {
            if (!containsElement(a2, a1[i])) {
                return 0;
            }
        }

        for (int i = 0; i < a2.length; i++) {
            if (!containsElement(a1, a2[i])) {
                return 0;
            }
        }
         
        return 1;
    }

    public static Boolean containsElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
