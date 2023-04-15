public class EighteenProject {

    public static void main(String[] args) {
        printMsg("result: " + arr(new int[] {11,11,2,3,4,5,5,6,7,5,5,7,11,5,7,7}));
    }

    //Maxnumberelementfourtime
    public static int arr(int[ ] a) {
        if (a.length == 0) {
            return -1;
        }
        int maxElem = a[0];
        int count = countOccurrences(a, maxElem);
        for (int i = 1; i<a.length; i++) {
            int j = countOccurrences(a, a[i]);
            if (j > count) {
                maxElem = a[i];
                count = j; 
            }
        }
        return maxElem;
    }

    public static int countOccurrences(int[ ] a, int num) {
        int count = 0;
        for (int i : a) {
            if (i==num) {
                count++;
            }
        }
        return count;
    }

    

    public static void printMsg(String msg) {
        System.out.print("\n" + msg + " " );        
    }
    
}
