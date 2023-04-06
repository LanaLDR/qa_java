package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametersTest {
    Feline feline;
    private boolean hasMane;
    private String sex;
    public LionParametersTest(boolean hasMane, String sex){
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getHasManeInfo(){
        return new Object[][]{
                {true, "Самец"},
                {false, "Самка"},
        };
    }
    @Test
    public void doesHaveManeTest() throws Exception{
        Lion lion = new Lion(feline, sex);
        assertEquals("Не совпадает наличие гривы", hasMane, lion.doesHaveMane());
    }

}
