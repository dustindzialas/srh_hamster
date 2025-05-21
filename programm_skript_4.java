import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class programm_skript_4 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int koerner = 1;

public void main() {
    wiederhole_umsEck(6);
    gib();
    rechtsUm();
    wiederhole_umsEck(6);
    linksUm();
    System.out.println("Hamster hat " + koerner + " Koerner im Maul.");
}

void rechtsUm() {   //methode für rechtsdrehung
	linksUm();
	linksUm();
	linksUm();
}

void umsEck() {    //methode fuer linksum, vor, rechtsum, vor
	linksUm();
	vor();
	rechtsUm();
	vor();
}

//funktion benannt //parameter angegeben (typ+name)
void wiederhole_umsEck (int count) { //funktionskopf //naechste 3 codezeilen sind funktionsrumpf
	// schleife initiiert //schleifenvariable deklariert+definiert 
	//abbruchkriterium festgelegt // inkrement festgelegt
	for (int i = 0; i < count; i=i+1) {  //schleifenkopf //naechste zeile ist schleifenrumpf
		umsEck();
	}
}

	}