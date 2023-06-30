package code;

import Helpers.*;

public class HelperHandler {
	int cursors;
	int grandmas;
	int farms;
	int mines;
	
	Cursor cursor;
	Grandma grandma;
	Farm farm;
	Mine mine;

	public HelperHandler() {
		cursors = 1;
		grandmas = 1;
		farms = 1;
		mines = 1;

		cursor = new Cursor();
		grandma = new Grandma();
		farm = new Farm();
		mine = new Mine();
	}
	
	public int CookiesPerSecond(UpgradeHandler upgrades) {
		int CpS = 0;
		CpS += cursor.CookiesPerSecond(cursors);
		CpS += grandma.CookiesPerSecond(grandmas);
		CpS += farm.CookiesPerSecond(farms);
		CpS += mine.CookiesPerSecond(mines);
		
		return CpS;
	}

	public void AddCursor(){
		cursors++;
	}
	public void AddGrandma(){
		grandmas++;
	}
	public void AddFarm(){
		farms++;
	}
	public void AddMine(){
		mines++;
	}

	public int GetCostCursor(){
		return cursor.GetCost(cursors);
	}
	public int GetCostGrandma(){
		return grandma.GetCost(grandmas);
	}
	public int GetCostFarm(){
		return farm.GetCost(farms);
	}
	public int GetCostMine(){
		return mine.GetCost(mines);
	}
	
}
