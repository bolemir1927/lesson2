public class answer8 {
    public static void main(String[] args) {
        int year = 2024;
        int mounth = 2;
        switch (mounth) {
            case 1 ->
                System.out.println("31");
            case 2 -> {
                if (year%4 == 0)
                    System.out.println("28");
                else if (year%4 != 0)
                    System.out.println("29");}
            case 3 ->
                System.out.println("31");
            case 4 ->
                System.out.println("30");
            case 5 ->
                System.out.println("31");
            case 6 ->
                System.out.println("30");
            case 7 ->
                System.out.println("31");
            case 8 ->
                System.out.println("31");
            case 9 ->
                System.out.println("30");
            case 10 ->
                System.out.println("31");
            case 11 ->
                System.out.println("30");
            case 12 ->
                System.out.println("31");
            default ->
                System.out.println("Закончили");
        }
    }
}
