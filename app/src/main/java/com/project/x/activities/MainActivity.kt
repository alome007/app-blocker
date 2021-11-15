package com.project.x.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.x.R
import android.content.pm.ApplicationInfo

import android.app.ActivityManager
import android.content.Context

import android.content.pm.PackageManager
import android.content.pm.ResolveInfo

import android.content.Intent
import android.util.Log
import java.util.stream.Collectors


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}