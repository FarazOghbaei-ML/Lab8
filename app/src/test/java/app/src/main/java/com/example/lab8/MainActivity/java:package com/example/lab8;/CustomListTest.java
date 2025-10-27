package app/src/main/java/com/example/lab8/MainActivity.java:package com.example.lab8;;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    // Empty CustomList (matches course slides)
    private CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /** addCity should increase count by 1 */
    @Test
    public void addCity_increasesCountByOne() {
        list = MockCityList();
        int before = list.getCount();               // or countCities() in some templates
        list.addCity(new City("Estevan","SK"));
        assertEquals(before + 1, list.getCount());
    }
}
