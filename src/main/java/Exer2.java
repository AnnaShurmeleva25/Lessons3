public class Exer2 {
    public static void main(String[] args) {
      int number = 0;
      if (number <= 0){
          System.out.println("<= 0");
        } else if (number > 0 && number <= 10) {
          System.out.println("0(>) - 10 (<=10)");
      } else if (number > 10 && number <= 1000) {
          System.out.println("10 (>10) - 1000 (<=1000)");
      } else  if (number > 1000) {
          System.out.println(">1000");
      }
    }
}
