package com.project.expandablenavigationdrawer.navigation;

public class BaseItem {
    private String mName;
    private int icon;

    public BaseItem(String mName, int icon) {
        this.mName = mName;
        this.icon = icon;
    }

    public BaseItem(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public int getIcon() {
        return icon;
    }

}
