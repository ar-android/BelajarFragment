package ocit.id.belajarfragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ocit.id.belajarfragment.R;

/**
 * Created by Ahmad on 13/10/2015.
 */
public class TabFragment2 extends Fragment{

    public TabFragment2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflanter, ViewGroup viewGroup,
                             Bundle savedInstanstate){
        return inflanter.inflate(R.layout.tab2, viewGroup, false);
    }
}
