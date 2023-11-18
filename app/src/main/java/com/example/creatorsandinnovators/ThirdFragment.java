package com.example.creatorsandinnovators;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.creatorsandinnovators.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {
    //pitch a new idea

    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       binding.ideaSharing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go to creator view
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FourthFragment);
            }
        });
       binding.ideaView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //TODO display list view
               //view list
               System.out.println("coming soon");
           }
       });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
