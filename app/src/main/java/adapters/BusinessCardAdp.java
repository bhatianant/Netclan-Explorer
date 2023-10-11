package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.R;

public class BusinessCardAdp extends RecyclerView.Adapter<BusinessCardAdp.MyViewHolder> {
    public BusinessCardAdp(String[] name, Context context) {
        this.name = name;
        this.context = context;
    }

    String name[];
    Context context;

    @NonNull
    @Override
    public BusinessCardAdp.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mylayout = LayoutInflater.from(context).inflate(R.layout.cardbusness,parent,false);
        MyViewHolder holder = new MyViewHolder(mylayout);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BusinessCardAdp.MyViewHolder holder, int position) {

        holder.textView.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
    class MyViewHolder extends RecyclerView.ViewHolder{


        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.namebuss);

        }
    }


}
