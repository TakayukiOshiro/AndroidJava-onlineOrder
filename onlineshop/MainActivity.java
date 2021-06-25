package com.takayuki.oshiro.android.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

//    ListView lvItemList = findViewById(R.id.lvItems);
//    ListView lvCocktail = findViewById(R.id.lvCocktailList);
//    ListView lvEtc = findViewById(R.id.lvEtcList);
//    ListView lvSake = findViewById(R.id.lvSakeList);
//    ListView lvSoftdrink = findViewById(R.id.lvSoftdrinkList);
//    ListView lvSour = findViewById(R.id.lvSourList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvItemList = findViewById(R.id.lvItems);
        ListView lvCocktail = findViewById(R.id.lvCocktailList);
        ListView lvEtc = findViewById(R.id.lvEtcList);
        ListView lvSake = findViewById(R.id.lvSakeList);
        ListView lvSoftdrink = findViewById(R.id.lvSoftdrinkList);
        ListView lvSour = findViewById(R.id.lvSourList);


        List<Map<String, String>> itemList = new ArrayList<>();
        Map<String, String> item = new HashMap<>();
        item.put("name", "ソフトドリンク");
        item.put("price", "0");
        itemList.add(item);

        item = new HashMap<>();
        item.put("name", "日本酒");
        item.put("price", "0");
        itemList.add(item);

        item = new HashMap<>();
        item.put("name", "カクテル");
        item.put("price", "0");
        itemList.add(item);

        item = new HashMap<>();
        item.put("name", "サワー");
        item.put("price", "0");
        itemList.add(item);

        item = new HashMap<>();
        item.put("name", "その他");
        item.put("price", "0");
        itemList.add(item);


        //fromデータ
        String[] from = {"name", "price"};

        //toデータ
        int[] to = {android.R.id.text1, android.R.id.text2};

        //SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                itemList, android.R.layout.simple_list_item_2, from, to);

        //アダプタの登録
        lvItemList.setAdapter(adapter);

        lvItemList.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Map<String, String> item = (Map<String, String>) parent.getItemAtPosition(position);

            //名前
            String groupName = item.get("name");
            //金額
            String price = item.get("price");

            switch (groupName){
                case "ソフトドリンク":
                    Intent intent = new Intent(MainActivity.this, menu_softdrink.class);
                    //送るデータ（今回はいらない）
                    //第2の画面起動
                    startActivity(intent);
                    break;

                case "日本酒":
                    intent = new Intent(MainActivity.this, menu_sake.class);
                    //送るデータ（今回はいらない）
                    //第2の画面起動
                    startActivity(intent);
                    break;

                case "カクテル":
                    intent = new Intent(MainActivity.this, menu_cocktail.class);
                    //送るデータ（今回はいらない）
                    //第2の画面起動
                    startActivity(intent);
                    break;

                case "サワー":
                    intent = new Intent(MainActivity.this, menu_sour.class);
                    //送るデータ（今回はいらない）
                    //第2の画面起動
                    startActivity(intent);
                    break;

                case "その他":
                    intent = new Intent(MainActivity.this, menu_etc.class);
                    //送るデータ（今回はいらない）
                    //第2の画面起動
                    startActivity(intent);
                    break;
            }

            //Intent intent = new Intent(MainActivity.this, )
        }
    }
}