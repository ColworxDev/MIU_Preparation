public class TwelfthProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        //int[] a = new int[] {1, 2, 0, 3};
        printMsg("result: " + f(new int[] {1, 2, 3, 4}));
        printMsg("result: " + f(new int[] {4, 1, 2, 3}));
        printMsg("result: " + f(new int[] {1, 1, 2, 2}));
        printMsg("result: " + f(new int[] {1, 1}));
        printMsg("result: " + f(new int[] {1}));
        printMsg("result: " + f(new int[] {}));
        
    }

    public static int f(int[ ] a) {
        if (a.length < 2) {
            return -1;
        } 
        int largest = -1;
        int secondLargest = -1;
        for (int i=0; i< a.length; i ++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        if (largest == secondLargest) {
            return -1;
        }        
        return secondLargest;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
