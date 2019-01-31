package code;

public class Player {
	
	public int Score;
	public int CpS;
	
	public Player() {
		Score = 0;
		CpS = 1;
		
	}
	
	public void Click() {
		Score += CpS;
	}
	
	public String GetScoreAsString() {
		Integer s = Score;
		return s.toString();
	}

}
