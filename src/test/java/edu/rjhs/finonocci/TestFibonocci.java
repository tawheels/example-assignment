package edu.rjhs.finonocci;

import org.junit.Assert;
import org.junit.Test;

import edu.rjhs.fibonnocci.Fibonocci;

public class TestFibonocci {
	@Test
	public void TestValues() throws Exception 
	{
		Fibonocci fibonocci = new Fibonocci();
		int values[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
		for (int count = 0; count < values.length; count++) {
			Assert.assertEquals(values[count], fibonocci.getSeriesValue(count));
		}
	}
}
