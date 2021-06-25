package com.takayuki.oshiro.android.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

public class menu_softdrink extends AppCompatActivity {

    private int _softdrinkId;
    private String _softdrinkName = "";
    private String _drinkExplaination = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_softdrink);

        ListView lvSoftdrink = findViewById(R.id.lvSoftdrinkList);
        lvSoftdrink.setOnItemClickListener(new ListItemCLickListener());
    }

    private class ListItemCLickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            _softdrinkId = position;

            _softdrinkName = (String) parent.getItemAtPosition(position);

            TextView tvCocktailName = findViewById(R.id.drink);
            tvCocktailName.setText(_softdrinkName);

            TextView tvExplain = findViewById(R.id.textView);
            switch(_softdrinkName){
                case "コーラ":
                    _drinkExplaination = "冷えた瓶に入った美味しいコーラ。HPが100回復する。";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "サイダー":
                    _drinkExplaination = "昔ながらの美味しいサイダー。";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ジンジャーエール":
                    _drinkExplaination = "昔ながらの美味しいジンジャーエール。";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "カルピス":
                    _drinkExplaination = "昔ながらの美味しいカルピス。";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ウーロン茶":
                    _drinkExplaination = "やばいウーロン茶";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "緑茶":
                    _drinkExplaination = "昔ながらの美味しい緑茶。";
                    tvExplain.setText(_drinkExplaination);
                    break;
            }
        }
    }

    public void onConfirmButtonClick(View view){
        //注文しました　の表示
        //未選択に戻す
        //説明を気になる飲み物をメニューから選択してください に戻す
    }

    public void onBackButtonClick(View view){ finish(); }
}