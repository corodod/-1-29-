public class Main {
    public static void main(String[] args) {
        int ch, num1, num2, num3;
        ch = System.in.readln();
        num3 = ch % 10;
        num2 = (ch / 10) % 10;
        num1 = ch / 100;
        ch = num3 * 100 + num2 * 10 + num1;
        System.out.println(ch);
    }
}