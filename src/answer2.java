public class answer2 {
    public static void main(String[] args) {
        double a = 5;
        double b = 0;
        double c = a * b;
        if (a > 0 && b >0){
            System.out.println(c);
        } else if (a > 0 && b >= 0) {
            System.out.println(c = b * b * 3);
        } else if (b > 0 && a >= 0 ) {
            System.out.println(c = a * a * 3.14);
        }else
            System.out.println("eror");
    }
}
