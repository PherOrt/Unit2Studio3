package com.company.restaurant.menu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdate;
    private ArrayList<MenuItem> MenuItems = new ArrayList<>();

    public Menu(Date lastUpdate){
        this.lastUpdate = lastUpdate;

    }


    public ArrayList<MenuItem> getMenuItems(){
        return MenuItems;
    }
    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setMenuItems(ArrayList<MenuItem> aMenuItems) {
        MenuItems = aMenuItems;
    }

    public void setLastUpdate(Date aLastUpdate) {
        this.lastUpdate = aLastUpdate;
    }
}
