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
                    "1111111111111111111111111111111",
                    R.drawable.kl_man),
            new Hair("2",
                    "2222222222222222222",
                    R.drawable.ap_man),
            new Hair("3",
                    "333333333333333333333333333333333",
                    R.drawable.ap_ped) };
}
