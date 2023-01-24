 cdimport java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Class Variable
    private ArrayList<MenuItem>menuItems = new ArrayList<>();
    private Date lastUpdated;
    //Constructors
    public Menu() {
        this.lastUpdated = new Date();
    }
    //Methods
    //Getters and Setters

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
