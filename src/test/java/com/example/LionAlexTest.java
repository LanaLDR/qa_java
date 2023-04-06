package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;
    @Test
    public void doesHaveManeTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertTrue("У Алекса должна быть грива", lionAlex.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lionAlex.getFood()).thenReturn(food);
        assertEquals("Не совпадает пища", food, lionAlex.getFood());
    }

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Не совпадает список друзей", List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Не совпадает место жительства", "Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("У Алекса 0 львят", 0 , lionAlex.getKittens());
    }
}