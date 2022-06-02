package com.tuto.androidBoilerplate;
import com.tuto.androidBoilerplate.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected class DrawView extends View {
        @Override
        void onDraw() {
            super.onDraw();
            curTime = getTime();
            deltaTime = curTime - prevTime();
            aproxFps = 1000 / deltaTime;
            prevTime = curTime;
        }
    }
}