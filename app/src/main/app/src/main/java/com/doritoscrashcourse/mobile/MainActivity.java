package com.doritoscrashcourse.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(20, 25, 45));

        TextView title = new TextView(this);
        title.setText("DORITOS CRASH COURSE");
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("ANDROID PROJECT");
        subtitle.setTextColor(Color.YELLOW);
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
