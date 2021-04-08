package com.example.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    void findGreaterFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,6,15});
        int result = someBusiness.findGreaterFromAllData();
        assertEquals(24, result);
    }
}