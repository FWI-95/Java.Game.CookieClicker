package Helpers.HelperUpgrades;

public class HelperUpgrade {
    private int CpSMultiplier;
    
    public int CpCModifier(int CurrentCpS) {
        return CurrentCpS * CpSMultiplier;
    }
}
