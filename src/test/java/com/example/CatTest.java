package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        assertEquals("Звуки кота на совпадают", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(food);
        List<String> expendedFood = food;
        List<String> actualFood = cat.getFood();
        assertEquals("Пища не совпадает", expendedFood, actualFood);
    }
}