package com.example.pr22shterk;
import com.example.gesturesapp.OnSwipeTouchListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Радиокнопки
        RadioGroup rgDifficulty = findViewById(R.id.rgDifficulty);
        TextView tvDifficulty = findViewById(R.id.tvDifficulty);

        rgDifficulty.setOnCheckedChangeListener((group, checkedId) -> {
            String text;
            if (checkedId == R.id.rbEasy) text = "Лёгкая";
            else if (checkedId == R.id.rbMedium) text = "Средняя";
            else text = "Сложная";
            tvDifficulty.setText("Выбрано: " + text);
        });

        // Свайп вправо → Экран 3
        findViewById(R.id.second_layout).setOnTouchListener(
                new OnSwipeTouchListener(this) {
                    @Override
                    public void onSwipeRight() {
                        Toast.makeText(SecondActivity.this,
                                "Свайп вправо", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        startActivity(intent);
                    }
                });
    }
}