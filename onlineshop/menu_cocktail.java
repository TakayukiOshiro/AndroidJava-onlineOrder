package com.takayuki.oshiro.android.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class menu_cocktail extends AppCompatActivity {
    private int _cocktailId;
    private String _cocktailName = "";
    private String _drinkExplaination = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cocktail);

        ListView lvCocktail = findViewById(R.id.lvCocktailList);
        lvCocktail.setOnItemClickListener(new ListItemCLickListener());
    }

    private class ListItemCLickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            _cocktailId = position;

            _cocktailName = (String) parent.getItemAtPosition(position);

            TextView tvCocktailName = findViewById(R.id.drink);
            tvCocktailName.setText(_cocktailName);

            TextView tvExplain = findViewById(R.id.textView);
            switch(_cocktailName){
                case "マンハッタン":
                    _drinkExplaination = "マンハッタン。うめえ";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ミシシッピミュール":
                    _drinkExplaination = "アメリカのミシシッピ州で作られたカクテルであってほしい";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ブルーハワイ":
                    _drinkExplaination = "大人のブルーハワイ。かき氷にかけたら最高";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "マイタイ":
                    _drinkExplaination = "マイタイ。これ飲んでる人はバー慣れしているはず";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "マティーニ":
                    _drinkExplaination = "マティーニの飲み方で素人と玄人の差が出る";
                    tvExplain.setText(_drinkExplaination);
                    break;


            }

        }
    }

    public void onBackButtonClick(View view){
        finish();
    }
}