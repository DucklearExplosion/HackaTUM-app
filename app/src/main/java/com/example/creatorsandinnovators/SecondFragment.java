package com.example.creatorsandinnovators;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.creatorsandinnovators.databinding.FragmentSecondBinding;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SecondFragment extends Fragment {
    //find an idea

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //TODO make pitches show up here



        binding.upvote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //TODO upvote in DB
            }
        });
        binding.downvote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO downvote in DB
            }
        });

    }
    //client object, all requests are executed as methods of the object
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {

//configure request , url says where the request should be sent
        Request request = new Request.Builder()
                .url(url)
//build finishes the configuration
                .build();

//client new call execute executes the request
        try (Response response = client.newCall(request).execute()) {
//.body.string prints the response body as a string, this can then be parsed as json (another library)
            return response.body().string();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}