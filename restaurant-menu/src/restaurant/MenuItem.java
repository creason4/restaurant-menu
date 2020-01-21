package restaurant;



public class MenuItem {

    private final int meuId;
    private final String description;
    private final double price;
    private final MenuCategory category;
    private boolean isNew;

    public MenuItem(int menId, String description, double price, MenuCategory category, boolean isNew) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(int menuId, String description, double price, MenuCategory category) {
        this(menuId, description, price, category, false);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getMenuId() {
        return menuId;
    }

    public String toString() {
        return menuId + " " + description + " " + price + " " category + " " + (isNew ? "new menu item" : "old menu item");
    }

    public boolean equals(Object 0) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) o;

        return this.getCategory() == menuItem.getCategory() && this.getDescription() == menuItem.getDescription() && this.getMenuId() == menuItemId() && this.getPrice() == menuItem.getPrice();

    }
}
