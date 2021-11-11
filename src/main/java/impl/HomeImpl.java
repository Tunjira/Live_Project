package impl;

import pages.HomePage;

public class HomeImpl {
    HomePage page;

    public HomePage getPage() {
        if(page == null)
            page = new HomePage();
        return page;
    }
}
