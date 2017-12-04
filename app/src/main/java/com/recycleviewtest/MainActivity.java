package com.recycleviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.recycleviewtest.adapter.FruitAdapter;
import com.recycleviewtest.bean.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Fruit> fruitList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        recyclerView= findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        //瀑布流布局
        StaggeredGridLayoutManager staggeredGridLayoutManager= new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); //横向布局
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        FruitAdapter fruitAdapter= new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);
    }


    public  void initFruit(){
        for (int i=0; i<10; i++) {
            Fruit apple = new Fruit(R.mipmap.apple, getRandomLenthName("Apple"));
            fruitList.add(apple);
            Fruit banana = new Fruit(R.mipmap.banana, getRandomLenthName("Banana"));
            fruitList.add(banana);
            Fruit strawberry = new Fruit(R.mipmap.strawberry, getRandomLenthName("strawberry"));
            fruitList.add(strawberry);
            Fruit watermelon = new Fruit(R.mipmap.watermelon, getRandomLenthName("Watermelon"));
            fruitList.add(watermelon);
        }
    }

    public String getRandomLenthName(String name){
        Random random= new Random();
        int length= random.nextInt(10);
        StringBuilder builder= new StringBuilder();
        for (int i=0 ; i<length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
