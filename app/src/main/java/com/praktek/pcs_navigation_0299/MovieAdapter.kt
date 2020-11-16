package com.praktek.pcs_navigation_0299

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class MovieAdapter ( private val listMovie:ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ListViewHolder>(){
    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int ): ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent, false )
        return ListViewHolder(view)
    }
    override fun onBindViewHolder (holder: ListViewHolder , position: Int ) {
        holder.bind(listMovie[position])
    }
    override fun getItemCount (): Int {
        return listMovie.size
    }
    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind (movie: Movie ) {
            with(itemView){
                txtTitle.text = movie.title
                val txtYear
                txtYear.text = movie.year
            }
        }
    }
}
    }