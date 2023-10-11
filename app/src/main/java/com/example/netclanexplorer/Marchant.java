package com.example.netclanexplorer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapters.MarchantcardAdp;


public class Marchant extends Fragment {

    String name []= {"Anant","Shiva","Gorav Poswal","Aaksha Kumar"};
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_marchant, container, false);

        recyclerView = view.findViewById(R.id.rvM);
        MarchantcardAdp marchantcardAdp = new MarchantcardAdp(name,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(marchantcardAdp);

        return view;
    }
}