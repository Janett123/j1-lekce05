package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Osoba rumcajs = new Osoba();

        Adresa adresaRumcajs = new Adresa();
        adresaRumcajs.setUlice("Tlapakova");


        rumcajs.setPracovniEmail("rumcajs@rumcajs.cz");
        rumcajs.setSoukromýEmail("rumcajs2@rumcajs.cz");
        rumcajs.setAdresa(adresaRumcajs);


        System.out.println(rumcajs.getPracovniEmail());
        System.out.println(rumcajs.getSoukromýEmail());
        System.out.println(rumcajs.getAdresa().getUlice());




    }

}
