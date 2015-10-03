package ru.lunegov91.remindme.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.lunegov91.remindme.R;

/**
 * Created by Антон on 30.09.2015.
 */
public class ExampleFrgament extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;
    private View _view;

    public static ExampleFrgament getInstance(){
        Bundle bundle = new Bundle();
        ExampleFrgament frgament = new ExampleFrgament();
        frgament.setArguments(bundle);
        return frgament;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        _view = inflater.inflate(LAYOUT,container,false);

        return _view;
    }
}
