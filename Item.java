
/**
 *
 */
public class Item
{
    private String Name;
    private String Beschreibung;
    private boolean Mitgenommen;
    
    public Item(String item_name, String item_beschreibung)
    {
        this.Name = item_name;
        this.Beschreibung = item_beschreibung;
        this.Mitgenommen = false;
    }

}
