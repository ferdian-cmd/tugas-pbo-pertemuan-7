package pertemuan7.ExceptionHandling;

public class ExcapText2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            int b = 0;
            int c = 1 / b;
            System.out.println("akses elemen ke 3:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of the box" + e);
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        System.out.println("diluar jangkauan");
    }
}
