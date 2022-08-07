public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Первое задание
        byte dog = 7;
        short mouse = 38;
        int cat = 8;
        long elephant = 101L;
        float sugarWeight = 1.5f;
        double saltWeight = 3.5;
        char bar = 33;
        boolean dogIsAdult = dog > 10;
        System.out.println(dogIsAdult);
        // Второе задание
        double firstBoxerWeight = 78.2;
        double secondBowerWeight = 82.7;
        double totalFightersWeight = firstBoxerWeight + secondBowerWeight;
        System.out.println("Общий вес бойцов " + totalFightersWeight + " кг.");
        double weightDifferenceFighters = secondBowerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов " + weightDifferenceFighters + " кг.");
//Третье задание
        byte bananas = 5;
        byte weightOneBanana = 80;
        int bananasWeight = bananas * weightOneBanana;
        short milk100Milliliters = 2;
        int weightMilk100Milliliters = 105;
        int milkWeight = milk100Milliliters * weightMilk100Milliliters;
        byte iceCreamSundae = 2;
        short weightOneBriquetteIceCreamSundae = 100;
        int weightTwoBriquetteIceCreamSundae = iceCreamSundae * weightOneBriquetteIceCreamSundae;
        byte rawEggs = 4;
        int weightRawEgg = 70;
        int weightFourRawEggs = rawEggs * weightRawEgg;
        int breakfastWeightInGrams = bananasWeight + milkWeight + weightTwoBriquetteIceCreamSundae + weightFourRawEggs;
        float breakfastWeightInKilograms = breakfastWeightInGrams / 1000f;
        System.out.println("Вес спорт-завтрака " + breakfastWeightInKilograms + " кг.");
//Четвертое задание
        byte weightLosInKilograms = 7;
        int weightLosInGrams = weightLosInKilograms * 1000;
        short weightLosInDay250 = 250;
        int daysWhenLosingWeightBy250Milligrams = weightLosInGrams / weightLosInDay250;
        System.out.println("При ежедневном похудении на 250 граммм потребуется " + daysWhenLosingWeightBy250Milligrams + " дней.");
        short weightLosInDay500 = 500;
        int daysWhenLosingWeightBy500Milligrams = weightLosInGrams / weightLosInDay500;
        System.out.println("При ежедневном похудении на 500 грамм потребуется " + daysWhenLosingWeightBy500Milligrams + " дней.");
        int averageNumberOfDays = (daysWhenLosingWeightBy250Milligrams + daysWhenLosingWeightBy500Milligrams) / 2;
        System.out.println("Среднее количество дней похудения " + averageNumberOfDays + " день");
        //Пятое задание
       int salaryMasha = 67760;
       int salaryDenis = 83690;
       int salaryKristina = 76230;
      double annualSalaryIncrease = 0.1;
      double annualSalaryIncreaseMasha = salaryMasha * annualSalaryIncrease;
      System.out.println("Годовой доход Маши вырос на " + annualSalaryIncreaseMasha + " рублей");
      double salaryAfterPromotionForMasha = salaryMasha + annualSalaryIncreaseMasha;
      System.out.println("Маша теперь получает " + salaryAfterPromotionForMasha + " рублей");
      double annualSalaryIncreaseDenis = salaryDenis * annualSalaryIncrease;
      System.out.println("Годовой доход Дениса вырос на " + annualSalaryIncreaseDenis + " рублей");
      double salaryAfterPromotionForDenis = salaryDenis + annualSalaryIncreaseDenis;
      System.out.println("Денис теперь получает " + salaryAfterPromotionForDenis + " рублей");
      double annualSalaryIncreaseKristina = salaryKristina * annualSalaryIncrease;
      System.out.println("Годовой доход Кристины вырос на " + annualSalaryIncreaseKristina + " рублей");
      double salaryAfterPromotionForKristina =salaryKristina + annualSalaryIncreaseKristina;
      System.out.println("Крисина теперь получает " + salaryAfterPromotionForKristina + " рублей");





    }
}








