package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		IEtal etalSanglier = new Etal<>();
		IEtal etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;

	}
	
}
