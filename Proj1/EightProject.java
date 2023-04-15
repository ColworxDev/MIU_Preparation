public class EightProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        for (int i=0; i<=20; i++) {
            printMsg("result: " + i + "::" + isNormal(i));
        }
        
    }

    public static int isNormal(int n) {
        if (n < 4) {
            return 1;
        }
        
        for (int i = 3; i <= n/2; i +=2) {
            if (n%i == 0) {
                return 0;
            }
        }
        
        return 1;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
