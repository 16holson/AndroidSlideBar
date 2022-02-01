package edu.weber.w01311060.slidebars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements SeekBarFragment.onSeekUpdate
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSeekBarProgress(int progress)
    {
        Log.d("MainActivity", "" + progress);
    }
}