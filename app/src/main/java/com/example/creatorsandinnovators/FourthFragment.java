package com.example.creatorsandinnovators;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.creatorsandinnovators.databinding.FragmentFourthBinding;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class FourthFragment extends Fragment {
    //find an idea

    private FragmentFourthBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFourthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.upload.setOnClickListener(new View.OnClickListener() {
            //add files
            @Override
            public void onClick(View view) {
                System.out.println("File upload coming soon!");
            }

        });
        binding.publish.setOnClickListener(new View.OnClickListener() {
            //TODO make it add the idea to the database
            //add idea to db
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
