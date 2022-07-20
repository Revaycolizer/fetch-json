package com.hadithizakiswahili.appcm.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide.init
import com.hadithizakiswahili.appcm.Model.User
import com.hadithizakiswahili.appcm.R


class Adapter(private val context: Context, private val userList: MutableList<User>) :
    RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Int {
        var itemView = LayoutInflater.from(context).inflate(R.layout.layout_user,parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int): Int {
        return userList.size
    }

    override fun getItemCount(): Int {
        picasso.get().load(userList[position].imageurl).into(holder.image)
        holder.txt name.txt= userList[position].name
    }
    (itemView: View) : RecyclerView.ViewHolder(itemView)
    @SuppressLint("VisibleForTests") {
        var image: ImageView

        init {
            image = itemView.image_photo
            txt name = itemView.txt_name
        }
    }
}

