package edu.rjhs.fibonnocci;

public class Fibonocci {
	int [] values;
	
	public Fibonocci() {
		super();
		createSeries();
	}

	public void createSeries() {
		values = new int[15];
		values[0] = 0;
        values[1] = 1;
        for(int i=2; i < 15; i++){
            values[i] = values[i-1] + values[i-2];
        }
	}
	
	public int getSeriesValue(int count) {
		return values[count];
	}
}
