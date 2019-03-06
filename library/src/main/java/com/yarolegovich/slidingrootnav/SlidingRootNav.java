package com.yarolegovich.slidingrootnav;

/**
 * Created by yarolegovich on 25.03.2017.
 */

public interface SlidingRootNav {

    boolean isMenuClosed();

    boolean isMenuOpened();

    boolean isMenuLocked();

    boolean isMenuClosingOnContentClick();

    void closeMenu();

    void closeMenu(boolean animated);

    void openMenu();

    void openMenu(boolean animated);

    void setMenuLocked(boolean locked);

    void closeMenuOnContentClick(boolean shouldClose);

    SlidingRootNavLayout getLayout();

}
