public class Adventure
{
    public static void main(String[] args)
    {
        Parser parse = new Parser();
        
        Moebel Schrank_B = new Moebel("Schrank","Ein Kallax Regal");
        Moebel Schreibtisch_B = new Moebel("Schrank","Ein normaler Schreibtisch ohne stuhl?");
        
        int[] nbr = {1};
        Moebel[] mbl = {Schrank_B,Schreibtisch_B};
        
        Raum Buero = new Raum(0,nbr,"Du siehst ein Büro mit einem Schreibtisch",mbl);
        
        // Item batterie_testraum = new Item("Batterie", "Eine Halb volle Batterie. Warum halb voll? Weil halb leer pessimistisch waere.");
        // Item testingcube = new Item("Testing Cube", "Ein Wuerfel, nur zu Testzwecken. Vielleicht kann man ihn irgendwann benutzen?");
        
        // Spieler Foo = new Spieler();
        // Foo.insInventar(testingcube);
        // Foo.insInventar(batterie_testraum);
        // Foo.liesInventar();
        
        // testingcube.anschauen();
        
        Schrank_B.anschauen();
        Buero.anschauen();
        /*for (int i = 0; i < 10; i++) {
            parse.parse();
        }*/
    }
}
