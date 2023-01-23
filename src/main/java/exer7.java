public class exer7 {
    public static void main(String[] args) {
        int nameDay = 5;
        boolean numberDay;
        if (nameDay == 1) {
            System.out.println("Понедельник");
        } else if (nameDay == 2) {
            System.out.println("Вторник");
        } else if (nameDay == 3) {
            System.out.println("Среда");
        } else if (nameDay == 4) {
            System.out.println("Четверг");
        } else if (nameDay == 5) {
            System.out.println("Пятница");
        } else if (nameDay == 6) {
            System.out.println("Суббота");
        } else if (nameDay == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("нет такого дня");
        }
    }
}