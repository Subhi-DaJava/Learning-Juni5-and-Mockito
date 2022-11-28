package com.uyghurjava.mokitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockAnnotationTest {
	@Mock 
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl business;
	
	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15 , 5, 3});
		
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(25, result);
	}
	@Test
	void findTheGreatestFromAllData_OneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{40});
		
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(40, result);
	}
	
	@Test
	void findTheGreatestFromAllData_EmptyArray() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
		
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(Integer.MIN_VALUE, result);
	}


}


