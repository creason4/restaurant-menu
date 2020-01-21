package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayLists;
import java.util.List;

public class Menu {

    private List<MenuItem> menu;
    private LocalDateTime lastUpdated;

    public Menu() {
        this.menu = new ArrayLusts<>();
        this.lastUpdated = LocalDateTime.now();
    }

    public void addMenuItem(MenuItem menItem) {
        menu.add(menuItem);
        lastUpdated = LocalDateTime.now();
    }

    public void removeMenuItem(int menuItemID) {
        for (int i=0; i < menu.size(); i++) {
            if (menu.get(i).getMenuId() == menuItemId) {
                menu.remove(i);
                lastUpdated = LocalDateTime.now();
                break;
            }
        }
    }

    public list<MenuItem> getMenu() {
        return menu;
    }
    Public LocationDateTime getLastUpdated() {
        return lastUpdated
    }
}
