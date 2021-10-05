package ua.dp.zymokos.heorhii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompanyProfit {
    public static void main(String[] args) throws IOException {
        int[] profitByMonth = inputProfitByMonth();
        bestMonth(profitByMonth);
        worstMonth(profitByMonth);
    }

    public static int[] inputProfitByMonth() throws IOException {
        System.out.println("Введите прибыль компании за год (январь - декабрь):");
        int[] profitByMonth = new int[12];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 12; i++) {
            System.out.print(whichMonth(i) + ": ");
            String line = reader.readLine();
            int monthProfit = Integer.parseInt(line);
            profitByMonth[i] = monthProfit;
        }
        return profitByMonth;
    }

    public static void bestMonth(int[] profitByMonth) {
        int bestMonth = profitByMonth[0];
        int bestMonthIndex = 0;
        for (int i = 1; i < profitByMonth.length; i++) {
            if (profitByMonth[i] > bestMonth) {
                bestMonth = profitByMonth[i];
                bestMonthIndex = i;
            }
        }
        System.out.print("Наибольшая прибыль: ");
        System.out.print(whichMonth(bestMonthIndex) + ", ");
        System.out.println(bestMonth + "$");
    }

    public static void worstMonth(int[] profitByMonth) {
        int worstMonth = profitByMonth[0];
        int worstMonthIndex = 0;
        for (int i = 1; i < profitByMonth.length; i++) {
            if (profitByMonth[i] < worstMonth) {
                worstMonth = profitByMonth[i];
                worstMonthIndex = i;
            }
        }
        System.out.print("Наименьшая прибыль: ");
        System.out.print(whichMonth(worstMonthIndex) + ", ");
        System.out.println(worstMonth + "$");

    }

    public static String whichMonth(int monthIndex) {
        String month = null;
        switch (monthIndex) {
            case 0:
                month = "январь";
                break;
            case 1:
                month = "февраль";
                break;
            case 2:
                month = "март";
                break;
            case 3:
                month = "апрель";
                break;
            case 4:
                month = "май";
                break;
            case 5:
                month = "июнь";
                break;
            case 6:
                month = "июль";
                break;
            case 7:
                month = "август";
                break;
            case 8:
                month = "сентябрь";
                break;
            case 9:
                month = "октябрь";
                break;
            case 10:
                month = "ноябрь";
                break;
            case 11:
                month = "декабрь";
                break;
        }
        return month;
    }
}
