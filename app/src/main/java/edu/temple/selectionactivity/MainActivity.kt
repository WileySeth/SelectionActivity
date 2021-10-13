package edu.temple.selectionactivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val newImages = getImageData();



        recyclerView.layoutManager = GridLayoutManager(this, 3)


        val textView = findViewById<TextView>(R.id.imageName)
        val imageView = findViewById<ImageView>(R.id.imageView)



        recyclerView.adapter = ImageAdapter(this, getImageData(), textView, imageView)


    }


    fun getImageData() : Array<Image> {
        val images = arrayOf(Image("cheese1",R.drawable.cheese1),
            Image("cheese2",R.drawable.cheese2),
            Image("cheese3",R.drawable.cheese3),
            Image("cheese4",R.drawable.cheese4),
            Image("cheese5",R.drawable.cheese5),
            Image("cheese6",R.drawable.cheese6),
            Image("cheese7",R.drawable.cheese7),
            Image("cheese8",R.drawable.cheese8),
            Image("cheese9",R.drawable.cheese9),
            Image("cheese10",R.drawable.cheese10),
            Image("cheese11",R.drawable.cheese11),
            Image("cheese12",R.drawable.cheese12),
        );
        return images
    }


}