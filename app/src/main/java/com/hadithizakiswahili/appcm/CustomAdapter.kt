package com.hadithizakiswahili.appcm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.load.model.Model

class CustomAdapter(context: Context,arrayListDetails:ArrayList<Model>) : BaseAdapter(){

    private val layoutInflater: LayoutInflater
    private val arrayListDetails:ArrayList<Model>

    init {
        this.layoutInflater = LayoutInflater.from(context)
        this.arrayListDetails=arrayListDetails
    }

    override fun getCount(): Int {
        return arrayListDetails.size
    }

    override fun getItem(position: Int): Any {
        return arrayListDetails.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val view: View?
        val listRowHolder: ListRowHolder
        if (convertView == null) {
            view = this.layoutInflater.inflate(R.layout.adapter, parent, false)
            listRowHolder = ListRowHolder(view)
            view.tag = listRowHolder
        } else {
            view = convertView
            listRowHolder = view.tag as ListRowHolder
        }

        listRowHolder.tvName.text = arrayListDetails.get(position).name
        listRowHolder.tvEmail.text = arrayListDetails.get(position).Email
        listRowHolder.tvId.text = arrayListDetails.get(position).id
        return view
    }
}

private class ListRowHolder(row: View?) {
    private var tvWebsite: TextView
    private var tvCompany: TextView
    private var tvCatchPhrase: TextView
    private var tvPhone: TextView
    private var tvLng: TextView
    private var tvBs: TextView
    private var tvLat: TextView
    private var tvZipcode: TextView
    private var tvCity: TextView
    private var tvStreet: TextView
    private var tvAddress: TextView
    private var tvUsername: TextView
    public val tvName: TextView
    public val tvEmail: TextView
    public val tvId: TextView
    public val linearLayout: LinearLayout

    init {
        this.tvId = row?.findViewById<TextView>(R.id.tvId) as TextView
        this.tvName = row?.findViewById<TextView>(R.id.tvName) as TextView
        this.tvEmail = row?.findViewById<TextView>(R.id.tvEmail) as TextView
        this.tvUsername = row?.findViewById<TextView>(R.id.tvUsername) as TextView
        this.tvAddress = row?.findViewById<TextView>(R.id.tvAddress) as TextView
        this.tvStreet = row?.findViewById<TextView>(R.id.tvStreet) as TextView
        this.tvCity = row?.findViewById<TextView>(R.id.tvCity) as TextView
        this.tvZipcode = row?.findViewById<TextView>(R.id.tvZipcode) as TextView
        this.tvLat = row?.findViewById<TextView>(R.id.tvLat) as TextView
        this.tvLng = row?.findViewById<TextView>(R.id.tvLng) as TextView
        this.tvPhone = row?.findViewById<TextView>(R.id.tvPhone) as TextView
        this.tvWebsite = row?.findViewById<TextView>(R.id.tvWebsite) as TextView
        this.tvCompany = row?.findViewById<TextView>(R.id.tvCompany) as TextView
        this.tvCatchPhrase = row?.findViewById<TextView>(R.id.tvCatchPhrase) as TextView
        this.tvBs = row?.findViewById<TextView>(R.id.tvBs) as TextView

        this.linearLayout = row?.findViewById<LinearLayout>(R.id.linearLayout) as LinearLayout
    }
}    