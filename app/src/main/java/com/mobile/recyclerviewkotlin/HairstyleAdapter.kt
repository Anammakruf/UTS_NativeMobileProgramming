package com.mobile.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HairstyleAdapter(private val context: Context, private val hairstyles: List<Hairstyle>, val listener: (Hairstyle) -> Unit)
    : RecyclerView.Adapter<HairstyleAdapter.SuperheroViewHolder>(){

    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgHairstyle = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHairstyle= view.findViewById<TextView>(R.id.tv_item_name)
        val descHairstyle = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(hairstyle: Hairstyle, listener: (Hairstyle) -> Unit){
            imgHairstyle.setImageResource(hairstyle.imgHairstyle)
            nameHairstyle.text = hairstyle.nameHairstyle
            descHairstyle.text = hairstyle.descHairstyle
            itemView.setOnClickListener{
                (listener(hairstyle))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_hairstyle, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
     holder.bindView(hairstyles[position], listener)
    }

    override fun getItemCount(): Int = hairstyles.size
    }


