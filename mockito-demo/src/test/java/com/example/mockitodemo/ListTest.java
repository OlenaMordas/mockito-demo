package com.example.mockitodemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    @Test
    public void testSize_multipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
    }

    @Test
    public void testGet(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Some string");
        assertEquals("Some string",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }

    @Test
    public void getGenericParam(){
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Other string");
        assertEquals("Other string",listMock.get(0));
        assertEquals("Other string",listMock.get(10));
    }
}
