package com.studytrial.homeinstagram

import android.R.color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.SpannableStringBuilder
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.bold
import com.bumptech.glide.Glide
import com.doubletaplistener.DoubleClickListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {
        }
// Caption
        val capt1 = SpannableStringBuilder().bold { append("Temen 1 ") }
            .append("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas pretium aenean pharetra magna ac placerat vestibulum lectus mauris. ")
        tv_feed_caption.setText(capt1)
        val capt2 = SpannableStringBuilder().bold { append("Temen 2 ") }
            .append("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas pretium aenean pharetra magna ac placerat vestibulum lectus mauris. ")
        tv_feed_caption2.setText(capt2)
        val capt3 = SpannableStringBuilder().bold { append("Temen 3 ") }
            .append("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas pretium aenean pharetra magna ac placerat vestibulum lectus mauris. ")
        tv_feed_caption3.setText(capt3)

// Story
        Glide.with(this)
            .load(R.drawable.foto_profil)
            .circleCrop()
            .into(iv_story)
        Glide.with(this)
            .load(R.drawable.foto_profil2)
            .circleCrop()
            .into(iv_story2)
        Glide.with(this)
            .load(R.drawable.foto_profil3)
            .circleCrop()
            .into(iv_story3)
        Glide.with(this)
            .load(R.drawable.foto_profil4)
            .circleCrop()
            .into(iv_story4)
        Glide.with(this)
            .load(R.drawable.foto_profil5)
            .circleCrop()
            .into(iv_story5)
        Glide.with(this)
            .load(R.drawable.foto_profil6)
            .circleCrop()
            .into(iv_story6)

// Prof Pic Feed
        Glide.with(this)
            .load(R.drawable.foto_profil6)
            .circleCrop()
            .into(iv_feed_profile)
        Glide.with(this)
            .load(R.drawable.foto_profil)
            .circleCrop()
            .into(iv_me)
        Glide.with(this)
            .load(R.drawable.foto_profil)
            .circleCrop()
            .into(iv_feed_comment_profile)
        Glide.with(this)
            .load(R.drawable.foto_profil)
            .circleCrop()
            .into(iv_feed_comment_profile2)
        Glide.with(this)
            .load(R.drawable.foto_profil)
            .circleCrop()
            .into(iv_feed_comment_profile3)
        Glide.with(this)
            .load(R.drawable.foto_profil2)
            .circleCrop()
            .into(iv_feed_profile2)
        Glide.with(this)
            .load(R.drawable.foto_profil3)
            .circleCrop()
            .into(iv_feed_profile3)

// Feed
        Glide.with(this)
            .load(R.drawable.feed_1)
            .into(iv_feed)
        Glide.with(this)
            .load(R.drawable.feed_2)
            .into(iv_feed2)
        Glide.with(this)
            .load(R.drawable.feed_3)
            .into(iv_feed3)



// Click hear and Double Tap image to like

        iv_feed_love.setOnClickListener {
            Log.d( "Binar", iv_feed_love.tag.toString())

            if (iv_feed_love.tag.toString() == "notLoved")
                {
                    iv_feed_love.setImageResource(R.drawable.ic_baseline_favorite_24)
                    iv_feed_love.tag = "loved"}
            else {
                iv_feed_love.setImageResource(R.drawable.ic_outline_love)
                iv_feed_love.tag = "notLoved"
            }
        }

        iv_feed_love2.setOnClickListener {
            Log.d( "Binar", iv_feed_love2.tag.toString())

            if (iv_feed_love2.tag.toString() == "notLoved")
            {
                iv_feed_love2.setImageResource(R.drawable.ic_baseline_favorite_24)
                iv_feed_love2.tag = "loved"}
            else {
                iv_feed_love2.setImageResource(R.drawable.ic_outline_love)
                iv_feed_love2.tag = "notLoved"
            }
        }

        iv_feed_love3.setOnClickListener {
            Log.d( "Binar", iv_feed_love3.tag.toString())

            if (iv_feed_love3.tag.toString() == "notLoved")
            {
                iv_feed_love3.setImageResource(R.drawable.ic_baseline_favorite_24)
                iv_feed_love3.tag = "loved"}
            else {
                iv_feed_love3.setImageResource(R.drawable.ic_outline_love)
                iv_feed_love3.tag = "notLoved"
            }
        }

        iv_feed.setOnClickListener(object : DoubleClickListener() {
            override fun onDoubleClick(v: View) {
                Log.d( "Binar", iv_feed_love.tag.toString())

                if (iv_feed_love.tag.toString() == "notLoved")
                {
                    iv_feed_love.setImageResource(R.drawable.ic_baseline_favorite_24)
                    iv_feed_love.tag = "loved"}
                else {
                    iv_feed_love.setImageResource(R.drawable.ic_outline_love)
                    iv_feed_love.tag = "notLoved"
                }
            }
        })

        iv_feed2.setOnClickListener(object : DoubleClickListener() {
            override fun onDoubleClick(v: View) {
                Log.d( "Binar", iv_feed_love2.tag.toString())

                if (iv_feed_love2.tag.toString() == "notLoved")
                {
                    iv_feed_love2.setImageResource(R.drawable.ic_baseline_favorite_24)
                    iv_feed_love2.tag = "loved"}
                else {
                    iv_feed_love2.setImageResource(R.drawable.ic_outline_love)
                    iv_feed_love2.tag = "notLoved"
                }
            }
        })

        iv_feed3.setOnClickListener(object : DoubleClickListener() {
            override fun onDoubleClick(v: View) {
                Log.d( "Binar", iv_feed_love3.tag.toString())

                if (iv_feed_love3.tag.toString() == "notLoved")
                {
                    iv_feed_love3.setImageResource(R.drawable.ic_baseline_favorite_24)
                    iv_feed_love3.tag = "loved"}
                else {
                    iv_feed_love3.setImageResource(R.drawable.ic_outline_love)
                    iv_feed_love3.tag = "notLoved"
                }
            }
        })
    }
}