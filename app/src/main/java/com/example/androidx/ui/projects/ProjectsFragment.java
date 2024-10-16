package com.example.androidx.ui.projects;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidx.Adapters.ProjectAdapter;
import com.example.androidx.Models.ProjectModel;
import com.example.androidx.R;
import com.example.androidx.databinding.FragmentProjectsBinding;

import java.util.ArrayList;
import java.util.List;

public class ProjectsFragment extends Fragment {

    private FragmentProjectsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProjectsViewModel ProjectsViewModel =
                new ViewModelProvider(this).get(ProjectsViewModel.class);

        binding = FragmentProjectsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<ProjectModel> projects = new ArrayList<ProjectModel>();
        projects.add(new ProjectModel(
                R.drawable.insta,
                "Project 1",
                "Description for project 1",
                "https://project1.example.com"
        ));
        projects.add(new ProjectModel(
                R.drawable.insta,
                "Project 2",
                "Description for project 2",
                "https://project2.example.com"
        ));
        projects.add(new ProjectModel(
                R.drawable.insta,
                "Project 3",
                "Description for project 3",
                "https://project3.example.com"
        ));
        projects.add(new ProjectModel(
                R.drawable.insta,
                "Project 4",
                "Description for project 4",
                "https://project4.example.com"
        ));
        projects.add(new ProjectModel(
                R.drawable.insta,
                "Project 5",
                "Description for project 5",
                "https://project5.example.com"
        ));
        projects.add(new ProjectModel(
                R.drawable.insta,
                "Project 6",
                "Description for project 6",
                "https://project6.example.com"
        ));
        RecyclerView rv = root.findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(root.getContext()));
        rv.setAdapter(new ProjectAdapter(getContext(),projects));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}