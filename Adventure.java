
/**
 * 
 */
public class Adventure
{
    public static void main(String[] args)
    {
        Item batterie_testraum = new Item("Batterie", "Eine Halb volle Batterie. Warum halb voll? Weil halb leer pessimistisch waere.");
        Item testingcube = new Item("Testing Cube", "Ein Wuerfel, nur zu Testzwecken. Vielleicht kann man ihn irgendwann benutzen?");
        
        Spieler Foo = new Spieler();
        Foo.insInventar(testingcube);
        Foo.insInventar(batterie_testraum);
        Foo.liesInventar();
        
        testingcube.anschauen();
    }
}
