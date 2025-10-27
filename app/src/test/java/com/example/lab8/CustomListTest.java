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
    }}
