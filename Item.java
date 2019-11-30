
/**
 *
 */
public class Item
{
    public String Name;
    public String Beschreibung;
    public boolean Mitgenommen;
    
    public Item(String item_name, String item_beschreibung)
    {
        this.Name = item_name;
        this.Beschreibung = item_beschreibung;
        this.Mitgenommen = false;
    }
    
    public void anschauen() {
        System.out.println(this.Name + ": " + this.Beschreibung);
    }
}
