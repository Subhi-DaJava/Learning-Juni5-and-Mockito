package com.uyghurjava.mokitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {
	
	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataServiceStub1 dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(25, result);
	}
	@Test
	void findTheGreatestFromAllData_OneValue() {
		DataServiceStub2 dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
		int result = business.findTheGreatestFromAllData();
		
		assertEquals(40, result);
	}


}

class DataServiceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[]{25, 15 , 5, 3};
	}
	
}

class DataServiceStub2 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[]{40};
	}
	
}
