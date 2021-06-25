package com.takayuki.oshiro.android.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class menu_sour extends AppCompatActivity {

    private int _sourlId;
    private String _sourName = "";
    private String _drinkExplaination = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sour);

        ListView lvsour = findViewById(R.id.lvSourList);
        lvsour.setOnItemClickListener(new ListItemCLickListener());
    }

    private class ListItemCLickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            _sourlId = position;

            _sourName = (String) parent.getItemAtPosition(position);

            TextView tvCocktailName = findViewById(R.id.drink);
            tvCocktailName.setText(_sourName);

            TextView tvExplain = findViewById(R.id.textView);
            switch(_sourName){
                case "コーラサワー":
                    _drinkExplaination = "コーラサワー。どんどん飲もう。";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "カルピスサワー":
                    _drinkExplaination = "見た目はカルピス。中身はお酒。その名は、カルピスサワー";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "レモンサワー":
                    _drinkExplaination = "世界中のレモンを食べ尽くしたMr.檸檬監修によるレモンサワー";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "はちみつサワー":
                    _drinkExplaination = "はちみつサワーの味がするはちみつサワー";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "緑茶サワー":
                    _drinkExplaination = "「明日仕事あるから緑茶サワー」";
                    tvExplain.setText(_drinkExplaination);
                    break;
            }

        }
    }

    public void onBackButtonClick(View view){
        finish();
    }
}