package com.example.lab8;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    private CustomList MockCityList() {
        return new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCity_increasesCountByOne() {
        list = MockCityList();
        int before = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(before + 1, list.getCount());
    }

    @Test
    public void hasCity_falseThenTrueAfterAdd() {
        list = MockCityList();
        City e = new City("Edmonton","AB");
        assertFalse(list.hasCity(e));
        list.addCity(e);
        assertTrue(list.hasCity(e));
    }
    @org.junit.Test
    public void deleteCity_removesAndDecrements() {
        list = MockCityList();
        City a = new City("Airdrie","AB");
        City b = new City("Banff","AB");
        list.addCity(a);
        list.addCity(b);
        int before = list.getCount();
        list.deleteCity(a);
        assertEquals(before - 1, list.getCount());
        assertFalse(list.hasCity(a));
        assertTrue(list.hasCity(b));
    }
}
