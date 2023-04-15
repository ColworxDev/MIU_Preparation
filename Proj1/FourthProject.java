public class FourthProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        printMsg("result: " + hasNFollowingComposites(23, 2));
        printMsg("result: " + hasNFollowingComposites(23, 6));
        printMsg("result: " + hasNFollowingComposites(89, 6));
        printMsg("result: " + hasNFollowingComposites(24, 4));
        
    }

    public static int hasNFollowingComposites(int n, int count) {
        if (isPrime(n)) {
            int num = n + 1;
            for(int i = 0; i < count; i ++, num++ ) {
                if (isPrime(num)) {
                    return 0;
                }   
            }
            return 1;
        }
        return 0;
    }

    public static Boolean isPrime(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i=2; i< num/2; i ++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
