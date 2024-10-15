package com.example.androidx.ui.socials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.androidx.databinding.FragmentSocialsBinding;

public class SocialsFragment extends Fragment {

    private FragmentSocialsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SocialsViewModel SocialsViewModel =
                new ViewModelProvider(this).get(SocialsViewModel.class);

        binding = FragmentSocialsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSocials;
        SocialsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}