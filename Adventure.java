import java.util.ArrayList;
public class Adventure
{
    public static void main(String[] args)
    {
        // Parser und Spieler erstellen
        Parser parse = new Parser();
        Spieler Merkel = new Spieler();
        
        //Moebel erstellen
        Moebel Schrank_B = new Moebel("Schrank","Ein Kallax Regal");
        Moebel Schreibtisch_B = new Moebel("Schreibtisch","Ein normaler Schreibtisch ohne stuhl?");
        
        Moebel TuerBuero_G = new Moebel("Buerotuer", "Eine schoene Holztuer. Auf dem Messingschild daneben steht 'Dr.Merkel'.");
        
        
        //Raeume erstellen
        ArrayList<Integer> nbr = new ArrayList<Integer>();
        nbr.add(1);
        
        ArrayList<Moebel> mbl = new ArrayList<Moebel>();
        mbl.add(Schrank_B);
        mbl.add(Schreibtisch_B);
        
        Raum Buero = new Raum(0,nbr,"Du siehst ein Buero mit einem Schreibtisch",mbl);
        
        
        nbr = new ArrayList<Integer>();
        nbr.add(0);
        
        mbl = new ArrayList<Moebel>();
        mbl.add(TuerBuero_G);
        
        Raum Gang = new Raum(1,nbr,"Du siehst einen kurzen Gang mit einer Tuer.",mbl);
        
        
        //Karte erstellen
        ArrayList<Raum> RaumListe = new ArrayList<Raum>();
        RaumListe.add(Buero);
        RaumListe.add(Gang);
        
        Karte Anstalt = new Karte(RaumListe);
        Raum aktuellerRaum = Anstalt.RaumNr.get(Merkel.Ort);
        
        
        // Item batterie_testraum = new Item("Batterie", "Eine Halb volle Batterie. Warum halb voll? Weil halb leer pessimistisch waere.");
        // Item testingcube = new Item("Testing Cube", "Ein Wuerfel, nur zu Testzwecken. Vielleicht kann man ihn irgendwann benutzen?");
        
        // Spieler Foo = new Spieler();
        // Foo.insInventar(testingcube);
        // Foo.insInventar(batterie_testraum);
        // Foo.liesInventar();
        
        // testingcube.anschauen();
        
        //Schrank_B.anschauen();
        //Buero.anschauen();
        boolean run = true;
        while (run == true) {
            run = parse.parse(aktuellerRaum);
        }
    }
}
