package pertemuan7.ExceptionHandling;

public class NestedTry2 {
    public static void main(String args[]) {
        try {
            // Nested try pertama
            try {
                int a[] = new int[2];
                System.out.println("Access element three :" + a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds exception: " + e);
            }

            // Nested try kedua
            try {
                int b = 0;
                int c = 1 / b;

            } catch (Exception e) {
                System.out.println("Exception caught in outer try: " + e);
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        }

        System.out.println("Out of the block");
    }
}
