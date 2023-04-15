public class TenthProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        //int[] a = new int[] {1, 2, 0, 3};
        printMsg("result: " + isAllPossibilities(new int[] {1, 2, 0, 3}));
        printMsg("result: " + isAllPossibilities(new int[] {3, 2, 1, 0}));
        printMsg("result: " + isAllPossibilities(new int[] {1, 2, 4, 3}));
        printMsg("result: " + isAllPossibilities(new int[] {0, 2, 3}));
        printMsg("result: " + isAllPossibilities(new int[] {0}));
        printMsg("result: " + isAllPossibilities(new int[] {}));
        
    }

    public static int isAllPossibilities(int[ ] a) {
        if (a.length == 0) {
            return 0;
        } 
        for (int i=0; i<a.length; i++) {
            if(!contains(a, i)) {
                return 0;
            }
        }        
        return 1;
    }

    public static Boolean contains(int [] a, int num) {
        for (int x: a) {
            if (x == num) {
                return true;
            }
        }
        return false;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
