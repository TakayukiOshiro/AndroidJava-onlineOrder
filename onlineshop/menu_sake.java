package com.takayuki.oshiro.android.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class menu_sake extends AppCompatActivity {
    private int _sakeId;
    private String _sakeName = "";
    private String _drinkExplaination = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sake);

        ListView lvSake = findViewById(R.id.lvSakeList);
        lvSake.setOnItemClickListener(new ListItemCLickListener());
    }

    private class ListItemCLickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            _sakeId = position;

            _sakeName = (String) parent.getItemAtPosition(position);

            TextView tvCocktailName = findViewById(R.id.drink);
            tvCocktailName.setText(_sakeName);

            TextView tvExplain = findViewById(R.id.textView);
            switch(_sakeName){
                case "獺祭":
                    _drinkExplaination = "日本酒の王道。これが苦手なら日本酒は諦めた方がいいかも";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "八海山":
                    _drinkExplaination = "八海山好きな人はお酒強い気がする";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "紀土":
                    _drinkExplaination = "甘口日本酒。獺祭が無理だった人の最後の手綱";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "酔鯨":
                    _drinkExplaination = "インフルエンサーが紹介して品切れになった日本酒。うまい";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "上善如水":
                    _drinkExplaination = "水の如くグビグビ飲める。悪酔い注意";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "おまかせ":
                    _drinkExplaination = "メニューに記載されていない日本酒を勝手にチョイス";
                    tvExplain.setText(_drinkExplaination);
                    break;
            }

        }
    }

    public void onBackButtonClick(View view){
        finish();
    }
}