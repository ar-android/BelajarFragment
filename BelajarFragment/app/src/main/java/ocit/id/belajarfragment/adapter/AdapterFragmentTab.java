package ocit.id.belajarfragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ocit.id.belajarfragment.fragment.TabFragment1;
import ocit.id.belajarfragment.fragment.TabFragment2;

/**
 * Created by Ahmad on 13/10/2015.
 */

public class AdapterFragmentTab extends FragmentPagerAdapter {

    String[] title = new String[]{"Tab 1", "Tab2"};

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    public AdapterFragmentTab(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment tab = null;
        switch (position) {
            case 0:
                tab = new TabFragment1();
                break;
            case 1:
                tab = new TabFragment2();
                break;
        }
        return tab;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
