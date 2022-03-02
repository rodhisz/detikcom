package com.example.detikcom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikcom.newsadapter.NewsAdapter
import com.example.detikcom.newsadapter.NewsModel
import com.example.detikcom.newsadapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headlinenews: news?
        if (NewsModel.newslist.size > 0) {
            headlinenews = NewsModel.newslist[NewsModel.newslist.size - 1]
            tv_title_headline.setText(headlinenews.title)
            img_utama.setImageResource(headlinenews.photo)

            cv_newsheadline.setOnClickListener {
                val intent_detail = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cons_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_KontenNews, headlinenews.desc)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.toString())
                    }

                startActivity(intent_detail)
                finish()
            }
        }
        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rc_daftarBerita.layoutManager = layManager
        newsAdapter = NewsAdapter(this, NewsModel.newslist)
        rc_daftarBerita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object :NewsAdapter.OnItemClickCallback{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cons_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                    }

                startActivity(intent)
                finish()
            }
        })
    }
}