public class SeventeenProject {

    public static void main(String[] args) {
        printMsg("result: " + isPalindrome(new char[] {'t', 'o', 'p', 's', 'p', 'o', 't'}));
        printMsg("result: " + isPalindrome(new char[] {'t','o','t','o'}));

        printMsg("result: " + isPalindrome(new char[] {'d','o','t','s','e','e','s','t','o','d'}));
        printMsg("result: " + isPalindrome(new char[] {}));

        printMsg("result: " + isPalindrome(new char[] {'a'}));
        printMsg("result: " + isPalindrome(new char[] {4, 0, 9}));

        //ipreferpi
        printMsg("result: " + isPalindrome(new char[] {'i', 'p', 'r', 'e', 'f', 'e', 'r', 'p', 'i'}));
        printMsg("result: " + isPalindrome(new char[] {0, 1, 0}));

    }

    public static boolean isPalindrome(char [] arr) {
        if (arr.length % 2 == 0) {
            return false;
        }
        int len = arr.length;
        for (int i=0; i< len/2; i ++) {
            if (arr[i] != arr[(len - 1) - i]) {
                return false;
            }
        }
        return true;
    }

    public static void printMsg(String msg) {
        System.out.print("\n" + msg + " " );        
    }
    
}
