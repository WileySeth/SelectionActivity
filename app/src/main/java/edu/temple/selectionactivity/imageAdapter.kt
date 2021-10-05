package edu.temple.selectionactivity

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.drawable.toBitmap
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ImageAdapter (val _context: Context, _imageObjects: Array<Image>, _textView : TextView, _imageView : ImageView) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private val images = _imageObjects
    private val context = _context
    private val topImageView = _imageView
    private val topTextView = _textView

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView

        init {
            imageView = view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_image, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var img = images[position].resource
        holder.imageView.setImageResource(img)

        var bitmap = holder.imageView.drawable.toBitmap(600, 300)
        var largeBitmap = holder.imageView.drawable.toBitmap(1200, 600)

        holder.imageView.setImageBitmap(bitmap)


        holder.imageView.setOnClickListener {

            val intent = Intent(context, DisplayActivity::class.java).apply {
                putExtra("text", images[position].name)
                putExtra("image", img)
            }

            context.startActivity(intent)
        }
    }


    override fun getItemCount() = images.size


    override fun getItemId(pos: Int): Long {
        return pos.toLong()
    }

}