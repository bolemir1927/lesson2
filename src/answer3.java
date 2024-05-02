public class answer3 {
    public static void main(String[] args) {
        int year = 1812;
        int a = 4;
        int v = year%a;
        if (v == 0)
            System.out.println(year + " Високосный");
        else if (v > 0)
            System.out.println(year + " Невисокосный");
        else
            System.out.println("Eror");

    }
}
