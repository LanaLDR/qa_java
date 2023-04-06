package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline,"Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals("Не совпадает кол-во котят", 1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(food);
        assertEquals("Пища не совпадает", food, lion.getFood());
    }

    @Test
    public void lionExceptionTest() {
        assertThrows(Exception.class, () -> new Lion(feline, "кек"));
    }
}