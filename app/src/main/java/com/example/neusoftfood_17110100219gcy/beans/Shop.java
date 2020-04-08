package com.example.neusoftfood_17110100219gcy.beans;

import com.google.gson.annotations.SerializedName;

public class Shop {
    /**
     * shop_id : 1
     * shopname : 满口香川菜2
     * address : 东软食堂三期
     * phonenum : 12345678901
     * intro : 地道的川菜
     * pic : http://img3.redocn.com/tupian/20141126/xiangxiwaipocai_3613936.jpg
     * comment : null
     * level : 5
     */
    @SerializedName("shop_id")
    private String shop_id;
    @SerializedName("shopname")
    private String shopname;
    @SerializedName("address")
    private String address;
    @SerializedName("phonenum")
    private String phonenum;
    @SerializedName("intro")
    private String intro;
    @SerializedName("pic")
    private String pic;
    @SerializedName("comment")
    private String comment;
    @SerializedName("level")
    private int level;


    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getShop_id() {
        return shop_id;
    }

    public String getShopname() {
        return shopname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getIntro() {
        return intro;
    }

    public String getPic() {
        return pic;
    }

    public String getComment() {
        return comment;
    }

    public int getLevel() {
        return level;
    }
}
