public class answer4 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int op = 3;
        if (op == 1){
            System.out.println(a + b);}
        else if (op == 2 && a > b){
            System.out.println(a - b);}
        else if (op == 3 && b != 0 && a != 0){
            System.out.println(a * b);}
        else if (op == 4 && b != 0 && a != 0){
            System.out.println(a / b);}
        else
            System.out.println("eror");
    }
}
