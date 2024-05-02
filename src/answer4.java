public class answer4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int op = 2;
        if (op == 1)
            System.out.println(a + b);
        else if (op == 2 && a > b)
            System.out.println(a - b);
        else if (op == 3)
            System.out.println(a * b);
        else if (op == 4 && b > 0)
            System.out.println(a / b);
        else
            System.out.println("eror");
    }
}
