public class Main {
    public static void main(String[] args) {
        // Домашняя работа 3.2
        // Задание 1
        System.out.println("Задание 1");
        int cometYears = 0;
        int lastYears = 1822; //  год за 200 лет до текущего
        int futureYears = 2122; // 100 лет после, в качестве завершения периода расчета
        while (cometYears<2122) {
            if (cometYears>=1822) {
                System.out.println( cometYears + " - год комета пролетала рядом с Землей");
            }
            cometYears += 79;
        }

    }
}