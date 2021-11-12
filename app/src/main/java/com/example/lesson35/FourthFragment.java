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

public class FourthFragment extends Fragment {
    private EditText fourth;
    private Button btnNext4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fourth = view.findViewById(R.id.et_data4);
        btnNext4 = view.findViewById(R.id.btn_next4);

        String strtext = getArguments().getString("CID");
        fourth.setText(strtext);

        btnNext4.setOnClickListener(view1 -> {
            String data = fourth.getText().toString();
            FifthFragment ff2 = new FifthFragment();
            Bundle args = new Bundle();
            args.putString("CID", data);
            ff2.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.fm_container,ff2).commit();


            btnNext4.setOnClickListener(v -> {
            getFragmentManager().beginTransaction().replace(R.id.fm_container, new FifthFragment()).commit();
        });
    });


}}