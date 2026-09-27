package com.example.pr22shterk;
import com.example.gesturesapp.OnSwipeTouchListener;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // ToggleButton
        ToggleButton tbMode = findViewById(R.id.tbMode);
        TextView tvModeState = findViewById(R.id.tvModeState);

        tbMode.setOnCheckedChangeListener((buttonView, isChecked) ->
                tvModeState.setText("Режим: " + (isChecked ? "ВКЛ" : "ВЫКЛ")));

        // Свайп влево → назад на Экран 2
        findViewById(R.id.third_layout).setOnTouchListener(
                new OnSwipeTouchListener(this) {
                    @Override
                    public void onSwipeLeft() {
                        Toast.makeText(ThirdActivity.this,
                                "Свайп влево", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
    }
}