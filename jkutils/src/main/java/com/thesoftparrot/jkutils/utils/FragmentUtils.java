package com.thesoftparrot.jkutils.utils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentUtils {

    private static FragmentUtils ourInstance;
    public static FragmentUtils getOurInstance() {

        if(ourInstance == null)
            ourInstance = new FragmentUtils();

        return ourInstance;
    }

    private FragmentUtils() {}

    // Add Fragment and add it to back-stack
    public void addFragment(FragmentManager fm, Fragment fragment, int container, boolean addToBackStack){

        FragmentTransaction ft = fm.beginTransaction();

        if(addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        else
            ft.addToBackStack(null);

        ft.add(container, fragment, fragment.getTag());
        ft.commit();
    }

    // Replace Fragment and add it to back-stack
    public void replaceFragment(FragmentManager fm, Fragment fragment, int container, boolean addToBackStack){

        FragmentTransaction ft = fm.beginTransaction();

        if(addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        else
            ft.addToBackStack(null);

        ft.replace(container, fragment, fragment.getTag());
        ft.commit();
    }

    // Remove Fragment
    public void removeFragment(FragmentManager fm, Fragment fragment){
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(fragment);
        ft.commit();
    }

    // Remove Fragment from Top of the Stack
    public void removeTopFragment(FragmentManager fm){
        fm.popBackStack();
    }

}
