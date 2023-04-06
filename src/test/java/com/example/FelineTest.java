package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void eatMeatTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Пища не совпадает", food, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Неверное семейство", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals("Метод должен возвращать 1", 1, feline.getKittens());
    }

    @Test
    public void GetKittensCountTest() {
        assertEquals("Метод должен возвращать переданное значение", 3, feline.getKittens(3));
    }
}