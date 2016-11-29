package com.example.master.anroidoneless6;

/**
 * Created by Master on 28.11.2016.
 */

public class Hair extends MyPage {
    public Hair(String name, String description, int imageId){
        super(name, description, imageId);
    }

    public static final Hair[] hairs = {
            new Hair("1",
                    "11",
                    R.drawable.kl_man),
            new Hair("2",
                    "22",
                    R.drawable.ap_man),
            new Hair("3",
                    "33",
                    R.drawable.ap_ped) };
}
