public class EleventhProject {

    public static void main(String[] args) {

        printMsg("Hello world");
        //int[] a = new int[] {1, 2, 0, 3};
        printMsg("result: " + isLayered(new int[] {1, 1, 2, 2, 2, 3, 3}));
        printMsg("result: " + isLayered(new int[] {3, 3, 3, 3, 3, 3, 3}));
        printMsg("result: " + isLayered(new int[] {1, 2, 2, 2, 3, 3}));
        printMsg("result: " + isLayered(new int[] {2, 2, 2, 3, 3, 1, 1}));
        printMsg("result: " + isLayered(new int[] {2}));
        printMsg("result: " + isLayered(new int[] {}));
        
    }

    public static int isLayered(int[ ] a) {
        if (a.length < 2) {
            return 0;
        } 
        int prevNo = a[0];
        int count = 1;
        for (int i=1; i< a.length; i ++) {
            if (a[i] == prevNo) {
                count ++;
            } else {
                if (count == 1) {
                    return 0;
                } else if (prevNo < a[i]) {
                    count = 1;
                    prevNo = a[i];
                } else {
                    //not in ascending order
                    return 0;
                }
            }
        }
        if (count == 1) {
            return 0;
        }        
        return 1;
    }

    public static void printMsg(String msg) {
        System.out.println(msg);
    }
    
}
