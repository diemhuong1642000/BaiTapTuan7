package com.example.customlistviewexample;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customlistviewexample.R;
import com.example.customlistviewexample.LanguageAdapter;
import com.example.customlistviewexample.Language;
import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;
    ImageView icon_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);
        icon_right = (ImageView) findViewById(R.id.right_icon);
        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Tăng Thị Diễm Hương"));
        listLanguage.add(new Language(2, "Lê Thị Kim Thoa"));
        listLanguage.add(new Language(3, "Nguyễn Văn Anh"));
        listLanguage.add(new Language(4, "Văn Mai Hương"));
        listLanguage.add(new Language(5, "Trần Thị Thùy Linh"));
        listLanguage.add(new Language(6, "Nguyễn Văn Binh"));


        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);
        icon_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( CustomListViewExampleActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });


    }
}