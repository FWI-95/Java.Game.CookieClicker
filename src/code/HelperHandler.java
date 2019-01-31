package code;

import java.util.ArrayList;

import Helpers.Helper;

public class HelperHandler {
	ArrayList<Helper> Helpers;
	
	public final int CURSOR = 0;
	public final int GRANDMA = 1;
	public final int FARM = 2;
	
	public HelperHandler() {
		Helpers = new ArrayList<Helper>();
	}
	
	public int CalcCps() {
		int CpS = 0;
		for(int x = 0; x < Helpers.size(); x++) {
			CpS += Helpers.get(x).CpS;
		}
		
		return CpS;
	}
	
}
