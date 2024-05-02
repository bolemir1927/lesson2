public class answer2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = a * b;
        if (a > 0 && b >0){
            System.out.println(c);
        } else if (a == 0 && b != 0) {
            System.out.println(c = b * b * 3);
        } else if (b == 0 && a != 0 ) {
            System.out.println(c = a * a * 3);
        }else
            System.out.println("eror");
    }
}
