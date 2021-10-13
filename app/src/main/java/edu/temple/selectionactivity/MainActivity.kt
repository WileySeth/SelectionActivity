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
        val newFrenchStuff = resources.getStringArray(R.array.cheese)
        val images = arrayOf(Image(newFrenchStuff[0], R.drawable.cheese1),
                            Image(newFrenchStuff[1],R.drawable.cheese2),
                            Image(newFrenchStuff[2],R.drawable.cheese3),
                            Image(newFrenchStuff[3],R.drawable.cheese4),
                            Image(newFrenchStuff[4],R.drawable.cheese5),
                            Image(newFrenchStuff[5],R.drawable.cheese6),
                            Image(newFrenchStuff[6],R.drawable.cheese7),
                            Image(newFrenchStuff[7],R.drawable.cheese8),
                            Image(newFrenchStuff[8],R.drawable.cheese9),
                            Image(newFrenchStuff[9],R.drawable.cheese10),
                            Image(newFrenchStuff[10],R.drawable.cheese11),
                            Image(newFrenchStuff[11],R.drawable.cheese12),
        );
        return images
    }


}