public class NinthProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        printMsg("result: " + isDual(new int[] {1, 2, 3, 0}));
        printMsg("result: " + isDual(new int[] {1, 2, 2, 1, 3, 0}));
        printMsg("result: " + isDual(new int[] {1, 1, 2, 2}));
        printMsg("result: " + isDual(new int[] {1, 2, 1}));
        printMsg("result: " + isDual(new int[] {}));
        
    }

    public static int isDual(int[ ] a) {
        if (a.length == 0) {
            return 1;
        } else if (a.length % 2 != 0 || a.length < 4) {
            return 0;
        }
        
        int sum1 = a[0] + a[1];
        int sum2 = 0;
        for(int i=2; i +1 < a.length; i++) {
            sum2 = a[i] + a[++i];
            if (sum1 != sum2) {
                return 0;
            }
        }
                
        return 1;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
