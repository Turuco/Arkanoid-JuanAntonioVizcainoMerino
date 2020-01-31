package com.example.arkanoid_juanantoniovizcainomerino;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;

public class ArkanoidActivity extends MainMenu {
    ArkanoidSurfaceView arkSurfaceView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        arkSurfaceView=new ArkanoidSurfaceView(this);
        super.onCreate(savedInstanceState);
    }
}
