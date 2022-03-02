package com.example.detikcom.newsadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikcom.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.berita.view.*

class NewsAdapter (val context: Context, val listnews: List<news>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentNews: news? = null
        var curentPosition: Int = 0

        fun setData(currnews: news, pos: Int){

            itemView.tv_title.text = currnews!!.title
            itemView.img_news.setImageResource(currnews!!.photo)

            this.currentNews
            this.curentPosition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.berita, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener(){onItemClickCallback.onItemClick(listnews[position])}
    }

    // region 1. Event Click
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClick(data: news)
    }

    //endregion
}