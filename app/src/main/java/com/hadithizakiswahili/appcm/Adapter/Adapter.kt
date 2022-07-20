package com.hadithizakiswahili.appcm.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.init
import com.hadithizakiswahili.appcm.Model.User
import com.hadithizakiswahili.appcm.Property
import com.hadithizakiswahili.appcm.R


class Adapter(private val context: Context, private val userList: MutableList<User>) :
class MyViewHolder(val view: View): RecyclerView.ViewHolder(view){

    fun bind(property: Property){
        val title = view.findViewById<TextView>(R.id.recycler_view)
        val imageView = view.findViewById<ImageView>(R.id.listView)
        val description = view.findViewById<TextView>(R.id.tvName)

        title.text = property.title
        description.text = property.description

        Glide.with(view.context).load(property.image).centerCrop().into(imageView)
    }
}

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_photo, parent, false)
    return MyViewHolder(v)
}

override fun getItemCount(): Int {
    return data.size
}

override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    holder.bind(data[position])
}


}