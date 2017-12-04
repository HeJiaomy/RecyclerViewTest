package com.recycleviewtest.bean;

import android.widget.ImageView;

/**
 * Created by 12191 on 2017/12/4.
 */

public class Fruit {
    public int fruitImg;
    public String fruitName;

    public Fruit(int fruitImg, String fruitName) {
        this.fruitImg = fruitImg;
        this.fruitName = fruitName;
    }

    public int getFruitImg() {
        return fruitImg;
    }

    public void setFruitImg(int fruitImg) {
        this.fruitImg = fruitImg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitImg=" + fruitImg +
                ", fruitName='" + fruitName + '\'' +
                '}';
    }
}
