package com.example.q.cs496_app1.tabs.gallery;

import com.example.q.cs496_app1.R;

class Images {
    public String image_titles[] = {
            "고양이1",
            "고양이2",
            "고양이3",
            "고양이4",
            "고양이5",
            "고양이6",
            "고양이7",
            "고양이8",
            "고양이9",
            "고양이10",
            "고양이11",
            "고양이12",
            "고양이13",
    };

    public Integer image_ids[] = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
    };
}

public class MyImage {

    private String image_title;
    private Integer image_id;

    public String getImageTitle() {
        return image_title;
    }

    public void setImageTitle(String title) {
        this.image_title = title;
    }

    public Integer getImageID() {
        return image_id;
    }

    public void setImageID(Integer id) {
        this.image_id = id;
    }
}
