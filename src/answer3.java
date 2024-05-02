public class answer3 {
    public static void main(String[] args) {
        int year = 1812;
        if (year%4 == 0)
            System.out.println(year + " Високосный");
        else if (year%4 > 0)
            System.out.println(year + " Невисокосный");
        else
            System.out.println("Eror");

    }
}
