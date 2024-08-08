package com.github.shibina88.task3;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод температуры в градусах Цельсия
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        // Запрашиваем у пользователя выбор конвертации
        System.out.print("Введите единицу для конвертации (K для Кельвинов, F для Фаренгейтов, R для Реомюра): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        BaseConverter converter = new BaseConverter();
        double result;

        // Выполняем конвертацию на основе выбора пользователя
        switch (unit) {
            case 'K':
                result = converter.convertToKelvin(celsius);
                System.out.printf("%.2f градусов Цельсия = %.2f Кельвин\n", celsius, result);
                break;
            case 'F':
                result = converter.convertToFahrenheit(celsius);
                System.out.printf("%.2f градусов Цельсия = %.2f Фаренгейтов\n", celsius, result);
                break;
            case 'R':
                result = converter.convertToReomur(celsius);
                System.out.printf("%.2f градусов Цельсия = %.2f градусов Реомюра\n", celsius, result);
                break;

            default:
                System.out.println("Неверная единица конвертации. Пожалуйста, выберите K для Кельвинов, F для Фаренгейтов или R для градусов Реомюра");
        }
    }


    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double convertToReomur(double celsius) {
        return celsius * 8 / 10;
    }
}

