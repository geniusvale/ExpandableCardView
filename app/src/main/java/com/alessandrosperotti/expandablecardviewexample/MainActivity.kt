package com.alessandrosperotti.expandablecardviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card : com.alespero.expandablecardview.ExpandableCardView = findViewById(R.id.mycard)

        card.setOnClickListener({
            if(card.isExpanded) card.collapse()
            else card.expand()
        })
    }

}
