package com.example.creatorsandinnovators;


import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.creatorsandinnovators.databinding.FragmentFourthBinding;
import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
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
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
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
                TextInputEditText title=binding.ideaTitle;
                TextInputEditText description=binding.ideaDescription;
                //stub user id
                Integer userid=1;
                String token="abcdef";
                JSONObject json=new JSONObject();
                try {
                    OkHttpClient client=new OkHttpClient();
                    json.put("auth",token);
                    json.put("title",title.getText());
                    json.put("desciption",description.getText());
                    json.put("user",userid);
                    RequestBody body = RequestBody.create(
                            MediaType.parse("application/json"), json.toString());
                    Request request = new Request.Builder().url("http://localhost:8812/innovation").post(body).build();
                    Response resp=client.newCall(request).execute();
                    if (resp.isSuccessful()) {
                    //idk, try again
                    }
                    resp.close();
                } catch (JSONException | IOException ignored) {}
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
