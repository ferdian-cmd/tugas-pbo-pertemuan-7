package pertemuan7.ExceptionHandling;

public class MultipleCatchblock {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            int b = 0;
            int c = 1 / b;
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception thrown :" + e.getMessage());
        }
        System.out.println("Out of the block");
    }
}
