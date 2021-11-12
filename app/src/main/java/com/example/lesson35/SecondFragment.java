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

public class SecondFragment extends Fragment {

    private EditText second;
    private Button btnNext2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        second = view.findViewById(R.id.et_data2);
        btnNext2 = view.findViewById(R.id.btn_next2);

        String strtext = getArguments().getString("CID");
        second.setText(strtext);

        btnNext2.setOnClickListener(view1 -> {
            String data = second.getText().toString();
            ThirdFragment tf = new ThirdFragment();
            Bundle args = new Bundle();
            args.putString("CID", data);
            tf.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.fm_container,tf).commit();



        btnNext2.setOnClickListener(v -> {
            getFragmentManager().beginTransaction().replace(R.id.fm_container, new ThirdFragment()).commit();
        });
    });
}}