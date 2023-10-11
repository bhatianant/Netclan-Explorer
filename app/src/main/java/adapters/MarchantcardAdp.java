package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.R;

public class MarchantcardAdp extends RecyclerView.Adapter<MarchantcardAdp.MyViewHolder> {
    public MarchantcardAdp(String[] name, Context context) {
        this.name = name;
        this.context = context;
    }

    String name[];
    Context context;

    @NonNull
    @Override
    public MarchantcardAdp.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View Mylayout = LayoutInflater.from(context).inflate(R.layout.cartmarchant,parent,false);

        MyViewHolder holder = new MyViewHolder(Mylayout);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MarchantcardAdp.MyViewHolder holder, int position) {


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

            textView = (TextView) itemView.findViewById(R.id.nameMarchant);
        }
    }
}
