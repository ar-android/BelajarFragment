package ocit.id.belajarfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ocit.id.belajarfragment.R;

/**
 * Created by Ahmad on 13/10/2015.
 */
public class TabFragment1 extends Fragment{

    public TabFragment1() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1, container, false);

    }


}