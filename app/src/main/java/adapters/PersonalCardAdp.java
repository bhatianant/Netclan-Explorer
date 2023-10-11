package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.R;

public class PersonalCardAdp extends RecyclerView.Adapter<PersonalCardAdp.MyViewHolder> {
    public PersonalCardAdp(String[] name, Context context) {
        this.name = name;
        this.context = context;
    }

    String name [];
    Context context;

    @NonNull
    @Override
    public PersonalCardAdp.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View mylayout = LayoutInflater.from(context).inflate(R.layout.card,parent,false);
        MyViewHolder holder = new MyViewHolder(mylayout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalCardAdp.MyViewHolder holder, int position) {

        holder.name.setText(name[position]);

    }

    @Override
    public int getItemCount() {

        return name.length;
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView name,add,km,purpose,status;
        ProgressBar progressBar;
        ImageView photo;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);


        }
    }
}
