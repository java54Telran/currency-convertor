package telran.currency.service;

import java.util.HashMap;
import java.util.List;

public class AbstractCurrencyConvertor implements CurrencyConvertor {
protected HashMap<String, Double> rates; //key - currency ISO code;
//value - amount of code's units in 1 EUR
	@Override
	public List<String> strongestCurrencies(int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> weakestCurrencies(int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double convert(String codeFrom, String codeTo, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
