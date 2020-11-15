package com.learning.Mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessStubTest {

    @Test
    public void findTheGreatestFromAllData() {
     SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
     int result = businessImpl.findTheGreatestFromAllData();
     assertEquals(24, result);
    }

    class DataServiceStub implements DataService {

        @Override
        public int[] retrieveAllData() {
            return new int[] {24,6,15};
        }
    }
}
