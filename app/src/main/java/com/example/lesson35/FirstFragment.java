package com.example.lesson35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    private EditText first;
    private Button btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated( View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        first = view.findViewById(R.id.et_data);
        btnNext = view.findViewById(R.id.btn_next);



        btnNext.setOnClickListener(view1 -> {
            String data = first.getText().toString();
            SecondFragment fr = new SecondFragment();
            Bundle args = new Bundle();
            args.putString("CID", data);
            fr.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.fm_container,fr).commit();
        });

//        btnNext.setOnClickListener(v -> {
//            String id = first.getText().toString();
//            FirstFragment fragment = new FirstFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("position", id);
//            fragment.setArguments(bundle);
//            getFragmentManager().beginTransaction().replace(R.id.fm_container,new SecondFragment()).commit();
//        });




    }
}