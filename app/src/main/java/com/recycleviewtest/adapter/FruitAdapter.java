package com.recycleviewtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.recycleviewtest.R;
import com.recycleviewtest.bean.Fruit;

import java.util.List;

/**
 * Created by 12191 on 2017/12/4.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private  List<Fruit> mFruitList;
    public FruitAdapter(List<Fruit> fruitList){
        mFruitList= fruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder= new ViewHolder(view);

        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position= holder.getAdapterPosition();
                Fruit fruit= mFruitList.get(position);
                Toast.makeText(view.getContext(),"you clicked view"+fruit.getFruitName(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.fruitImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position= holder.getAdapterPosition();
                Fruit fruit= mFruitList.get(position);
                Toast.makeText(view.getContext(),"you clicked image"+fruit.getFruitImg(),Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit= mFruitList.get(position);
        holder.fruitImg.setImageResource(fruit.getFruitImg());
        holder.fruitTxt.setText(fruit.getFruitName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView fruitImg;
        TextView fruitTxt;
        View fruitView;

        public ViewHolder(View itemView) {
            super(itemView);
            fruitImg= itemView.findViewById(R.id.item_img);
            fruitTxt= itemView.findViewById(R.id.item_txt);
            fruitView= itemView;
        }
    }
}
