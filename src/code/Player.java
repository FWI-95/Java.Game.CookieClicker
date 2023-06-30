package code;

public class Player {
	
	public int Score;
	public UpgradeHandler upgrades;
	public HelperHandler helpers;
	
	public Player() {
		Score = 0;
		upgrades = new UpgradeHandler();
		helpers = new HelperHandler();

	}
	
	public void Click() {
		Score += upgrades.CookiesPerClick();
		PrintScore();
	}

	public void Tick() {
		Score += helpers.CookiesPerSecond(upgrades);
	}
	
	public void PrintScore() {
		System.out.println(""+Score);
	}





	
	public void BuyCursor(){
		Score -= helpers.GetCostCursor();
		helpers.AddCursor();
	}
	public void BuyGrandma(){
		Score -= helpers.GetCostGrandma();
		helpers.AddGrandma();
	}
	public void BuyFarm(){
		Score -= helpers.GetCostFarm();
		helpers.AddFarm();
	}
	public void BuyMine(){
		Score -= helpers.GetCostMine();
		helpers.AddMine();
	}
}
