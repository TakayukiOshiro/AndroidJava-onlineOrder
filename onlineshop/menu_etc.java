package com.takayuki.oshiro.android.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class menu_etc extends AppCompatActivity {
    private int _etclId;
    private String _etcName = "";
    private String _drinkExplaination = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_etc);

        ListView lvEtc = findViewById(R.id.lvEtcList);
        lvEtc.setOnItemClickListener(new ListItemCLickListener());
    }

    private class ListItemCLickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            _etclId = position;

            _etcName = (String) parent.getItemAtPosition(position);

            TextView tvCocktailName = findViewById(R.id.drink);
            tvCocktailName.setText(_etcName);

            TextView tvExplain = findViewById(R.id.textView);
            switch(_etcName){
                case "ウィスキー":
                    _drinkExplaination = "男は黙ってストレート。女は艶やかにロック";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ワイン":
                    _drinkExplaination = "居酒屋のワインを不味いと言えばワイン通であるとは限らないぞ";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ジン":
                    _drinkExplaination = "ストレートでも飲めるけど割ったほうが美味しかったりする";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "テキーラ":
                    _drinkExplaination = "1shot 1kill";
                    tvExplain.setText(_drinkExplaination);
                    break;

                case "ウォッカ":
                    _drinkExplaination = "あなたはウォッカ派？ヴォトカ派？";
                    tvExplain.setText(_drinkExplaination);
                    break;

            }

        }
    }

    public void onBackButtonClick(View view){
        finish();
    }
}