package com.example.netclanexplorer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapters.BusinessCardAdp;


public class Business extends Fragment {

    String name []= {"Anant","Shiva","Gorav Poswal","Aaksha Kumar"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rvB);
        BusinessCardAdp businessCardAdp = new BusinessCardAdp(name,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(businessCardAdp);


        return view;
    }
}