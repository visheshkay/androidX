package com.example.androidx.ui.socials;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.androidx.R;
import com.example.androidx.databinding.FragmentSocialsBinding;

public class SocialsFragment extends Fragment {

    private FragmentSocialsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SocialsViewModel SocialsViewModel =
                new ViewModelProvider(this).get(SocialsViewModel.class);

        binding = FragmentSocialsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button github=root.findViewById(R.id.github);
        Button linkedin=root.findViewById(R.id.linkedin);
        Button leetcode=root.findViewById(R.id.leetcode);
        Button twitter=root.findViewById(R.id.twitter);
        Button instagram=root.findViewById(R.id.instagram);
        Button facebook=root.findViewById(R.id.facebook);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri git_web= Uri.parse("https://github.com/GujjariSaiKumar0706");
                Intent github_intent=new Intent(Intent.ACTION_VIEW,git_web);
                startActivity(github_intent);
            }
        });


        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link_web= Uri.parse("https://www.linkedin.com/company/iste-vnrvjiet/posts/?feedView=all");
                Intent linkedin_intent=new Intent(Intent.ACTION_VIEW,link_web);
                startActivity(linkedin_intent);
            }
        });


        leetcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri leet_web= Uri.parse("https://leetcode.com");
                Intent leetcode_intent=new Intent(Intent.ACTION_VIEW,leet_web);
                startActivity(leetcode_intent);
            }
        });


        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri twitter_web= Uri.parse("https://x.com/home");
                Intent twitter_intent=new Intent(Intent.ACTION_VIEW,twitter_web);
                startActivity(twitter_intent);
            }
        });


        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri insta_web= Uri.parse("https://www.instagram.com/iste_vnrvjiet/");
                Intent instagram_intent=new Intent(Intent.ACTION_VIEW,insta_web);
                startActivity(instagram_intent);
            }
        });


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri fac_web= Uri.parse("https://www.facebook.com/");
                Intent facebook_intent=new Intent(Intent.ACTION_VIEW,fac_web);
                startActivity(facebook_intent);
            }
        });

      return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}