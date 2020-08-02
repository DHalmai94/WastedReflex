package com.wastedreflex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//AdMob: Initialize Mobile Ads SDK
        MobileAds.initialize(this) {}
//AdMob: Banner
        mAdView = findViewById(R.id.adViewBanner)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }
}