package com.example.netclanexplorer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapters.PersonalCardAdp;


public class Personal extends Fragment {

    RecyclerView recyclerView;

    String name []= {"Anant","Shiva","Gorav Poswal","Aaksha Kumar"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_personal, container, false);

        
        recyclerView = view.findViewById(R.id.rv);
        PersonalCardAdp personalCardAdp = new PersonalCardAdp(name,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(personalCardAdp);
        return view;


    }
}