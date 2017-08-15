package com.example.administrator.shoppingcart.datas;



import com.example.administrator.shoppingcart.model.ShoppingModel;

import java.util.ArrayList;
import java.util.List;


public class AppConfig {


    public static List<ShoppingModel> factoryFoods() {
        List<ShoppingModel> datas = new ArrayList<>();
        datas.add(new ShoppingModel(1, "抽纸20", "http://foodqs.cn/memberpicture/landiaoxianguo200679132637.jpg", "20包抽纸装...", 0,100.00));

        datas.add(new ShoppingModel(2, "卷纸20", "https://encrypted-tbn3.gstatic.com/images?" +
                "q=tbn:ANd9GcSNDDaaVc0k3pq5E-lD2lvfqiHJu5nD61-gd2Npi2Odc5dts9KR", "20包卷纸装...", 0,100.00));

        datas.add(new ShoppingModel(3, "抽纸30", "http://sucai.dabaoku.com/zhiwu/shuiguo/er122.jpg", "30包抽纸装...", 0,145.00));

        datas.add(new ShoppingModel(4, "卷纸30", "http://img.xinggan.com/uploads/allimg/130531/1_130531135001_1.jpg", "30包卷纸装...",0,145.00));

        return datas;
    }

}
