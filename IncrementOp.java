public class IncrementOp {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("first i  value = " + i);
        int newNum = 10 * (--i); //i = 10 - 1;
        System.out.println("after i++ run, value of i is = " + i);
        System.out.println("value of new number = " + newNum);
    }
}
