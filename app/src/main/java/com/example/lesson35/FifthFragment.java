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

public class FifthFragment extends Fragment {

    private EditText fifth;
    private Button btnNext5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth, container, false);

    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fifth = view.findViewById(R.id.et_data5);
        btnNext5 = view.findViewById(R.id.btn_next5);

        String strtext = getArguments().getString("CID");
        fifth.setText(strtext);
    }
}