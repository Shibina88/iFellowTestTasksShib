package com.github.shibina88.task4;


import java.util.Scanner;

public class AngleOfClocksHands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запрашиваем у пользователя ввод времени
        System.out.print("Введите часы в 24 часовом формате: ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();
        double angle = calculateAngleOfClocksHands(hours, minutes);
        System.out.printf("Угол между часовой и минутной стрелками для %02d:%02d составляет %.2f градусов\n", hours, minutes, angle);
    }

    public static double calculateAngleOfClocksHands(int hours, int minutes) {
        // Нормализуем часы в диапазоне от 0 до 11
        hours = hours % 12;

        // Вычисляем угол для часовой стрелки (каждый час - 30 градусов плюс часть от минут)
        double hourAngle = (hours * 30) + (minutes * 0.5);

        // Вычисляем угол для минутной стрелки (каждая минута - 6 градусов)
        double minuteAngle = minutes * 6;

        // Вычисляем разницу между углами
        double angle = Math.abs(hourAngle - minuteAngle);

        // Угол не должен превышать 180 градусов
        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;
    }
}
