package com.example.master.anroidoneless6;

/**
 * Created by Master on 28.11.2016.
 */

public abstract class MyPage {
    private String name;
    private String description;
    private int    imageId;

    protected MyPage(String name, String description, int imageId){
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    protected String getName() {
        return name;
    }

    protected String getDescription() {
        return description;
    }

    protected int getImageId() {
        return imageId;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
