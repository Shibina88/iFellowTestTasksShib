package com.github.shibina88.task2;

import java.util.HashSet;
import java.util.Set;

public class PrintDoublonSymbole {
    public static void main(String[] args) {
        String word = "Hello"; // Задаем слово, в котором будем искать повторяющийся символ
        char duplicate = printDoublonSymbole(word); // Вызываем метод для поиска повторяющегося символа

        if (duplicate != '\0') { // Проверяем, был ли найден повторяющийся символ
            System.out.println("Повторяющийся символ: " + duplicate); // Выводим найденный символ
        } else {
            System.out.println("Повторяющихся символов нет."); // Выводим сообщение, если повторяющихся символов нет
        }
    }

    /**
     * Метод для поиска первого повторяющегося символа в строке
     *
     * @param word Строка, в которой ищем повторяющийся символ
     * @return Первый найденный повторяющийся символ или '\0', если повторяющихся символов нет
     */
    public static char printDoublonSymbole(String word) {
        Set<Character> seenCharacters = new HashSet<>(); // Создаем набор для хранения уже встреченных символов

        // Проходим по каждому символу строки
        for (char ch : word.toCharArray()) {
            if (seenCharacters.contains(ch)) { // Если символ уже встречался, возвращаем его
                return ch;
            } else {
                seenCharacters.add(ch); // Если символ не встречался, добавляем его в набор
            }
        }
        return '\0'; // Возвращаем null-символ, если повторяющихся символов нет
    }
}

