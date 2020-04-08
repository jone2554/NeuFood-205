package com.example.neusoftfood_17110100219gcy.beans;

public class FoodInfo {
    /**
     * food_id : 1
     * foodname : 酸菜鱼
     * intro : 地道的川菜
     * pic : http://i3.meishichina.com/attachment/recipe/201203/p320_201203302229311333492101.JPG
     * price : 23.0
     * shop_id : 1
     * type_id : 1
     * recommand : 1
     */

    private String food_id;
    private String foodname;
    private String intro;
    private String pic;
    private String price;
    private String shop_id;
    private int type_id;
    private int recommand;

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public void setRecommand(int recommand) {
        this.recommand = recommand;
    }

    public String getFood_id() {
        return food_id;
    }

    public String getFoodname() {
        return foodname;
    }

    public String getIntro() {
        return intro;
    }

    public String getPic() {
        return pic;
    }

    public String getPrice() {
        return price;
    }

    public String getShop_id() {
        return shop_id;
    }

    public int getType_id() {
        return type_id;
    }

    public int getRecommand() {
        return recommand;
    }
}
