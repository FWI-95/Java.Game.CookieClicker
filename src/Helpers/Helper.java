package Helpers;

public class Helper {
	public double CostMultiplicator;
	public int BaseCost;
	public double BaseCpS;

	public int CookiesPerSecond(int HelperCount){

		return (int) BaseCpS;
	}

	public int GetCost(int HelperCount){
		return (int) (BaseCost * (HelperCount * CostMultiplicator));
	}

}
