package com.example.membership;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class GetInforActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_infor);

        //ArrayList<CheckBox> mCheckBoxes = new ArrayList<CheckBox>();

        final CheckBox selector_skintype1 = (CheckBox) findViewById(R.id.join_skintype1);
        final CheckBox selector_skintype2 = (CheckBox) findViewById(R.id.join_skintype2);
        final CheckBox selector_skintype3 = (CheckBox) findViewById(R.id.join_skintype3);

        Button getFinishButton = (Button) findViewById(R.id.get_finish_button);

        selector_skintype1.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    // TODO : CheckBox is checked.
                    Toast.makeText(GetInforActivity.this, "1선택했니?", Toast.LENGTH_SHORT).show();

                    selector_skintype2.setChecked(false);
                    selector_skintype3.setChecked(false);
                } else {
                    // TODO : CheckBox is unchecked.
                    Toast.makeText(GetInforActivity.this, "1선택 취소했니?", Toast.LENGTH_SHORT).show();
                }
            }
        });

        selector_skintype2.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    // TODO : CheckBox is checked.
                    Toast.makeText(GetInforActivity.this, "2선택했니?", Toast.LENGTH_SHORT).show();

                    selector_skintype1.setChecked(false);
                    selector_skintype3.setChecked(false);
                } else {
                    // TODO : CheckBox is unchecked.
                    Toast.makeText(GetInforActivity.this, "2선택 취소했니?", Toast.LENGTH_SHORT).show();
                }
            }
        });

        selector_skintype3.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    // TODO : CheckBox is checked.
                    Toast.makeText(GetInforActivity.this, "3선택했니?", Toast.LENGTH_SHORT).show();

                    selector_skintype1.setChecked(false);
                    selector_skintype2.setChecked(false);
                } else {
                    // TODO : CheckBox is unchecked.
                    Toast.makeText(GetInforActivity.this, "3선택 취소했니?", Toast.LENGTH_SHORT).show();
                }
            }
        });


        getFinishButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(GetInforActivity.this, "저장했니?", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(GetInforActivity.this, TabPagerViewActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
                finish();
            }
        });


    }
}
