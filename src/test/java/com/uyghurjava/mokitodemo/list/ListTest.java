package com.uyghurjava.mokitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	@Test
	void simpleTest() {
		List<?> listMock = mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	void multipleReturnsTest() {
		List<?> listMock = mock(List.class);
		when(listMock.size()).thenReturn(3).thenReturn(2);
		assertEquals(3, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	void parametersTest() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));
		
	}
	
	@Test
	void genericParametersTest() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");
		assertEquals("SomeOtherString", listMock.get(0));
		assertEquals("SomeOtherString", listMock.get(5));
		
	}
}
