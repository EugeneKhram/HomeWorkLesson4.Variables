public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1. Разные типы переменных в качестве практики");

        byte a = 1;
        short b = 300;
        int c = 5_000;
        long d = 1_000_000L;

        float e = 5.75f;
        double f = 6.675;

        System.out.println("Ответ:");
        System.out.println("Переменные отдельно, по порядку: " + " " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
        System.out.println("Сумма всех переменных равна: " + (a + b + c + d + e + f));
        System.out.println(" ");

                System.out.println("Задача 2. Боксеры");

                float boxer_1 = 78.2f;
                float boxer_2 = 82.7f;

                float summaryWeightBoxers = boxer_1 + boxer_2;

        System.out.println("Ответ:");
        System.out.println("Суммарный вес боксеров равен: " + summaryWeightBoxers + " кг");

                float differenceWeightBoxers = boxer_2 - boxer_1;

        System.out.println("Разница в весе боксеров равна: " + differenceWeightBoxers + " кг");
        System.out.println(" ");

        System.out.println("Задача 3. Рацион спортсмена");

        byte bananas = 5;
        float milk = 200;
        byte icecream = 2;
        byte eggs = 4;

        int BabanasWeight = bananas * 80;
        float milkweight = milk / 100 * 105;
        int icecreamWeight = icecream*100;
        int eggsWeight = eggs*70;

        float SummaryWeightCoctailGramm = BabanasWeight + milkweight + icecreamWeight + eggsWeight;

        float SummaryWeightCoctailKg = SummaryWeightCoctailGramm/1000;

        System.out.println("Ответ:");
        System.out.println("Вес коктейля в граммах составляет: " + SummaryWeightCoctailGramm + "  гр!");
        System.out.println("Вес коктейля в граммах составляет: " + SummaryWeightCoctailKg + " кг!");
        System.out.println(" ");



        System.out.println("Задача 4. Вес спортсмена");

        short min = 250;
        short max = 500;
        short totalBadWeight = 7000;

        int maximumQuantityDaysForFit = totalBadWeight / min;
        int minimumQuantityDaysForFit = totalBadWeight / max;
        int averageQuantityDaysForFit = (maximumQuantityDaysForFit + minimumQuantityDaysForFit) /2;

        System.out.println("Ответ:");
        System.out.println("Для похудения на 7 кг спортсмену нужно минимум: " + minimumQuantityDaysForFit + " дней");
        System.out.println("Для похудения на 7 кг спортсмену нужно максимум: " + maximumQuantityDaysForFit + " дней");
        System.out.println("В среднем для похудения на 7 кг спортсмену потребуется: " + averageQuantityDaysForFit + " дней");
        System.out.println(" ");

        System.out.println("Задача 5. Зарплата");

        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;

        float increasingSalaryCoeffitient = 0.1f;

        float MashaIncreasingSum = Masha + (Masha * increasingSalaryCoeffitient);
        float DenisIncreasingSum = Denis + (Denis * increasingSalaryCoeffitient);
        float KristinaIncreasingSum = Kristina + (Kristina * increasingSalaryCoeffitient);

        float MashaDifferenceSalaryIncreasing = MashaIncreasingSum - Masha;
        float DenisDifferenceSalaryIncreasing = DenisIncreasingSum - Denis;
        float KristinaDifferenceSalaryIncreasing = KristinaIncreasingSum - Kristina;

        System.out.println("Ответ:");
        System.out.println ("Размер повышения у Маши составит: " + MashaDifferenceSalaryIncreasing + "рублей!");
        System.out.println("Маша теперь будет получать: " + MashaIncreasingSum + " рублей!" );
        System.out.println(" ");
        System.out.println  ("Размер повышения у Дениса составит: " + DenisDifferenceSalaryIncreasing + "рублей!");
        System.out.println("Денис теперь будет получать: " + DenisIncreasingSum + " рублей!" );
        System.out.println(" ");
        System.out.println ("Размер повышения у Кристины составит: " + KristinaDifferenceSalaryIncreasing + "рублей!");
        System.out.println("Кристина теперь будет получать: " + KristinaIncreasingSum + " рублей!" );
        System.out.println(" ");
        System.out.println(" КОНЕЦ ДОМАШНЕГО ЗАДАНИЯ ");








    }
}