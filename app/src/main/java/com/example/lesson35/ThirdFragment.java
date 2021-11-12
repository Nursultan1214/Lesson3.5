package com.example.lesson35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ThirdFragment extends Fragment {

    private EditText third;
    private Button btnNext3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        third = view.findViewById(R.id.et_data3);
        btnNext3 = view.findViewById(R.id.btn_next3);

        String strtext = getArguments().getString("CID");
        third.setText(strtext);


        btnNext3.setOnClickListener(view1 -> {
            String data = third.getText().toString();
            FourthFragment ff = new FourthFragment();
            Bundle args = new Bundle();
            args.putString("CID", data);
            ff.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.fm_container,ff).commit();




        btnNext3.setOnClickListener(v -> {
            getFragmentManager().beginTransaction().replace(R.id.fm_container, new FourthFragment()).commit();
        });
    });
}}