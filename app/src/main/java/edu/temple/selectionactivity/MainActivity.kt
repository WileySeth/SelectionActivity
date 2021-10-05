package edu.temple.selectionactivity

import android.content.Context
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

        recyclerView.layoutManager = GridLayoutManager(this, 3)


        val textView = findViewById<TextView>(R.id.imageName)
        val imageView = findViewById<ImageView>(R.id.imageView)



        recyclerView.adapter = ImageAdapter(this, getImageData(), textView, imageView)
    }


    fun getImageData() : Array<Image> {
        val images = arrayOf(Image("Mountain in China",R.drawable.cheese1),
            Image("Mountain Fog",R.drawable.cheese2),
            Image("Gravelly Mountaintop",R.drawable.cheese3),
            Image("Spiky Icy Mountains",R.drawable.cheese4),
            Image("Reflection in a lake",R.drawable.cheese5),
            Image("Mountain-top Trail",R.drawable.cheese6),
            Image("Orange Canyon",R.drawable.cheese7),
            Image("Orangish Mountain",R.drawable.cheese8),
            Image("Swiss Alps",R.drawable.cheese9),
            Image("Bucegi Mountains",R.drawable.cheese10),
            Image("Bushy Mountains",R.drawable.cheese11),
            Image("Desert Mountains",R.drawable.cheese12),
        );
        return images
    }
}