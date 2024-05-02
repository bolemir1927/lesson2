public class answer1 {
    public static void main(String[] args) {
        int mounth = 14;
        if (mounth == 12 || mounth > 0 && mounth < 3){
            System.out.println("Зима");
        } else if (mounth > 2 && mounth < 6) {
            System.out.println("Весна");
        } else if (mounth > 5 && mounth < 9) {
            System.out.println("Лето");
        } else if (mounth > 8 && mounth < 12) {
            System.out.println("Осень");
        }else
            System.out.println("Чего?");
    }
    }
