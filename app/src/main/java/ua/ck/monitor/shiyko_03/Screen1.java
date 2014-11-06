package ua.ck.monitor.shiyko_03;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.ck.monitor.shiyko_03.R;

public class Screen1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("MyApp", "------------------ onCreateView ---- Screen1");
        return inflater.inflate(R.layout.fragment_main, null);
    }
}