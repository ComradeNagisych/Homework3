public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int salary = 60000;
        System.out.println("Значение переменной salary с типом int равно " + salary);
        byte bread = 50;
        System.out.println("Значение переменной bread с типом byte равно " + bread);
        short rent = 10000;
        System.out.println("Значение переменной rent с типом short равно " + rent);
        long companyRevenue = 3000000000L;
        System.out.println("Значение переменной companyRevenue с типом long равно " + companyRevenue);
        float weight = 74.55f;
        System.out.println("Значение переменной weight с типом float равно " + weight);
        double remain = 8.25167893;
        System.out.println("Значение переменной remain с типом double равно " + remain);
        System.out.println("Задача №2");
        float data1 = 27.12f;
        System.out.println("Число " + data1 + " инициализировано типом переменной float");
        long data2 = 987678965549L;
        System.out.println("Число " + data2 + " инициализировано типом переменной long");
        double data3 = 2.786;
        System.out.println("Число " + data3 + " инициализировано типом переменной double");
        short data4 = 569;
        System.out.println("Число " + data4 + " инициализировано типом переменной short");
        short data5 = -159;
        System.out.println("Число " + data5 + " инициализировано типом переменной short");
        int data6 = 27897;
        System.out.println("Число " + data6 + " инициализировано типом переменной int");
        byte data7 = 67;
        System.out.println("Число " + data7 + " инициализировано типом переменной byte");
        System.out.println("Задача №3");
        int lyuPav = 23;
        int annSer = 27;
        int ekaAnd = 30;
        int totalPaper = 480;
        int studentPaper = totalPaper / (lyuPav + annSer + ekaAnd);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
        System.out.println("Задача №4");
        int twoMinutes = 16;
        int twentyMinutes = twoMinutes * 10;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int oneDay = twentyMinutes * (1440 / 20);
        System.out.println("За 1 сутки машина произвела " + oneDay + " штук бутылок");
        int threeDays = oneDay * 3;
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        int oneMonth = threeDays * 10;
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");
        System.out.println("Задача №5");
        int totalPaint = 120;
        int white = 2;
        int brown = 4;
        int totalClassrooms = totalPaint / (white + brown);
        int totalWhite = totalClassrooms * white;
        int totalBrown = totalClassrooms * brown;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно "+ totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println("Задача №6");
        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeightGrams = banana + milk + iceCream + eggs;
        double totalWeightKilos = totalWeightGrams / 1000.0;
        System.out.println("Вес завтрака спортсмена составляет " + totalWeightGrams + " грамм, или " + totalWeightKilos + " килограмм");
        System.out.println("Задача №7");
        int weightLossKilos = 7;
        int weightLossGrams = weightLossKilos * 1000;
        int dailyGrams1 = 250;
        int dailyGrams2 = 500;
        int days1 = weightLossGrams / dailyGrams1;
        int days2 = weightLossGrams / dailyGrams2;
        int daysAverage = (days1 + days2) / 2;
        System.out.println("При потере 250 грамм веса в день спортсмен похудеет за " + days1 + " дней, а при потере 500 грамм в день за " + days2 + " дней. В среднем спортсмен похудеет на 7 килограмм за " + daysAverage + " дней");
        System.out.println("Задача №8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76320;
        int mashaYear = mashaSalary * 12;
        int denisYear = denisSalary * 12;
        int kristinaYear = kristinaSalary * 12;
        int mashaNewSalary = mashaSalary + (mashaSalary / 100 * 10);
        int denisNewSalary = denisSalary + (denisSalary / 100 * 10);
        int kristinaNewSalary = kristinaSalary + (kristinaSalary / 100 * 10);
        int mashaNewYear = mashaNewSalary * 12;
        int mashaDiff = mashaNewYear - mashaYear;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        int denisNewYear = denisNewSalary * 12;
        int denisDiff = denisNewYear - denisYear;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        int kristinaNewYear = kristinaNewSalary * 12;
        int kristinaDiff = kristinaNewYear - kristinaYear;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей");
    }
}