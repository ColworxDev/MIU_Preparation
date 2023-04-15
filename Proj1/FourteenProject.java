public class FourteenProject {

    public static void main(String[] args) {

        //printMsg("Hello world");
        //int[] a = new int[] {1, 2, 0, 3};
        //printMsg("result: " + f(new int[] {}));
        printMsg("result1: ", f(new char[]{'a', 'b', 'c'}, 0, 4));
        printMsg("result2: ", f(new char[]{'a', 'b', 'c'}, 0, 3));
        printMsg("result3: ", f(new char[]{'a', 'b', 'c'}, 0, 2));
        printMsg("result4: ", f(new char[]{'a', 'b', 'c'}, 0, 1));
        printMsg("result5: ", f(new char[]{'a', 'b', 'c'}, 1, 3));
        printMsg("result6: ", f(new char[]{'a', 'b', 'c'}, 1, 2));
        printMsg("result7: ", f(new char[]{'a', 'b', 'c'}, 1, 1));
        printMsg("result8: ", f(new char[]{'a', 'b', 'c'}, 2, 2));
        printMsg("result9: ", f(new char[]{'a', 'b', 'c'}, 2, 1));
        printMsg("result10: ", f(new char[]{'a', 'b', 'c'}, 3, 1));
        printMsg("result11: ", f(new char[]{'a', 'b', 'c'}, 1, 0));
        printMsg("result12: ", f(new char[]{}, 0, 1));
        printMsg("result13: ", f(new char[]{'a', 'b', 'c'}, -1, 2));
        printMsg("result14: ", f(new char[]{'a', 'b', 'c'}, -1, -2));

        
    }

    public static char[ ] f(char[ ] a, int start, int len) {
        if (len > a.length || start < 0 || len < 0) {
            return null;
        }
        if (start + len > a.length ) {
            return null;
        }
        char[] newArr = new char[len];
        for (int i = start, index = 0; index < len; i ++, index ++) {
            newArr[index] = a[i];
        }

        return newArr;
    }

    public static void printMsg(String msg, char[] a) {
        System.out.print("\n" + msg + " " );
        if (a != null) {
            System.out.print(a);
        } else {
            System.out.print("NULL");
        }
        
    }
    
}
