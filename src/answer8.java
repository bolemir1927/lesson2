public class answer8 {
    public static void main(String[] args) {
        int year = 2023;
        int mounth = 2;
        switch (mounth) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (year%4 == 0)
                    System.out.println("28");
                else if (year%4 > 0)
                    System.out.println("29");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Закончили");
        }
    }
}
