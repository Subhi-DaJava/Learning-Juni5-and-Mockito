package com.uyghurjava.mokitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {
	
	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15 , 5, 3});
		
		SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
		
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(25, result);
	}
	@Test
	void findTheGreatestFromAllData_OneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{40});
		
		SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(40, result);
	}


}


